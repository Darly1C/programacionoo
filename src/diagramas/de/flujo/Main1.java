package diagramas.de.flujo;

import java.util.Scanner;

public class Main1 {
	
	//Ej1 Se ingreso por teclado un n�mero

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);// TECLADO

		System.out.println("Ingrese un n�mero");
		int N = teclado.nextInt();
		
		for(int C=N+1; C<=N+5; C++) {
			System.out.println("El siguiente n�mero: " + C);	
		}
		System.out.println("Se ha finalizado la impresi�n de los 5");
		
	}

}
