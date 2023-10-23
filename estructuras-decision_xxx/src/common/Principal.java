package common;

public class Principal {

	public static void main(String[] args) {

		// IF

		int xx = -20;
		int yy = 54;

		// System.out.println(xx<=0 || yy>70);

		// AND OR NOT DIFERENTE DE
		// true false true
		if (xx != -20) {
			System.out.println("Verdadero");
		} else {
			System.out.println("Falso");
		}

		// En una tienda, dependiendo del dia de la semana y del total a pagar
		/*
		 * Se realizan descuentos Si es mayor o igual a 500 Los lunes se tiene 3% desc
		 * Los Martes se tiene 5% desc Los Miercoles se tiene 7% desc Los Jueves se
		 * tiene 9% desc Los Viernes se tiene 11% desc
		 * 
		 * Si el precio no pasa de 500, el descuento todos los dias es del 2%
		 */

		int total = 700;
		double descuento = 0;
		String dia = "Martes";
		switch (dia) {
		case "Lunes":
			descuento = total * 0.97;
			System.out.println("A pagar: "+descuento);
			break;
		case "Martes":
			descuento = total * 0.95;
			System.out.println("A pagar: "+descuento);
			break;
		case "Miercoles":
			descuento = total * 0.93;
			System.out.println("A pagar: "+descuento);
			break;
		case "Jueves":
			descuento = total * 0.91;
			System.out.println("A pagar: "+descuento);
			break;
		case "Viernes":
			descuento = total * 0.89;
			System.out.println("A pagar: "+descuento);
			break;			
			default:
				System.out.println("Pago completo");
		}

//		if(total<500) {
//			descuento = total * 0.98;
//		}else {
//			if(dia.equals("Lunes")) {
//				descuento = total * 0.97;
//				System.out.println("A pagar: "+descuento);
//			}else if(dia.equals("Martes")) {
//				descuento = total * 0.95;
//				System.out.println("A pagar: "+descuento);
//			}else if(dia.equals("Miercoles")) {
//				descuento = total * 0.93;
//				System.out.println("A pagar: "+descuento);
//			}else if(dia.equals("Jueves")) {
//				descuento = total * 0.91;
//				System.out.println("A pagar: "+descuento);
//			}else if(dia.equals("Viernes")) {
//				descuento = total * 0.89;
//				System.out.println("A pagar: "+descuento);
//			}else {
//				System.out.println("No aplica descuento, pago completo");
//			}			
//		}

	}

}
