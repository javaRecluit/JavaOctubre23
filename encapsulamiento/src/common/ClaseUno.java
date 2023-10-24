package common;

public class ClaseUno {
	private String mensaje;
	protected double decimal;
	public int entero;
	
	
	public ClaseUno() {
	}

	public ClaseUno(String mensaje, double decimal, int entero) {
		super();
		this.mensaje = mensaje;
		this.decimal = decimal;
		this.entero = entero;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public double getDecimal() {
		return decimal;
	}

	public void setDecimal(double decimal) {
		this.decimal = decimal;
	}

	public int getEntero() {
		return entero;
	}

	public void setEntero(int entero) {
		this.entero = entero;
	}
	
	

	
}
