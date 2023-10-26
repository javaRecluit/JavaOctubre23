package common;

public class Basica extends Calculadora implements ICalculadoraBasica{

	@Override
	public void encender() {
		System.out.println("ENCENDER");
		
	}

	@Override
	public void apagar() {
		System.out.println("APAGAR");
		
	}

	@Override
	public void sumar() {
		System.out.println("SUMAR");
		
	}

	@Override
	public void restar() {
		System.out.println("RESTAR");
		
	}

	@Override
	public void multiplicar() {
		System.out.println("MULTIPLICAR");
		
	}

	@Override
	public void dividir() {
		System.out.println("DIVIDIR");
		
	}

	
}
