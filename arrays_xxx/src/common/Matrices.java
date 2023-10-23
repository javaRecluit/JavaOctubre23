package common;

import java.util.Arrays;

public class Matrices {
	
	public static void main(String[] args) {
		
		//Inicializar matriz vacia
		String[][] matriz1 = new String[4][4];
		
		//Ver el valor en una posicion especifica de la matriz
		System.out.println(matriz1[0][3]);		
		System.out.println(Arrays.deepToString(matriz1));
		
		matriz1[2][3] = "texto";
		System.out.println(Arrays.deepToString(matriz1));
		
		String[][] matriz2 = {{"a","b","c","d"},{"e","f","g","h"},{"i","j","k","l"},{"m","n","ñ","o"}};
		
		System.out.println(matriz2[0][3]);		
		System.out.println(Arrays.deepToString(matriz2));
		
		
		for (int i = 0; i < matriz2.length; i++) {
			
			for (int j = 0; j < matriz2.length; j++) {
				
			}
			
		}
		
		
		/*
		 * Llenar 2 matrices del tipo String, de 5x5
		 * Los valores tienen que ser numeros y letras (0-9)
		 * 
		 * Declarar una 3er matriz de 5x5 vacía
		 * 
		 * Sumar las matrices
		 * 
		 * "F"+"8"
		 * Conversion a entero
		 * 3+8 = 11
		 * 
		 * Resultado colocarlo en la posicion actual de la matrizC
		 * 
		 * Cuando la conversion no sea posible, llenar con un 0 esa posicion de la matriz C
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
	}

}
