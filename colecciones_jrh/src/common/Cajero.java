package common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cajero implements IOperaciones {

	String dirrecion;
	int folio;
	List<Cuenta> cuentas = new ArrayList<Cuenta>();

	public Cajero(String dirrecion, int folio, List<Cuenta> cuentas) {
		super();
		this.dirrecion = dirrecion;
		this.folio = folio;
		this.cuentas = cuentas;
	}

	public String getDirrecion() {
		return dirrecion;
	}

	public void setDirrecion(String dirrecion) {
		this.dirrecion = dirrecion;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public List<Object> retirar(Cuenta origen, double monto) {

		Ticket ticket = null;
		List<Object> datos = new ArrayList<Object>();

		if (cuentas.contains(origen)) {

			if (origen.getSaldoDisponible() < monto) {

				System.out.println("Fondos insuficientes");

			} else if (origen.getSaldoDisponible() - monto < origen.getMin()) {
				System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
			} else {
				origen.setSaldoDisponible(origen.getSaldoDisponible() - monto);
				ticket = new Ticket(this.getDirrecion(), this.folio = this.folio + 1, origen.getSaldoDisponible(),
						"RETIRO", new Date());
				datos.add(ticket);
				datos.add(monto);
			}

		} else {
			System.out.println("La cuenta no exite");
		}
		return datos;
	}

	@Override
	public Ticket depositar(Cuenta destino, double monto) {

		Ticket ticket = null;

		if (cuentas.contains(destino)) {

			if (monto > destino.getMax()) {

				System.out.println("El monto supera el maximo permitido de la cuenta");
			} else if (destino.getSaldoDisponible() + monto > destino.getMax()) {
				System.out.println("El deposito excederia el maximo");
			} else {
				destino.setSaldoDisponible(destino.getSaldoDisponible() + monto);
				ticket = new Ticket(this.getDirrecion(), this.folio = this.folio + 1, destino.getSaldoDisponible(),
						"DEPOSITO", new Date());
			}

		} else {
			System.out.println("La cuenta no exite");
		}
		return ticket;
	}

	@Override
	public Ticket transferir(Cuenta origen, Cuenta destino, double monto) {

		Ticket ticket = null;

		if (cuentas.contains(origen) && cuentas.contains(destino)) {

			if (origen.getSaldoDisponible() < monto) {

				System.out.println("Fondos insuficientes");

			} else if (origen.getSaldoDisponible() - monto < origen.getMin()) {

				System.out.println("El retiro dejaria por debajo del minimo a la cuenta");

			} else {

				if (monto > destino.getMax()) {

					System.out.println("El monto supera el maximo permitido de la cuenta");

				} else if (destino.getSaldoDisponible() + monto > destino.getMax()) {

					System.out.println("El deposito excederia el maximo");

				} else {

					origen.setSaldoDisponible(origen.getSaldoDisponible() - monto);
					destino.setSaldoDisponible(destino.getSaldoDisponible() + monto);
					ticket = new Ticket(this.getDirrecion(), this.folio = this.folio + 1, origen.getSaldoDisponible(),
							"TRANSFERENCIA", new Date());
				}
			}

		} else {
			System.out.println("Alguna de las cuentas no existe");
		}

		return ticket;
	}

}
