package diagramasflujo;

import java.util.Scanner;

public class MainE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);// TECLADO

		System.out.println("Ingrese valor del sueldo:");
		int S = teclado.nextInt();

		if (S < 300) {
			// SI
			int B = 40;
			System.out.println("Su bonificación es: " + B);
		} else
			// NO
			System.out.println("No hay bonificación:" + 0);

	}

}
