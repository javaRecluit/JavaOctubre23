package common;

public class Gerente extends Empleado{

	@Override
	public void salario() {
		
		System.out.println("Salario: $50,000.00");
		
	}
	
	@Override
	public void funciones() {
		
		System.out.println("Llevar control del negocio");
		
	}
	
	
}
