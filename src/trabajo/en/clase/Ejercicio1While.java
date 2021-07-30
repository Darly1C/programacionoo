package trabajo.en.clase;

import java.util.Scanner;

public class Ejercicio1While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);// TECLADO
		System.out.println("Ingrese un Número positivo");
		int numN = teclado.nextInt();
		double sumaT = numN;
		double promedio = 0;
		double cantidad = 0;
		
		
		while (numN != 0) {
			System.out.println("Ingrese un Número positivo");
			numN = teclado.nextInt();
			sumaT = sumaT  + numN;
			cantidad = cantidad + 1;
			promedio = sumaT / cantidad;
		}
		
		System.out.println("Cantidad Total: " + cantidad);
		System.out.println("Suma Total: " + sumaT);
		System.out.println("Promedio: " + promedio);

	}

}
