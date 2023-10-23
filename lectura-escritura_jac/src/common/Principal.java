package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {
		String linea= "";
		String linea2 ="";
		String primero="PRIMERO";
		String unidad[] = {"UNO","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE"};
		String docena[] = {"DIEZ","ONCE","DOCE","TRECE","CATORCE","QUINCE","DIECISEIS","DIECISIETE","DIECIOCHO","DIECINUEVE","VEINTE","VEINTIUNO","VEINTIDOS","VEINTITRES","VEINTICUATRO","VEINTICINCO","VEINTISEIS","VEINTISIETE","VEINTIOCHO","VEINTINUEVE","TREINTA","CUARENTA","CINCUENTA","SESENTA","SETENTA","OCHENTA","NOVENTA"};
		String centena[] = {"CIENTO","DOCIENTOS","TRECIENTOS","CUATROCIENTOS","QUINIENTOS","SEISCIENTOS","SETECIENTOS","OCHOCIENTOS","NOVECIENTOS","mil"};
		String meses[] = {"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIMEBRE","DICIEMBRE"};
		String mil="MIL";
		File archivo = new File("C:\\Users\\Javs_\\Desktop\\prueba\\Lectura.txt");
		File archivo1 = new File("C:\\Users\\Javs_\\Desktop\\prueba\\Escritura.txt");
		String dia="",mes="",a="";
		String aux="";
		int gre=0, tan=0,pos=1;
		
		boolean m=false;
		
		try {
			//Leer un archivo txt
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader (fr);
			FileWriter fw = new FileWriter(archivo1, true);
			
			while((linea=br.readLine()) != null) {
				//System.out.println(linea);
				 for (int i = 0; i < linea.length(); i++) {
			            char digito = linea.charAt(i);
			            char digito2 = linea.charAt(i+1);
			            //separamos si el indice i es igual a 4 es por que ya es el año
			            if(i==4)
			            {//i==4
			            	char digito3 = linea.charAt(i+2);
				            char digito4 = linea.charAt(i+3);
				            int valorEntero = Character.getNumericValue(digito);
			            	int valorEntero2 = Character.getNumericValue(digito2);
			            	int valorEntero3 = Character.getNumericValue(digito3);
			            	int valorEntero4 = Character.getNumericValue(digito4);
				            a= Character.toString(digito) + Character.toString(digito2) + Character.toString(digito3) + Character.toString(digito4);
				            //Si el año empieza con 1 se le pondra mil
				            m=false;
				            gre=0;
				            aux="";
				            if(valorEntero==1) {
				            	System.out.print(" DE "+mil+" ");
				    			fw.write(" DE "+mil+" ");
				            	
				            	//System.out.println(aux);
				            }else if (valorEntero>1){ 
				            	  for(int z=0; z<=valorEntero; z++)//si el numero es 2, 3 etc se pondra primero la unidad y luego mil
						           {
				            		  if(valorEntero==z)
				            		  {
				            		   gre=z-pos;
						        	   System.out.print(" DEL "+unidad[gre]+" "+mil+" ");	
						        	   z=valorEntero;
				            		  fw.write(" DEL "+unidad[gre]+" "+mil+" ");
				            		  }
				            			
						           }
				            }
				            if(valorEntero2 >=1 && valorEntero2 <=9)//encontramos el segundo digito del año (centena)
				            {         	
				            	 for(int k=0; k<=9; k++)
			            		  {
			            			  if(valorEntero2==k) {
			            				  gre=0;
			            				  gre=k-pos;
			            				  System.out.print(" "+centena[gre]);
			            				  fw.write(" "+centena[gre]);
			            				  
			            			  }
			            		  }
				            }
				            if(valorEntero3 >=1 && valorEntero3 <=9)//Encontramos el tercer digito del año (docena)
				            {			            	
				            	if(valorEntero3 >=3 && valorEntero3 <=9)
				            	{
				            		for(int k=0; k<=9; k++)
			            		  {
			            			  if(valorEntero3==k && valorEntero!=0) {
			            				  gre=0;
			            				  gre=k+17;
			            				  System.out.print(" "+docena[gre]+" Y");
			            				  fw.write(" "+docena[gre]+ " Y");
			            			  }
			            		  }
				            	}else if(valorEntero3 == 2)//si el numero es de 20 al 29
				            	{
				            		for(int k=0; k<=9; k++)
				            		{
				            			if(valorEntero4==k) {
				            				 gre=0;
				            				 gre=k+10;
				            				 System.out.print(" "+docena[gre]+" Y");
				            				 fw.write(" "+docena[gre]+" Y");
				            				 m=true;
				            			}
				            		}
				            		
				            	}else if(valorEntero3 == 1)//si el numero es del 10 al 19
				            	{
				            		for(int k=0; k<=9; k++)
				            		{
				            			if(valorEntero4==k) {
				            				 System.out.print(" "+docena[k]+" Y");
				            				 fw.write(" "+docena[k]+" Y");
				            				 m=true;
				            			}
				            		}				            		
				            	}				            	
				            } if(valorEntero4>0 && valorEntero4<=9){//encontramos el ultimo digito del año
				            	for(int k=0; k<9; k++)
			            		{
			            			if(valorEntero4==k && m==false) {
			            				 gre=0;
			            				 gre=k-pos;
			            				 System.out.print(" "+unidad[gre]+" ");
			            				 fw.write(" "+unidad[gre]+" ");
			            			}
			            		}
				            }			            	  				            
				            //como es el año finalizamos el ciclo con i=7
				            i=7;
				            //acaba i==4
			            }else if(i==0) //si i es igaul a 0 es por que es el dia 
			            {  	
			            	dia= Character.toString(digito) + Character.toString(digito2);
			            	int valorEntero = Character.getNumericValue(digito);
			            	int valorEntero2 = Character.getNumericValue(digito2);			            	
			            	if(valorEntero==0)//si el primer digito del año es 0 es por que es un dia del 1 al 9
			            	{	            	
			            		for(int z=0; z<9; z++)
			            		{
			            			if(valorEntero2==z) {
			            				if(valorEntero2==1) {
			            					System.out.print(primero+" ");
			            					fw.write(" "+primero+" ");
			            				}else {
			            					gre=0;
				            				gre=z-pos;
				            				System.out.print(unidad[z-1]+" ");
				            				fw.write(" "+unidad[z-1]);
				            			}			            				
			            			}		            			
			            		}	
			            	}else if(valorEntero==1) {//si el primer digito del año es 1 es por que es un dia del 10 al 19
			            		for(int z=0; z<=9; z++)
			            		{
			            			if(valorEntero2==z) {
			            				System.out.print(docena[z]+" ");
			            				fw.write(" "+docena[z]);
			            			}	
			            		}
			            	}else if(valorEntero==2) {//si el primer digito del año es 2 es por que es un dia del 20 al 29
			            		for(int z=0; z<=9; z++)
			            		{
			            			if(valorEntero2==z) {
			            				gre=0;
			            				gre=z+10;
			            				System.out.print(docena[z+10]+" ");
			            				fw.write(" "+docena[gre]);
			            			}
			            		}
			            	}else if(valorEntero==3) {//si es 30 no podra ser arriba de 31
			            		for(int z=0; z<=9; z++)
			            		{
			            			if(valorEntero2==0) {	   
			            				gre=0;
			            			    gre=z+20;
			            				System.out.print(docena[gre] );
			            				fw.write(" "+docena[gre]);
			            			}else if(valorEntero2==z ) {
			            				gre=0;
			            				gre=z-pos;
			            				System.out.print(docena[20]+" y "+unidad[gre] );
			            				fw.write(" "+docena[20]+" y "+unidad[gre]);
			            			}
			            		}		            		
			            	}
			            }else if(i==2){//Si i=2 es por que es el mes 		            	   	
			            	mes= Character.toString(digito) + Character.toString(digito2);
			            	int valorMes = Character.getNumericValue(digito);
			            	int valorMes2 = Character.getNumericValue(digito2);		            	
			            	if(valorMes==0)
			            	{		            	
			            		for(int z=0; z<=9; z++)
			            		{
			            			if(valorMes2==z) {		
			            				gre=0;
			            				gre=z-pos;
			            			    System.out.print(" DE "+meses[gre]+" ");	
			            				fw.write(" DE "+meses[gre]+" ");
			            			}			            			
			            		}		            		
			            	}else if(valorMes==1) {
			            		if(valorMes2==0) {
		            				System.out.print(" DE "+meses[9]+" ");
		            				fw.write(" DE "+meses[9]+" ");
		            			}
			            		if(valorMes2==1) {
		            				
	            					System.out.print(" DE "+meses[10]+" ");
	            					fw.write(" DE "+meses[10]+" ");
	            				
	            			}if(valorMes2==2) {
	            				
            					System.out.print(" DE "+meses[11]+" ");	
            					fw.write(" DE "+meses[11]+" ");
            			}
			            	}		            	
			            }           
			            i++;
			        }	 
				 System.out.println(" "+dia+"/"+mes+"/"+a);
				 fw.write(" "+dia+"/"+mes+"/"+a+"\n");
			}			
			fw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
