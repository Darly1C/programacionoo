package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class Main1Matriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Este es mi Teclado.
		Scanner teclado = new Scanner(System.in);
		// El usuario figita el número de filas y yo debo leer desde teclado.
		int longitudFila = teclado.nextInt();
		int longitudColumnas = teclado.nextInt();

		char A[][] = new char[longitudFila][longitudColumnas];
		for (int fila = 0; fila < longitudFila; fila++) {
			for (int columna = 0; columna < longitudColumnas; columna++) {
				System.out.println("El valor de la fila: " + fila + " columna: " + columna);
				char numN = teclado.next().charAt(0);
				A[fila][columna] = numN;
			}

		}
		
		for (int fila = 0; fila < longitudFila; fila++) {
			for (int columna = 0; columna < longitudColumnas; columna++) {
				System.out.print(A[fila][columna]+ " ");
			}
			
			System.out.println();
		}
	}

}
