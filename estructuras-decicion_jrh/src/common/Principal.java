package common;

public class Principal {

	public static void main(String[] args) {

		int total = 700;
		double descuento = 0;
		String dia = "jueves";

		if (total < 500) {

			descuento = total * 0.98;

		} else {

			/*
			 * if (dia.equals("Lunes")) {
			 * 
			 * descuento = total * 0.97; System.out.println("A pegar: " + descuento);
			 * 
			 * } else if (dia.equals("Martes")) {
			 * 
			 * descuento = total * 0.95; System.out.println("A pegar: " + descuento);
			 * 
			 * } else if (dia.equals("Miercoles")) {
			 * 
			 * descuento = total * 0.93; System.out.println("A pegar: " + descuento);
			 * 
			 * } else if (dia.equals("Jueves")) {
			 * 
			 * descuento = total * 0.91; System.out.println("A pegar: " + descuento);
			 * 
			 * } else if (dia.equals("Viernes")) {
			 * 
			 * descuento = total * 0.89; System.out.println("A pegar: " + descuento);
			 * 
			 * } else { System.out.println("No aplica descuento."); }
			 */

			switch (dia) {
			case "Lunes":

				descuento = total * 0.97;
				System.out.println("A pegar: " + descuento);

				break;
			case "Martes":

				descuento = total * 0.95;
				System.out.println("A pegar: " + descuento);

				break;
			case "Miercoles":

				descuento = total * 0.93;
				System.out.println("A pegar: " + descuento);

				break;
			case "Jueves":

				descuento = total * 0.91;
				System.out.println("A pegar: " + descuento);

				break;
			case "Viernes":

				descuento = total * 0.89;
				System.out.println("A pegar: " + descuento);

				break;

			default:

				System.out.println("No aplica descuento.");

				break;
			}
		}

	}

}
