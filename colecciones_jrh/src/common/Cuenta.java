package common;

public class Cuenta {
	
	String cliente;
	String numCuenta;
	double saldoDisponible;
	String clabe;
	double max;
	double min;
	
	public Cuenta() {
		super();
	}

	public Cuenta(String cliente, String numCuenta, double saldoDisponible, String clabe, double max, double min) {
		super();
		this.cliente = cliente;
		this.numCuenta = numCuenta;
		this.saldoDisponible = saldoDisponible;
		this.clabe = clabe;
		this.max = max;
		this.min = min;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	public String getClabe() {
		return clabe;
	}

	public void setClabe(String clabe) {
		this.clabe = clabe;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	@Override
	public String toString() {
		return "Cuenta [cliente=" + cliente + ", numCuenta=" + numCuenta + ", saldoDisponible=" + saldoDisponible
				+ ", clabe=" + clabe + ", max=" + max + ", min=" + min + "]";
	}
	
	
	
}
