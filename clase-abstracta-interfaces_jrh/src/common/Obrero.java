package common;

public class Obrero extends Empleado{

	@Override
	public void salario() {
		
		System.out.println("Salario: $30,000.00");
		
	}
	
	@Override
	public void funciones() {
		
		System.out.println("Realizar labor fisica");
		
	}
}
