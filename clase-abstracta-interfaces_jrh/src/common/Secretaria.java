package common;

public class Secretaria extends Empleado{

	@Override
	public void salario() {
		
		System.out.println("Salario: $30,000.00");
		
	}
	
	@Override
	public void funciones() {
		
		System.out.println("Manejar la informaci�n, enviar correo");
		
	}
}
