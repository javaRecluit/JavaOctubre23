package commmon;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el ancho:");
		int ancho = sc.nextInt();

		System.out.println("Ingrese el alto:");
		int alto = sc.nextInt();

		for (int i = 1; i <= alto; i++) {
			
			System.out.print("* ");

			for (int j = 1; j < ancho; j++) {
				
				System.out.print("* ");
			}
			
			System.out.println("");
		}
	}
}
