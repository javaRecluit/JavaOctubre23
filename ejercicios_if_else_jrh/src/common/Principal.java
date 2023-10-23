package common;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Realiza un programa que reciba dos n�meros por teclado e indique cu�l es
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
		 * Realiza un programa que pida un n�mero por teclado y nos indique si es par o
		 * impar.
		 */

		/*
		 * System.out.println("Numero 1: "); int num = sc.nextInt();
		 * 
		 * if(num%2 == 0) { System.out.println(num + " es un n�mero par"); } else {
		 * System.out.println(num + " es un n�mero impar"); }
		 */

		/*
		 * Crea un programa que pida al usuario dos n�meros y muestre el resultado de su
		 * divisi�n. Si el segundo n�mero es 0, debe mostrar un mensaje de error.
		 */

		/*
		 * System.out.println("Numero 1: "); int num1 = sc.nextInt();
		 * 
		 * System.out.println("Numero 2: "); int num2 = sc.nextInt();
		 * 
		 * if(num2 != 0){ double resultado = num1 / num2;
		 * System.out.println("El resultado de la divisi�n es: " + resultado); } else {
		 * System.out.println("Error, no es posible dividir sobre 0."); }
		 */

		/*
		 * Realiza un programa que calcule la aceptaci�n de una solicitud en base a los
		 * siguientes par�metros: edad, nota y sexo. M�nimo: Nota (5), edad (18), sexo
		 * M-> POSIBLE M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA Otros casos -> NO
		 * ACEPTADA
		 */

		/*
		 * System.out.println("Ingrese la nota:"); int nota = sc.nextInt();
		 * 
		 * System.out.println("Ingrese la edad:"); int edad = sc.nextInt();
		 * 
		 * if (nota == 5 && edad == 18) {
		 * 
		 * System.out.println("Ingrese el sexo (M � F):"); String sexo = sc.next();
		 * 
		 * if (sexo.equals("M")) { System.out.println("POSIBLE"); } else if
		 * (sexo.equals("F")) { System.out.println("ACEPTADA"); }
		 * 
		 * } else { System.out.println("NO ACEPTADA"); }
		 */

		/*
		 * El director de una escuela est� organizando un viaje de estudios y requiere
		 * determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la compa��a
		 * de viajes por el servicio. La forma de cobrar es la siguiente:
		 * 
		 * Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros. De 50 a 99
		 * alumnos, el costo es de 70 euros. De 30 a 49 alumnos, el costo es de 95
		 * euros. Menos de 30 alumnos, el costo de la renta del autob�s es de 4000
		 * euros, sin importar el n�mero de alumnos.
		 * 
		 * Realiza un algoritmo que permita determinar el pago a la compa��a de
		 * autobuses y lo que debe pagar cada alumno por el viaje.
		 */

		/*
		 * System.out.println("Ingrese el n�mero de alumnos:"); int numAlumnos =
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
		 * al lanzar un dado de seis caras y muestre por pantalla el n�mero en letras
		 * (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las caras
		 * opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4. Nota 2:
		 * Si el n�mero del dado introducido es menor que 1 o mayor que 6, se mostrar�
		 * el mensaje: �ERROR: n�mero incorrecto�.
		 */

//		System.out.println("Ingrese el n�mero del dado:");
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
//			System.out.println("ERROR: n�mero incorrecto.");
//		}

		/*
		 * Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el
		 * d�a correspondiente. Si introducimos otro n�mero nos da un error.
		 */

//		System.out.println("Ingrese el d�a de la semana:");
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
//			System.out.println("ERROR: n�mero incorrecto.");
//		}

		/*
		 * // Realiza un programa que pida un n�mero entero entre uno y doce e imprima
		 * el n�mero de d�as que tiene el mes correspondiente.
		 */

//		System.out.println("Ingrese el n�mero de mes:");
//		int dia = sc.nextInt();
//
//		switch (dia) {
//		case 1:
//			System.out.println("31 d�as.");
//			break;
//		case 2:
//			System.out.println("28 d�as.");
//			break;
//		case 3:
//			System.out.println("31 d�as.");
//			break;
//		case 4:
//			System.out.println("30 d�as.");
//			break;
//		case 5:
//			System.out.println("31 d�as");
//			break;
//		case 6:
//			System.out.println("30 d�as");
//			break;
//		case 7:
//			System.out.println("31 d�as");
//			break;
//		case 8:
//			System.out.println("31 d�as");
//			break;
//		case 9:
//			System.out.println("30 d�as");
//			break;
//		case 10:
//			System.out.println("31 d�as");
//			break;
//		case 11:
//			System.out.println("30 d�as");
//			break;
//		case 12:
//			System.out.println("31 d�as");
//			break;
//
//		default:
//			System.out.println("ERROR: n�mero incorrecto.");
//			break;
//
//		}

		// Compa�ia de trasnporte

//		System.out.println("UBICACIONES");
//		System.out.println("1. Am�rica del Norte");
//		System.out.println("2. Am�rica Central");
//		System.out.println("3. Am�rica del Sur");
//		System.out.println("4. Europa");
//		System.out.println("5. Asia");
//
//		System.out.println("Ingrese el n�mero de ubicaci�n en donde desea enviar su paquete:");
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
//			System.out.println("ERROR: ubicaci�n no encontrada.");
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
		 * Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa
		 * y lo reparte entre un centro de salud, un comedor de ni�os y una parte lo
		 * invierte en la bolsa de acuerdo a lo siguiente:
		 * 
		 * Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de
		 * salud, 50% al comedor de ni�os y el resto se invierte en la bolsa. Si el
		 * monto de la donaci�n es menor que $10000: 25% se destina al centro de salud,
		 * 60% al comedor de ni�os y el resto se invierte en la bolsa.
		 * 
		 * La instituci�n desea saber cu�nto de dinero destinar� a cada rubro
		 * anualmente.
		 */

		
//		System.out.println("Inngrese la cantidad de la donaci�n:");
//		double donacion = sc.nextDouble();
//		
//		if (donacion >= 10000) {
//			
//			double centroSalud = donacion * 0.30;
//			double comedor = donacion * 0.50;
//			double bolsa = donacion * 0.20;
//			
//			System.out.println("Centro de salud: " + centroSalud);
//			System.out.println("Comedor de ni�os: " + comedor);
//			System.out.println("Inversi�n en bolsa: " + bolsa);
//			
//		} else {
//			
//			double centroSalud = donacion * 0.25;
//			double comedor = donacion * 0.60;
//			double bolsa = donacion * 0.15;
//			
//			System.out.println("Centro de salud: " + centroSalud);
//			System.out.println("Comedor de ni�os: " + comedor);
//			System.out.println("Inversi�n en bolsa: " + bolsa);
//		}
		
		/*
		 * Un obrero necesita calcular su salario semanal, el cual se obtiene de la
		 * siguiente manera: Si trabaja 40 horas o menos se le paga $16 por hora. Si
		 * trabaja m�s de 40 horas se le paga $16 por cada una de las primeras 40 horas
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