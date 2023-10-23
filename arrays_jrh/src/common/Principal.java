package common;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Llenar un array con su nombre y edad
		 * 
		 * Recorrer el array y de cada letra, construir un string que contenga la
		 * siguiente letra de cada una de las letras de su nombre y de los números, el
		 * numero siguiente.
		 */

		char abecedarioYNumeros[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
				'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		char nombreEdad[] = { 'J', 'E', 'S', 'U', 'Z', '2', '9' };
		String cadenaFinal = "";

		for (int i = 0; i < nombreEdad.length; i++) {

			for (int j = 0; j < abecedarioYNumeros.length; j++) {

				if (nombreEdad[i] == abecedarioYNumeros[j]) {

					if (nombreEdad[i] == 'Z') {
						cadenaFinal = cadenaFinal + 'A';
					} else if (nombreEdad[i] == '9') {
						cadenaFinal = cadenaFinal + '0';
					} else {
						cadenaFinal = cadenaFinal + abecedarioYNumeros[j + 1];
					}
					// KFTVT34
				}
			}
		}
		System.out.println(cadenaFinal);
	}
	
	/*
	 * Llenar un array con números, letras y caracteres
	 * 
	 * Determinar cuantas veces existe cada numero del 0 al 9 en ese array.
	 */
}
