package common;

import java.util.Scanner;

public class Principal {

		public static void main(String[] args) {
			
			Scanner entrada= new Scanner (System.in);
			
		/*	double inversion=700, interes=0,mes=0;
			
			while(inversion<=1500){
				
				interes=inversion*0.02;
				inversion=interes+inversion;
				mes++;
				System.out.println("mes "+mes+" inversion = $"+inversion);
				
				
				
			}
			System.out.println("Son un total de "+mes+" meses");
			
			
			*/
			
			double ci, meta, mes=0, interes;
			System.out.println("Digite la cantidad que va a invertir: ");
			ci=entrada.nextDouble();
			System.out.println("Digete la meta del dinero: ");
			meta=entrada.nextDouble();
			while(ci<=meta){
				
				interes=ci*0.02;
				ci=interes+ci;
				mes++;
				System.out.println("mes "+mes+" inversion = $"+ci);
				
				
				
			}
			System.out.println("Son un total de "+mes+" meses");
			
			
			
			
			
		}
		
	
		
	
	
	
	
}

