package common;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		
		//while
		
		
		int c = 40;
//		while(c<40) {
//			
//			System.out.println("Valor c:"+c);
//			c++;
//		}
		
		
//		do {
//			System.out.println("Valor c:"+c);
//		}while(c<40);
		
		//Realizar una tabla de multiplicar
		//Recibir el numero desde consola y la iteracion deseada tambien
		
		
		Scanner s = new Scanner(System.in);
		
		int numero = 0;
		int iteracion =0;
		System.out.println("Ingresa el numero");
		numero = s.nextInt();
		System.out.println("Hasta donde multiplicar");
		iteracion = s.nextInt();
		
		
		for (int i = iteracion; i >=0; i--) {			
			System.out.println(numero+" * "+i+" = "+(numero*i));
		}
		
		
	}

}
