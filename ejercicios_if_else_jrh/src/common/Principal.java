package common;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Realiza un programa que reciba dos números por teclado e indique cuál es
		 * mayor o si son iguales.
		 */

		/*
		 * System.out.println("Numero 1: "); int num1 = sc.nextInt();
		 * 
		 * System.out.println("Numero 2: "); int num2 = sc.nextInt();
		 * 
		 * if(num1 == num2){ System.out.println(num1 + " es igual a " + num2); } else
		 * if(num1 < num2) { System.out.println(num1 + " es menor que " + num2); } else
		 * { System.out.println(num1 + " es mayor que " + num2); }
		 */

		/*
		 * Realiza un programa que pida un número por teclado y nos indique si es par o
		 * impar.
		 */

		/*
		 * System.out.println("Numero 1: "); int num = sc.nextInt();
		 * 
		 * if(num%2 == 0) { System.out.println(num + " es un número par"); } else {
		 * System.out.println(num + " es un número impar"); }
		 */

		/*
		 * Crea un programa que pida al usuario dos números y muestre el resultado de su
		 * división. Si el segundo número es 0, debe mostrar un mensaje de error.
		 */

		/*
		 * System.out.println("Numero 1: "); int num1 = sc.nextInt();
		 * 
		 * System.out.println("Numero 2: "); int num2 = sc.nextInt();
		 * 
		 * if(num2 != 0){ double resultado = num1 / num2;
		 * System.out.println("El resultado de la división es: " + resultado); } else {
		 * System.out.println("Error, no es posible dividir sobre 0."); }
		 */

		/*
		 * Realiza un programa que calcule la aceptación de una solicitud en base a los
		 * siguientes parámetros: edad, nota y sexo. Mínimo: Nota (5), edad (18), sexo
		 * M-> POSIBLE Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA Otros casos -> NO
		 * ACEPTADA
		 */

		/*
		 * System.out.println("Ingrese la nota:"); int nota = sc.nextInt();
		 * 
		 * System.out.println("Ingrese la edad:"); int edad = sc.nextInt();
		 * 
		 * if (nota == 5 && edad == 18) {
		 * 
		 * System.out.println("Ingrese el sexo (M ó F):"); String sexo = sc.next();
		 * 
		 * if (sexo.equals("M")) { System.out.println("POSIBLE"); } else if
		 * (sexo.equals("F")) { System.out.println("ACEPTADA"); }
		 * 
		 * } else { System.out.println("NO ACEPTADA"); }
		 */

		/*
		 * El director de una escuela está organizando un viaje de estudios y requiere
		 * determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía
		 * de viajes por el servicio. La forma de cobrar es la siguiente:
		 * 
		 * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros. De 50 a 99
		 * alumnos, el costo es de 70 euros. De 30 a 49 alumnos, el costo es de 95
		 * euros. Menos de 30 alumnos, el costo de la renta del autobús es de 4000
		 * euros, sin importar el número de alumnos.
		 * 
		 * Realiza un algoritmo que permita determinar el pago a la compañía de
		 * autobuses y lo que debe pagar cada alumno por el viaje.
		 */

		/*
		 * System.out.println("Ingrese el número de alumnos:"); int numAlumnos =
		 * sc.nextInt();
		 * 
		 * if(numAlumnos >= 100) {
		 * 
		 * System.out.println("El costo de cada alumno es de 65 euros.");
		 * 
		 * } else if (numAlumnos >= 50 && numAlumnos <= 99) {
		 * 
		 * System.out.println("El costo de cada alumno es de 70 euros.");
		 * 
		 * } else if (numAlumnos >= 30 && numAlumnos <= 49){
		 * 
		 * System.out.println("El costo de cada alumno es de 95 euros.");
		 * 
		 * } else if(numAlumnos < 30) {
		 * 
		 * System.out.println("La renta del autobous es de 4000 euros.");
		 * 
		 * }
		 */

		/*
		 * Realiza un programa que pida por teclado el resultado (dato entero) obtenido
		 * al lanzar un dado de seis caras y muestre por pantalla el número en letras
		 * (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las caras
		 * opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. Nota 2:
		 * Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará
		 * el mensaje: “ERROR: número incorrecto”.
		 */

