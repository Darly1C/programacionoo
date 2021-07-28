package darly.steven.castillo.palacios;

import java.util.Scanner;

public class Prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		int sumaP = 0;
		int sumaI = 0;
		double pI = 0;
		double cI = 0;
		int v;

		for (v = 1; v != 0; v++) {
			System.out.println("__________Ingresar un número entero S positivo__________");
			int S = lector.nextInt();

			if (S == -1) {
				v = -1;
			} else {
				if (S % 2 == 0) {
					sumaP = sumaP + S;
				} else {
					sumaI = sumaI + S;
					cI = cI + 1;
					pI = sumaI / cI;
				}
			}
		}

		System.out.println("La Suma de los Pares es: " + sumaP);
		System.out.println("La Suma de los Impares es: " + sumaI);
		System.out.println("El Promedio de los números Impares es: " + pI);
	}

}