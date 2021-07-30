package trabajo.en.clase;

import java.util.Scanner;

public class Ejercicio2DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int numN;
		int sumaP = 0;
		int sumaI = 0;
		double promedioI = 0;
		double cantidadI = 0;
		double cantidadP = 0;

		do {
			System.out.println("Ingrese un Número positivo");
				numN = teclado.nextInt();
			if (numN % 2 == 0 && numN > 0) {
				cantidadP ++;
				sumaP = sumaP + numN;
			} else {
				
			}
				if (numN % 2 != 0 && numN > 0 ) {
					cantidadI ++;
					sumaI = (sumaI + numN);
					promedioI = sumaI / cantidadI;
				}else {
					
				}
				

		} while (numN != -1);
		
		System.out.println("Cantidad Par: " + cantidadP);
		System.out.println("La Suma de los Pares es: " + sumaP);
		System.out.println("Cantidad Impar: " + cantidadI);
		System.out.println("La Suma de los Impares es: " + sumaI);
		System.out.println("El Promedio de los Impares es: " + promedioI);

	}

}