//		System.out.println("Ingrese el número del dado:");
//		int numDado = sc.nextInt();
//
//		if (numDado >= 1 && numDado <= 6) {
//			switch (numDado) {
//			case 1:
//				System.out.println("SEIS");
//				break;
//			case 2:
//				System.out.println("CINCO");
//				break;
//			case 3:
//				System.out.println("CUATRO");
//				break;
//			case 4:
//				System.out.println("TRES");
//				break;
//			case 5:
//				System.out.println("DOS");
//				break;
//			case 6:
//				System.out.println("UNO");
//				break;
//			}
//		} else {
//			System.out.println("ERROR: número incorrecto.");
//		}

		/*
		 * Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el
		 * día correspondiente. Si introducimos otro número nos da un error.
		 */

//		System.out.println("Ingrese el día de la semana:");
//		int dia = sc.nextInt();
//
//		if (dia >= 1 && dia <= 7) {
//
//			switch (dia) {
//			case 1:
//				System.out.println("LUNES");
//				break;
//			case 2:
//				System.out.println("MARTES");
//				break;
//			case 3:
//				System.out.println("MIERCOLES");
//				break;
//			case 4:
//				System.out.println("JUEVES");
//				break;
//			case 5:
//				System.out.println("VIERNES");
//				break;
//			case 6:
//				System.out.println("SABADO");
//				break;
//			case 7:
//				System.out.println("DOMINGO");
//				break;
//			}
//		} else {
//			System.out.println("ERROR: número incorrecto.");
//		}

		/*
		 * // Realiza un programa que pida un número entero entre uno y doce e imprima
		 * el número de días que tiene el mes correspondiente.
		 */

//		System.out.println("Ingrese el número de mes:");
//		int dia = sc.nextInt();
//
//		switch (dia) {
//		case 1:
//			System.out.println("31 días.");
//			break;
//		case 2:
//			System.out.println("28 días.");
//			break;
//		case 3:
//			System.out.println("31 días.");
//			break;
//		case 4:
//			System.out.println("30 días.");
//			break;
//		case 5:
//			System.out.println("31 días");
//			break;
//		case 6:
//			System.out.println("30 días");
//			break;
//		case 7:
//			System.out.println("31 días");
//			break;
//		case 8:
//			System.out.println("31 días");
//			break;
//		case 9:
//			System.out.println("30 días");
//			break;
//		case 10:
//			System.out.println("31 días");
//			break;
//		case 11:
//			System.out.println("30 días");
//			break;
//		case 12:
//			System.out.println("31 días");
//			break;
//
//		default:
//			System.out.println("ERROR: número incorrecto.");
//			break;
//
//		}

		// Compañia de trasnporte

//		System.out.println("UBICACIONES");
//		System.out.println("1. América del Norte");
//		System.out.println("2. América Central");
//		System.out.println("3. América del Sur");
//		System.out.println("4. Europa");
//		System.out.println("5. Asia");
//
//		System.out.println("Ingrese el número de ubicación en donde desea enviar su paquete:");
//		int zona = sc.nextInt();
//
//		if (zona >= 1 && zona <= 5) {
//
//			System.out.println("Ingrese el peso de su paquete en kg:");
//			double peso = sc.nextDouble();
//
//			if (peso > 0 && peso <= 5) {
//
//				double costo = 0;
//
//				switch (zona) {
//				case 1:
//					costo = peso * 24.00;
//					break;
//				case 2:
//					costo = peso * 20.00;
//					break;
//				case 3:
//					costo = peso * 21.00;
//					break;
//				case 4:
//					costo = peso * 10.00;
//					break;
//				case 5:
//					costo = peso * 18.00;
//					break;
//				}
//				
//				System.out.println("El costo del envio es de " + costo + " euros.");
//				
//			} else {
//				System.out.println("No es posible realizar el envio del paquete.");
//			}
//
//		} else {
//			System.out.println("ERROR: ubicación no encontrada.");
//		}
		
		//IMC
		
