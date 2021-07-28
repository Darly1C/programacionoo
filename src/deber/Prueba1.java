package deber;

import java.util.Scanner;

public class Prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		double promedio = 0;
		double sumaT = 0;
		int v;

		for (v = 1; v != 0; v++) {
			System.out.println("__________Ingresar un número entero N positivo__________");
			int numN = lector.nextInt();
			if (numN == 0) {
				v = -1;
			}else {
				sumaT = sumaT + numN;
				promedio = sumaT/v;
			}

		}
		System.out.println("La Suma Total es: " + sumaT);
		System.out.println("El Promedio es: " + promedio);

	}

}
