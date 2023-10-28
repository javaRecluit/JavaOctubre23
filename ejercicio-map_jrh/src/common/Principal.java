package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String modelo;
		String marca;
		int año;
		double precio;
		String color;
		Scanner scan = new Scanner(System.in);
		int seleccion = 0;
		// auxiliar
		Autos auto = null;
		Map<String, Autos> registro = new HashMap<String, Autos>();

		do {
			System.out.println("1 - Agregar");
			System.out.println("2 - Buscar por modelo");
			System.out.println("3 - Editar");
			System.out.println("4 - Eliminar");
			System.out.println("5 - Buscar todos de una marca especifica");
			System.out.println("6 - Buscar el mas caro");
			System.out.println("7 - Mostrar todos");
			System.out.println("Selecciona una opcion:");
			seleccion = scan.nextInt();
			scan.nextLine();

			switch (seleccion) {

			case 1:

				System.out.println("Ingresa el modelo");
				modelo = scan.nextLine();
				System.out.println("Ingresa la marca");
				marca = scan.nextLine();
				System.out.println("Ingresa el color");
				color = scan.nextLine();
				System.out.println("Ingresa el año");
				año = scan.nextInt();
				System.out.println("Ingresa el precio");
				precio = scan.nextDouble();
				// Auto que actualmente se esta registrando
				auto = new Autos(modelo, marca, año, precio, color);
				// Añade el elemento dentro del hashmap
				registro.put(modelo, auto);

				break;

			case 2:

				System.out.println("Ingrese el modelo: ");
				modelo = scan.nextLine();

				if (registro.containsKey(modelo)) {
					System.out.println(registro.get(modelo));
				} else {
					System.out.println("No se encontro el modelo");
				}

				break;

			case 3:

				System.out.println("Ingrese el modelo a editar: ");
				modelo = scan.nextLine();

				if (registro.containsKey(modelo)) {

					System.out.println("Ingresa la marca");
					marca = scan.nextLine();
					System.out.println("Ingresa el color");
					color = scan.nextLine();
					System.out.println("Ingresa el año");
					año = scan.nextInt();
					System.out.println("Ingresa el precio");
					precio = scan.nextDouble();

					// Auto que actualmente se esta registrando
					auto = new Autos(modelo, marca, año, precio, color);

					// Añade el elemento dentro del hashmap
					registro.put(modelo, auto);

					System.out.println("Auto editado correctamente");

				} else {

					System.out.println("No se encontro el modelo");
				}

				break;

			case 4:

				System.out.println("Ingrese el modelo a eliminar: ");
				modelo = scan.nextLine();

				if (registro.containsKey(modelo)) {
					registro.remove(modelo);
					System.out.println("Auto eliminado correctamente");
				} else {

					System.out.println("No se encontro el modelo");
				}

				break;

			case 5:

				System.out.println("Ingrese la marca");
				marca = scan.nextLine();
				List<Autos> autosEncontrados = new ArrayList<>();

				for (String key : registro.keySet()) {

					if (registro.get(key).getMarca().equals(marca)) {
						autosEncontrados.add(registro.get(key));
					}
				}

				if (autosEncontrados.isEmpty()) {
					System.out.println("No se encontraron autos que conincidan con la marca ingresada");
				} else {
					System.out.println(autosEncontrados);
				}

				break;

			case 6:

				Autos autoMayorPrecio = new Autos("", "", 0, 0.0, "");

				for (String key : registro.keySet()) {

					if (registro.get(key).getPrecio() > autoMayorPrecio.getPrecio()) {
						autoMayorPrecio = registro.get(key);
					}
				}

				System.out.println("El auto con el precio mas elevado es:");
				System.out.println(autoMayorPrecio);

				break;

			case 7:

				for (String key : registro.keySet()) {
					System.out.println(registro.get(key));
				}

				break;
			}

		} while (seleccion > 0 && seleccion <= 7);
	}
}
