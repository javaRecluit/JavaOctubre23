package common;

import java.util.Date;

public class Ticket {

	String direccion;
	int folio;
	double saldoDisponible;
	String tipoOperacion;
	Date fecha;
	
	public Ticket(String direccion, int folio, double saldoDisponible, String tipoOperacion, Date fecha) {
		super();
		this.direccion = direccion;
		this.folio = folio;
		this.saldoDisponible = saldoDisponible;
		this.tipoOperacion = tipoOperacion;
		this.fecha = fecha;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public double getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Ticket [direccion=" + direccion + ", folio=" + folio + ", saldoDisponible=" + saldoDisponible
				+ ", tipoOperacion=" + tipoOperacion + ", fecha=" + fecha + "]";
	}
	
	
}
