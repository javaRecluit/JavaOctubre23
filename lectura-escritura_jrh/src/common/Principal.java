package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

//		String linea = "";
//		
//		File archivo = new File("C:\\Users\\tonay\\OneDrive\\Escritorio\\hola.txt");
//		
//		try {

//			FileReader fr = new FileReader(archivo);
//			BufferedReader br = new BufferedReader(fr);

//			while ((linea=br.readLine()) != null) {
//				System.out.println(linea);
//			}

//			FileWriter fw = new FileWriter(archivo, false);
//			
//			fw.write("cnncsncsncsn");
//			
//			fw.close();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		String rutaOrigen = "C:\\Users\\tonay\\OneDrive\\Escritorio\\fechas.txt";
		String rutaDestino = "C:\\Users\\tonay\\OneDrive\\Escritorio\\fechasNuevo.txt";
		String texto = "";
		String fechasTotal = "";

		File fechas = new File(rutaOrigen);
		File fechasNuevo = new File(rutaDestino);

		try {

			FileReader fr = new FileReader(fechas);
			BufferedReader br = new BufferedReader(fr);

			FileWriter fw = new FileWriter(fechasNuevo);

			while ((texto = br.readLine()) != null) {

				fechasTotal = fechasTotal + texto + " ";

			}

			String[] palabras = fechasTotal.split(" ");

			String fechaFormato = "";

			for (int i = 0; i < palabras.length; i++) {

				if (palabras[i].length() == 4) {

					String mes = "";

					switch (palabras[i - 1]) {
					case "1":
						mes = "enero";
						break;
					case "2":
						mes = "febrero";
						break;
					case "3":
						mes = "marzo";
						break;
					case "4":
						mes = "abril";
						break;
					case "5":
						mes = "mayo";
						break;
					case "6":
						mes = "junio";
						break;
					case "7":
						mes = "julio";
						break;
					case "8":
						mes = "agosto";
						break;
					case "9":
						mes = "septiembre";
						break;
					case "10":
						mes = "octubre";
						break;
					case "11":
						mes = "noviembre";
						break;
					case "12":
						mes = "diciembre";
						break;
					}

					fechaFormato = fechaFormato + palabras[i - 2] + " de " + mes + " de " + palabras[i] + "\n";
				}
			}

			fw.write(fechaFormato);

			br.close();
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
