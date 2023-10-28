package common;

public class Autos {

	String modelo;
	String marca;
	int a�o;
	double precio; 
	String color;
	
	public Autos() {
		super();
	}
	
	public Autos(String modelo, String marca, int a�o, double precio, String color) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.a�o = a�o;
		this.precio = precio;
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Autos [modelo=" + modelo + ", marca=" + marca + ", a�o=" + a�o + ", precio=" + precio + ", color="
				+ color + "]";
	}
	
	
}
