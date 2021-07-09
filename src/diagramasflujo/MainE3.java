package diagramasflujo;

import java.util.Scanner;

public class MainE3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);// TECLADO

		System.out.println("Ingrese Número A");
		int A = teclado.nextInt();
		System.out.println("Ingrese Número B");
		int B = teclado.nextInt();

		if (A % B == 0) {
			// SI
			System.out.println("A es Múltiplo de B");
		} else
			// NO
			System.out.println("A no es Múltiplo de B");

	}

}