//		System.out.println("Ingrese su peso en kg:");
//		double peso = sc.nextDouble();
//		
//		System.out.println("Ingrese su estatura en m:");
//		double altura = sc.nextDouble();
//		
//		double imc = peso / (altura * altura);
//		
//		if (imc < 16){
//			System.out.println("Diagnostico: Criterio de ingreso al hospital.");
//		} else if (imc > 16 && imc < 17){
//			System.out.println("Diagnostico: infrapeso");
//		} else if (imc > 17 && imc < 18){
//			System.out.println("Diagnostico: bajo peso");
//		} else if (imc > 18 && imc < 25){
//			System.out.println("Diagnostico: bajo normal(saludable)");
//		} else if (imc > 25 && imc < 30){
//			System.out.println("Diagnostico: sobrepeso(Obesidad grado I)");
//		} else if (imc > 30 && imc < 35){
//			System.out.println("Diagnostico: sobrepeso(Obesidad grado II)");
//		} else if (imc > 35 && imc < 40){
//			System.out.println("Diagnostico: sobrepeso(Obesidad grado III)");
//		} else if (imc > 40) {
//			System.out.println("Diagnostico: sobrepeso(Obesidad grado IV)");
//		}
		
		/*
		 * Una institución benéfica recibe anualmente una donación proveniente de Europa
		 * y lo reparte entre un centro de salud, un comedor de niños y una parte lo
		 * invierte en la bolsa de acuerdo a lo siguiente:
		 * 
		 * Si el monto de la donación es de $10000 o más: 30% se destina al centro de
		 * salud, 50% al comedor de niños y el resto se invierte en la bolsa. Si el
		 * monto de la donación es menor que $10000: 25% se destina al centro de salud,
		 * 60% al comedor de niños y el resto se invierte en la bolsa.
		 * 
		 * La institución desea saber cuánto de dinero destinará a cada rubro
		 * anualmente.
		 */

		
//		System.out.println("Inngrese la cantidad de la donación:");
//		double donacion = sc.nextDouble();
//		
//		if (donacion >= 10000) {
//			
//			double centroSalud = donacion * 0.30;
//			double comedor = donacion * 0.50;
//			double bolsa = donacion * 0.20;
//			
//			System.out.println("Centro de salud: " + centroSalud);
//			System.out.println("Comedor de niños: " + comedor);
//			System.out.println("Inversión en bolsa: " + bolsa);
//			
//		} else {
//			
//			double centroSalud = donacion * 0.25;
//			double comedor = donacion * 0.60;
//			double bolsa = donacion * 0.15;
//			
//			System.out.println("Centro de salud: " + centroSalud);
//			System.out.println("Comedor de niños: " + comedor);
//			System.out.println("Inversión en bolsa: " + bolsa);
//		}
		
		/*
		 * Un obrero necesita calcular su salario semanal, el cual se obtiene de la
		 * siguiente manera: Si trabaja 40 horas o menos se le paga $16 por hora. Si
		 * trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas
		 * y $20 por cada hora extra.
		 */
		
//		System.out.println("Ingrese las horas trabajadas en la semana:");
//		int horas = sc.nextInt();
//		
//		double salario;
//		
//		if (horas <= 40) {
//			
//			salario = horas * 16;
//			System.out.println("Su salario es de : " + salario);
//		} else {
//			
//		 double horasExtras = horas - 40;
//		 
//		 salario = (40 * 16) + (horasExtras * 20);
//		 System.out.println("Su salario es de : " + salario);
//		 
//		}

	}
}