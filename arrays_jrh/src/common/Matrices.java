package common;

import java.util.Arrays;

public class Matrices {

	public static void main(String[] args) {
		
//		String matriz[][] = {{"a", "b", "c", "d"},{"e", "f", "g", "h"},{"i", "j", "k", "l"},{"m", "n", "ñ", "o"}};
//	
//		for (int i = 0; i < matriz.length; i++) {
//			for (int j = 0; j < matriz.length; j++) {
//				System.out.println(matriz[i][j]);
//			}
//		}
		
		
		String[][] matrizA = {{"e", "2", "u", "z", "l"}, {"y", "i", "6", "9", "q"}, {"k", "q", "f", "j", "5"}, {"1", "8", "r", "l", "a"}, {"p", "3", "t", "w", "8"}};
		
		String[][] matrizB = {{"g", "6", "m", "b", "0"}, {"j", "7", "2", "7", "h"}, {"r", "h", "c", "6", "2"}, {"3", "u", "x", "e", "a"}, {"m", "r", "a", "i", "1"}};
		
		int[][] matrizC = new int[5][5];
		
		for (int i = 0; i < matrizC.length; i++) {
			
			for (int j = 0; j < matrizC.length; j++) {
				
				if (matrizA[i][j].matches("[0-9.]+") && matrizB[i][j].matches("[0-9.]+")) {
					
					matrizC[i][j] = Integer.parseInt(matrizA[i][j]) + Integer.parseInt(matrizB[i][j]);
					
				} else {
					
					matrizC[i][j] = 0;
					
				}
			}
		}
		
		System.out.println(Arrays.deepToString(matrizC));
	}
}
