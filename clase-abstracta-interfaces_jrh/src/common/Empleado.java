package common;

public abstract class Empleado {

	String numEmpleado;
	String nombre;
	int edad;
	
	public Empleado() {
		
	}

	public Empleado(String numEmpleado, String nombre, int edad) {
		super();
		this.numEmpleado = numEmpleado;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public abstract void salario();
	
	public abstract void funciones();
	
	
	
}
