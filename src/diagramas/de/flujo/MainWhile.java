package diagramas.de.flujo;

import java.util.Scanner;

public class MainWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);// TECLADO
		System.out.println("Ingrese un N�mero positivo");
		int N = teclado.nextInt();
		
		while (N != 0) {
			System.out.println("Ingrese un N�mero positivo");
			N = teclado.nextInt();
		}

	}

}
