package common;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		
		/*int xx = 20;
		int yy = 90;
		System.out.println(xx>=0);	
		xx = 21;
		System.out.println(xx);
		int total=800;
		double descuento=0;
		String dia = "Lunes";*/
		
		//Condicional IF
		/*if(total<500) {
			descuento = total *0.98;
			System.out.println("A pagar "+descuento);
		}else {
			if(dia.equals("Lunes")) {
			descuento = total *0.97;
			System.out.println("A pagar "+descuento);
		}else if(dia.equals("Martes")) {
			descuento = total *0.95;
			System.out.println("A pagar "+descuento);
		}else if(dia.equals("Miercoles")) {
			descuento = total *0.93;
			System.out.println("A pagar "+descuento);
		}else if(dia.equals("Jueves")) {
			descuento = total *0.91;
			System.out.println("A pagar  "+descuento);
		}else if(dia.equals("Viernes")) {
			descuento = total *0.89;
			System.out.println("A pagar "+descuento);
		}else  {
			System.out.println("No aplica descuento");
		}	

		}
	*/
		
		//Condicional Switch
		/*switch (dia){
		case "Lunes":
			descuento = total *0.97;
			System.out.println("A pagar "+descuento);
			break;
			
		case "Martes":
			descuento = total *0.95;
			System.out.println("A pagar "+descuento);
			break;
			
		case "Miercoles":
			descuento = total *0.93;
			System.out.println("A pagar "+descuento);
			break;	
			
		case "Jueves":
			descuento = total *0.91;
			System.out.println("A pagar "+descuento);
			break;	
			
		case "Viernes":
			descuento = total *0.89;
			System.out.println("A pagar "+descuento);
			break;
			
		default: 
			System.out.println("Pago Completo");
		
		}*/
		
		// 1.-Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		/*int num1, num2;
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		num1=leer.nextInt();
		
		System.out.print("Ingrese otro numero: ");
		num2=leer.nextInt();
		
		if(num1 > num2) {
			System.out.println("El numero mayor es: "+num1);
		}else {
			System.out.println("El numero mayor es: "+num2);
		}*/
		
		//2.-Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		/*int num1;
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		num1=leer.nextInt();
		
		
		if(num1%2==0) {
			System.out.println("El numero "+num1+ " 8es par");
		}else {
			System.out.println("El numero "+num1+" es impar");
		}*/
		
		//3.-Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		/*int num1, num2;
		double resultado;
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		num1=leer.nextInt();
		
		System.out.print("Ingrese otro numero: ");
		num2=leer.nextInt();
		
		if(num2==0) {
			System.out.println("Erro, no se puede dividir entre 0");
		}else {
			resultado = num1/num2;
			System.out.println("El resulado de "+num1+" / "+num2+" es = "+resultado);
		}*/
		
		//4.-Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//* Otros casos -> NO ACEPTADA
		/*int nota, edad; String sexo;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Ingrese su nota: ");
		nota=leer.nextInt();
		System.out.println("Ingrese un edad: ");
		edad=leer.nextInt(); leer.nextLine();
		System.out.print("Ingrese un sexo 'M' o 'F': ");
		sexo=leer.nextLine();
		
		
		if(nota>=5 && edad>=18 && sexo.contentEquals("M")) {
			System.out.println("POSIBLE");
		}else if (nota>=5 && edad>=18 && sexo.contentEquals("F")) {
			System.out.println("ACEPTADO");
		}else {
			System.out.println("NO ACEPTADO");
		}*/
		
		//5.-La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se requiere determinar cuanto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:
		//* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.
		//* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
		//Precio inicial se recibe desde teclado
		
		/*int kilos, tamano;
		double precio;
		String tipo;
		
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingrese los KG de uvas: ");
		kilos=leer.nextInt();
		System.out.print("Ingrese el precio por KG de uva: ");
		precio=leer.nextInt();
		System.out.print("Uva de valor \"A\" ó \"B\": ");
		tipo=leer.next(); leer.nextLine();
		System.out.print("Tipo de uva \\\"1\\\" ó \\\"2\\\": ");
		tamano=leer.nextInt();
		
		if(tipo.equals("A") && tamano == 1) {
			precio = precio + 0.30;
			precio = precio * kilos;
			System.out.println("El precio final por kilo es : "+precio);
		}else if (tipo.equals("A") && tamano == 2) {
			precio = precio + 0.20;
			precio = precio * kilos;
			System.out.println("El precio final por kilo es : "+precio);
		}else if (tipo.equals("B") && tamano == 1) {
			precio = precio - 0.30;
			precio = precio * kilos;
			System.out.println("El precio final por kilo es : "+precio);
		}else if (tipo.equals("B") && tamano == 2) {
			precio = precio - 0.50;
			precio = precio * kilos;
			System.out.println("El precio final por kilo es : "+precio);
		}*/
		
		
		/*6.-El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:

			* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
			* De 50 a 99 alumnos, el costo es de 70 euros.
			* De 30 a 49 alumnos, el costo es de 95 euros.
			* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.*/
			
		/*Scanner leer = new Scanner(System.in);
		int alumnos;
		double precio;
		System.out.println("Ingrese el numero de alumnos");
		alumnos = leer.nextInt();
		
		if(alumnos>=100) {
			System.out.println("El costo por alumno es de $65 euros");
		}else if(alumnos>=50 && alumnos<=99) {
			System.out.println("El costo por alumno es de $70 euros");
		}else if(alumnos>=30 && alumnos<=49) {
			System.out.println("El costo por alumno es de $95 euros");
		}else if(alumnos>=1 && alumnos<=29) {
			precio = 4000/alumnos;
			System.out.println("El costo por alumno es de $"+precio+ " euros");
		}else {
			System.out.println("Ingrese un numero de alumnos valido");
		}
		*/
		
		
		/*7.-Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
		Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto”.*/
		/*
		Scanner leer = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Ingrese el numero obtenido del dado: ");
		numero = leer.nextInt();
		
		switch(numero) {
		case 1:
			System.out.println("La cara inversa del "+numero+" en el dado es 'SEIS'");
			break;
		case 2:
			System.out.println("La cara inversa del "+numero+" en el dado es 'CINCO'");
			break;	
		case 3:
			System.out.println("La cara inversa del "+numero+" en el dado es 'CUATRO'");
			break;	
		case 4:
			System.out.println("La cara inversa del "+numero+" en el dado es 'TRES'");
			break;	
		case 5:
			System.out.println("La cara inversa del "+numero+" en el dado es 'DOS'");
			break;	
		case 6:
			System.out.println("La cara inversa del "+numero+" en el dado es 'UNO'");
			break;	
			
		default: 
			System.out.println("ERROR: número incorrecto");
		}*/

		
		//8.-Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si introducimos otro número nos da un error.
		/*Scanner leer = new Scanner(System.in);
		
		int dia;
		
		System.out.println("Ingrese el dia de la semana en numero: ");
		dia = leer.nextInt();
		
		switch(dia) {
		case 1:
			System.out.println("LUNES");
			break;
		case 2:
			System.out.println("MARTES");
			break;	
		case 3:
			System.out.println("MIERCOLES");
			break;	
		case 4:
			System.out.println("JUEVES");
			break;	
		case 5:
			System.out.println("VIERNES");
			break;	
		case 6:
			System.out.println("SABADO");
			break;	
		case 7:
			System.out.println("DOMINGO");
			break;		
			
		default: 
			System.out.println("ERROR: dia incorrecto");
		
		}*/	
		/*9.-
		Scanner leer = new Scanner(System.in);
		int mes;
		
		System.out.println("Ingrese un numero del 1 al 12");
		mes=leer.nextInt();
		if(mes>=1 && mes<=12) {
			switch(mes) {
			case 1:
				System.out.println("El mes de Enero tiene 31 dias");
			break;
			case 2:
				System.out.println("El mes de Febrero tiene 28 dias");
			break;
			case 3:
				System.out.println("El mes de Marzo tiene 31 dias");
			break;
			case 4:
				System.out.println("El mes de Abril tiene 30 dias");
			break;
			case 5:
				System.out.println("El mes de Mayo tiene 31 dias");
			break;
			case 6:
				System.out.println("El mes de Junio tiene 30 dias");
			break;
			case 7:
				System.out.println("El mes de Julio tiene 31 dias");
			break;
			case 8:
				System.out.println("El mes de Agosto tiene 31 dias");
			break;
			case 9:
				System.out.println("El mes de Septiembre tiene 30 dias");
			break;
			case 10:
				System.out.println("El mes de Octubre tiene 31 dias");
			break;
			case 11:
				System.out.println("El mes de Noviembre tiene 30 dias");
			break;
			case 12:
				System.out.println("El mes de Diciembre tiene 31 dias");
			break;
			
			
			}
			
		}else {
			System.out.println("Numero incorrecto");
		}*/
		
		//10.-
		/*Scanner leer = new Scanner(System.in);
		int destino, kilos;
		double precio;
		System.out.println("Ingrese el destino:");
		System.out.println("1.-America del norte");
		System.out.println("2.-America central");
		System.out.println("3.-America del sur");
		System.out.println("4.-Europa");
		System.out.println("5.-Asia");
		destino = leer.nextInt();
		if(destino>=1 && destino<=5) {
			System.out.println("Ingrese los kilogramos del paquete: ");
		kilos = leer.nextInt();
		
		if(kilos>=1 && kilos<=5) {
			switch(destino) {
			case 1:
				precio=2400*kilos;
				System.out.println("El costo por el envio hacia America del norte con un peso de "+kilos+" es de: $"+precio);
				break;
			case 2:
				precio=2000*kilos;
				System.out.println("El costo por el envio hacia America central con un peso de "+kilos+" es de: $"+precio);
				break;
			case 3:
				precio=2100*kilos;
				System.out.println("El costo por el envio hacia America del sur con un peso de "+kilos+" es de: $"+precio);
				break;	
				
			case 4:
				precio=1000*kilos;
				System.out.println("El costo por el envio hacia Europa con un peso de "+kilos+" es de: $"+precio);
				break;	
			case 5:
				precio=1800*kilos;
				System.out.println("El costo por el envio hacia Asia con un peso de "+kilos+" es de: $"+precio);
				break;
			}
		}
		}else {
			System.out.println("destino no disponible");
		}*/
		
		/*11-.
		Scanner leer= new Scanner (System.in);
				
		int estatura;
		float peso;
		double imc;
		
		System.out.println("introduce tu estatura en metros");
		estatura=leer.nextInt();
		System.out.println("Introduce tu peso en KG");
		peso=leer.nextFloat();
		int resultado =(int)Math.pow(estatura, 2);
		imc=peso/resultado;
		imc = imc*10000;
		
		if(imc<16) {
			System.out.println("Criterio de ingreso al hospital");
		}else if (imc >=16 && imc <17) {
			System.out.println("Infrapeso");
		}else if (imc >= 17 && imc < 18) {
			System.out.println("Bajo");
		}else if (imc >= 18 && imc < 25) {
			System.out.println("Peso normal Saludable");
		}else if (imc >= 25 && imc < 30) {
			System.out.println("Sobrepeso");
		}else if (imc >= 30 && imc < 35) {
			System.out.println("Sobre peso cronico");
		}else if (imc >= 35 && imc < 40) {
			System.out.println("Obesidad premórbida");
		}else if (imc >= 40) {
			System.out.println("Obesidad mórbida");
		}*/
		
		/*Scanner leer=new Scanner (System.in);
		
		double donacion;
		double salud, ninos, bolsa;
		
		System.out.println("Introduzca el monto de la donacion");
		donacion = leer.nextInt();
		
		if(donacion >=10000) {
			salud=donacion * 0.30; 
			ninos=donacion * 0.50;
			bolsa= donacion * 0.20; 
			System.out.println("La donacion para la salud es: $"+salud);
			System.out.println("La donacion para los niños es: $"+ninos);
			System.out.println("La donacion pala la bolsa es: $"+bolsa);
			
		} else if (donacion < 10000) {
			salud=donacion * 0.25; 
			ninos=donacion * 0.60;
			bolsa= donacion * 0.15; 
			System.out.println("La donacion para la salud es: $"+salud);
			System.out.println("La donacion para los niños es: $"+ninos);
			System.out.println("La donacion pala la bolsa es: $"+bolsa);
			
		}*/
		
		//12.-
		Scanner leer=new Scanner (System.in);
		int horas, horasextras;
		double ganancia;
		
		System.out.println("Ingrese sus horas extras trabajadas");
		horas=leer.nextInt();
		
		if(horas>40) {
			horasextras=horas-40;
			ganancia = (40*16) + (horasextras*20);
			System.out.println("La ganancia total por las "+horas+" horas trabajadas es de $"+ganancia);
			
		}else if (horas<=40){
			ganancia = horas*16;
			System.out.println("La ganancia total por las "+horas+" horas trabajadas es de $"+ganancia);
		}
		
		
		
		
		


			
		
		
		
		
		
	}
	

}
