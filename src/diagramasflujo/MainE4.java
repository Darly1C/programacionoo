package diagramasflujo;

import java.util.Scanner;

public class MainE4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);// TECLADO

		System.out.println("Ingrese valor del sueldo:");
		int S = teclado.nextInt();
		int B1 = S + 100;
		int B2 = S + 70;
		int B3 = S + 50;
		
		if (S < 300) {
			// SI
			System.out.println("Su Bonificación es 100: " + B1);
		} else if (S >= 300 && S <= 400) {
			
			System.out.println("Su Bonificación es 70: " + B2 );
		} else {
		
			System.out.println("Su Bonificación es 50: " + B3 );
		}		
	}
}
		


