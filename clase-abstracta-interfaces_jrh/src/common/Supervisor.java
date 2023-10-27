package common;

public class Supervisor extends Empleado{

	@Override
	public void salario() {
		
		System.out.println("Salario: $40,000.00");
		
	}
	
	@Override
	public void funciones() {
		
		System.out.println("Supervisar a los demas empleados");
		
	}
}
