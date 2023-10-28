package common;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		
//		// List es una interface
//				// ArrayList es una clase (de tantas) implementacion de List
//				List<Integer> lista = new ArrayList()<Integer>();
//				List<Object> lista2 = new ArrayList<Object>();
////				lista2.add(876876);
////				lista2.add("iuhiuh");
////				lista2.add(new Date());
//				// Imprimir el contenido
//				System.out.println(lista);
//				// Agregar elementos
//				lista.add(500);
//				lista.add(1);
//				lista.add(90);
//				lista.add(500);
//				lista.add(450);
//				lista.add(500);
//				lista.add(6757);
//				lista.add(9876);
//				System.out.println(lista);
//
//				// Añade un elemento en la posicion deseada, recorriendo los demas elementos
//				lista.add(2, 800);
//				System.out.println(lista);
//				// Devuelve true solo si existe el elemento buscado al menos 1 vez dentro de la
//				// lista
//				System.out.println(lista.contains(450));
//				// Devuelve el objeto en la posicion especificada
//				System.out.println(lista.get(3));
//				// Devuelve la posicion donde encuentra por primera vez el elemento especificado
//				System.out.println(lista.indexOf(500));
//				// Devuelve la ultima posicion donde encuentra al elemento especificado
//				System.out.println(lista.lastIndexOf(500));
//				// Vacia la lista
//				// lista.clear();
//				// Devuelve true si la lista esta vacìa
//				System.out.println(lista.isEmpty());
//				
//				//Elimina el elemento pasado como argumento a la lista	
//				Integer n = new Integer(9876);
//				System.out.println(lista.remove(n));
//				
//				//Elimina el elemento en la posicion indicada	
//				System.out.println(lista.remove(3));		
//				System.out.println(lista);
//				//Devuelve el tamaño de la lista
//				System.out.println(lista.size());
//			
//				List<Integer> listita = new ArrayList<Integer>();
//				listita.add(500);
//				listita.add(800);
//				//Elimina en esta lista,,todos los valores especificados en una coleccion previa
//				System.out.println(lista.removeAll(listita));
//				//Reemplaza un elemento en la posicion deseada con el nuevo elemento especificado
//				System.out.println(lista.set(2, 1500));
//				System.out.println(lista);
		
//		// Declaración de un Map (un HashMap) con clave "Integer" y Valor "String". Las claves pueden ser de cualquier tipo de objetos, aunque los más utilizados como clave son los objetos predefinidos de Java como String, Integer, Double ... !!!!CUIDADO los Map no permiten datos atómicos
//		Map<Integer, String> nombreMap = new HashMap<Integer, String>();
//		
//		nombreMap.put(1, "Jesus"); // Añade un elemento al Map
//		nombreMap.put(2, "Andrea"); // Añade un elemento al Map
//		nombreMap.put(3, "Eduardo"); // Añade un elemento al Map
//		
//		System.out.println(nombreMap.size()); // Devuelve el numero de elementos del Map
//		
//		System.out.println(nombreMap.isEmpty()); // Devuelve true si no hay elementos en el Map y false si si los hay
////		
////		
//		System.out.println(nombreMap.get(1)); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
////		
////		
////		
//		System.out.println(nombreMap.remove(3)); // Borra el par clave/valor de la clave que se le pasa como parámetro
//		System.out.println(nombreMap);
////		
//		System.out.println(nombreMap.containsKey(2)); // Devuelve true si en el map hay una clave que coincide con K
////		
//		System.out.println(nombreMap.containsValue("Emilio")); // Devuelve true si en el map hay un Valor que coincide con V
////		
//		System.out.println(nombreMap.values()); // Devuelve una "Collection" con los valores del Map
////		
//		nombreMap.clear(); // Borra todos los componentes del Map
		
		
		Cuenta cuenta1 = new Cuenta("Jesus", "1234", 10000, "abcd1234", 100000, 1000);
		Cuenta cuenta2 = new Cuenta("Eduardo", "4321", 5000, "1234abcd", 100000, 1000);
		
		List<Cuenta> cuentas = new ArrayList<Cuenta>();
		cuentas.add(cuenta1);
		cuentas.add(cuenta2);
		
		Cajero cajero =  new Cajero("dirección 1", 0, cuentas);
		Ticket ticket = cajero.transferir(cuenta1, cuenta2, 5000);
		
		System.out.println(ticket);
		
		
		List<Object> retiro = cajero.retirar(cuenta2, 2000);
		System.out.println(retiro);
		
		Ticket ticket2 = cajero.depositar(cuenta1, 1000);
		System.out.println(ticket2);
		
	}
}
