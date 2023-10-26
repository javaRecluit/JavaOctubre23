package common;

public abstract class Profesionista {

	String carrera;
	String celula;
	
	public Profesionista() {
		super();
	}
	
	public Profesionista(String carrera, String celula) {
		super();
		this.carrera = carrera;
		this.celula = celula;
	}
	
	public abstract void trabajar();
	
	
}
