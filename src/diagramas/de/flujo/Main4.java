package diagramas.de.flujo;

import java.util.Scanner;

public class Main4 {
    //bien hecho bro
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);// TECLADO

		System.out.println("Ingrese n�mero de filas");

		int N = teclado.nextInt();

		for (int fila = 1; fila <= N; fila ++) {
			for (int ast = 1; ast <= fila; ast++) {
				System.out.print("*");
			}
			System.out.println();// Salto de l�nea
		}

	}

}