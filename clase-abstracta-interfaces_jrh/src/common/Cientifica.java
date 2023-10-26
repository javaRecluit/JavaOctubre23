package common;

public class Cientifica extends Calculadora implements ICalculadoraBasica, ICalculadoraCientifica{

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

	@Override
	public void raizCuadrada() {
		System.out.println("RAIZ CUADRADA");
		
	}

	@Override
	public void sen() {
		System.out.println("SEN");
		
	}

	@Override
	public void cos() {
		System.out.println("COS");
		
	}

	@Override
	public void tan() {
		System.out.println("TAN");
		
	}
}
