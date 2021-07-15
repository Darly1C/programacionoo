package diagramas.de.flujo;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);// TECLADO

		System.out.println("Asteriscos");

		for (int fila = 1; fila <= 5; fila ++) {
			for (int ast = 5; ast >= fila; ast--) {
				System.out.print("*");
			}
			System.out.println();// Salto de línea
		}

	}

}

