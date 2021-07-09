package diagramasflujo;

import java.util.Scanner;

public class MainE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);// TECLADO

		System.out.println("Ingrese Número A");
		int A = teclado.nextInt();
		System.out.println("Ingrese Número B");
		int B = teclado.nextInt();
		
		int D = A / B;

		if (A == 0) {
			// SI
			System.out.println("La División no es posible");
		} else
			// NO
			System.out.println("La División es: " + D);
	}

}
