package diagramas.de.flujo;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);// TECLADO
		System.out.println("Ingrese un N�mero");
		int numN = teclado.nextInt();
		int numI = 1;
		while (numI <= numN ) {
			int S = numI * 1;
			System.out.println("N�mero: " + S);
			numI = numI + 2;
			if (S == 7 || S == 17 || S == 27) {
				System.out.println("N�mero: *" + S);
			}else{
				
			}
		}

	}

}