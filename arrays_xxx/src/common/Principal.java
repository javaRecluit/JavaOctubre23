package common;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		//Inicializar un array vacio
		int[] numeros = new int[10];
		int[] items = {4,5,3,1,7,9,7,5,3,3,5,4,45,646,345,345,62,346,467,5,856,7865,78,567,6};
		
		//Ver el contenido de una posicion en especifico del array
		System.out.println(numeros[5]);
		System.out.println(items[8]);
		//Ver todo el contenido del array
		System.out.println(Arrays.toString(numeros));
		
		//Agregar valor a una posicion del array
		numeros[6] = 30;
		System.out.println(Arrays.toString(numeros));
		
		System.out.println(Arrays.toString(items));
		
		//Calcular el tamaño del array
		System.out.println(items.length);
		
		
		//Array que permita elementos de cualquier tipo
		Object[] varios = new Object[20];
		
		varios[4] = "hola";
		varios[5] = 30;
		varios[7] = false;
		varios[8] = 'v';
		varios[10] = 64.3;
		
		System.out.println(Arrays.toString(varios));
		
	}
}
