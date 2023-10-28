package common;

public abstract class Calculadora {

	String marca;
	String precio;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, String precio) {
		super();
		this.marca = marca;
		this.precio = precio;
	}
	
	public abstract void encender();
	
	public abstract void apagar();
	
	
}
