package diagramas.de.flujo;

import java.util.Scanner;

public class Main3 {
	//Imprimir la tabla del 7 multiplicado hasta el 12
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);// TECLADO

		System.out.println("Tabla del 7");
		System.out.println();
		System.out.println();
		int N=7;
		
		for (int M=0; M<=12; M++) {
			int R = N*M;
			System.out.println(N +"x" + M + "=" + R);
		}

	}

}
