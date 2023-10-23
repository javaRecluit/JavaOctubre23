package common;

import java.util.Arrays;

public class Matrices {
	
	public static void main(String[] args) {
		//Inicializar matriz vacia 
		/*String[][] matriz1 = new String [4][4];
		
		//Ver el valor en una posicion especifica de la matriz 
		System.out.println(matriz1[0][0]);
		
		//ver e valor de toda la matriz
		System.out.println(Arrays.deepToString(matriz1));*/
		/*String[][] matriz2 = { {"a","b","c","d" },{ "e","f","g","h" },{ "i","j","k","l" },{ "m","n","ñ","o" } };
		
		for (int i=0; i<matriz2.length; i++) {
			for(int j=0; j<matriz2.length; j++) {
			
				System.out.print(matriz2[i][j]);
				if(j==3) {
					System.out.println("");
				}
			}
				
		}
		
		*/
		
		
		String mat1[][] = {{"1","b","5","4","e" },{ "4","8","g","6","n" },{ "e","h","1","5","9" },{ "p","f","2","3","j" },{ "1","3","t","m","6" }}; 
		String mat2[][] = {{"8","5","1","p","7" },{ "f","4","2","3","6" },{ "t","k","8","2","1" },{ "0","ñ","4","8","6" },{ "p","4","7","d","0" }};
		int mat3[][] = new int [5][5];
		String num[] = {"1","2","3","4","5","6","7","8","9","0"};
		int aux1=0, aux2=0;
		boolean t=false, y=false;
		
		for (int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				for(int k=0; k<=9; k++)
				{
					if(mat1[i][j] == num[k] )
					{
						aux1=Integer.parseInt(mat1[i][j]);
						t=true;
					}
					if(mat2[i][j] == num[k]) {
						aux2=Integer.parseInt(mat2[i][j]);
						y=true;
					}
					
				}
				if(t==true && y ==true)
				{
					mat3[i][j] = aux1 + aux2;
				}else {
					mat3[i][j] = 0;
				}
				t=false;
				y=false;
				 
				System.out.print(mat3[i][j]+" \t");
				if(j==4)
				{
					System.out.println("");
				}
			}
		
		
		
	}
	}

}
