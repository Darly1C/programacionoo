package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//1. Declare una matriz A[3,4] de tipo char, y desarrolle un programa que vaya solicitando
// cada una de sus posiciones.
		//Este es mi Teclado.
		Scanner teclado = new Scanner(System.in);
		//El usuario figita el número de filas y yo debo leer desde teclado.

		char A[][] = new char[3][4];

		for (int fila = 0; fila < 3; fila++) {
			for (int columna = 0; columna < 4; columna++) {
				System.out.println("El valor de la fila: " + fila + " columna: " + columna);
				// El usuario digita el valor por teclado y a continuación lo leo
				char numN = teclado.next().charAt(0);
				A[fila][columna] = numN;

			}

		}

		for (int fila = 0; fila < 3; fila++) {
			for (int columna = 0; columna < 4; columna++) {
				System.out.println("El valor de la fila: " + fila + " y columna: " + columna + " es: " + A[fila][columna]);
			}

		}
	}

}
