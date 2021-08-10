package diagramas.de.flujo;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);// TECLADO
		System.out.println("Ingrese un Número");
		int numN = teclado.nextInt();
		int numI = 1;

		while (numI <= numN) {
			int S = numI*2;
			System.out.println("Número: " + S);
			numI++;
		}
	

	}

}
