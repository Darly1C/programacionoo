package menu;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		
		System.out.println("Menú de Hospital");
		System.out.println("1. ECO");
		System.out.println("2- Radiografía");
		System.out.println("3. Certificado");
		System.out.println("Elija opción: ");
		Scanner teclado = new Scanner(System.in);
		opcion = teclado.nextInt();
		
		while(opcion != 4){
			System.out.println("Menú de Hospital");
			System.out.println("1. ECO");
			System.out.println("2- Radiografía");
			System.out.println("3. Certificado");
			System.out.println("Elija opción: ");
			opcion = teclado.nextInt();
		}
		System.out.println("FIN");

	}

}