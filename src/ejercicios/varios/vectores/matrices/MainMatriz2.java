package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//2. Desarrollar un programa que imprima la siguiente imagen (excel)

		// Este es mi Teclado.
		Scanner teclado = new Scanner(System.in);
		// El usuario figita el número de filas y yo debo leer desde teclado.
		int B[][] = new int[5][5];
		int numN;
		for (int fila = 0; fila < 5; fila++) {
			for (int columna = 0; columna < 5; columna++) {
				System.out.println("El valor de la fila: " + fila + " columna: " + columna);
				if (fila == columna) {
					numN = 1;
					B[fila][columna] = numN;
				}
				
			}

		}

		for (int fila = 0; fila < 5; fila++) {
			for (int columna = 0; columna < 5; columna++) {
				System.out.print(B[fila][columna] + " ");
			}

			System.out.println();
		}
	}

}
