package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Declare un vector X cuya longitud se solicite al usuario, de tipo int
// y construya un programa que pida al usuario que ingrese los valores 
// para cada posición y finalmente que se imprima los valores ingresados.
		Scanner teclado = new Scanner(System.in);
		int numL = teclado.nextInt();
		int X[] = new int[numL];
		
		for(int i=0; i<=numL ; i++) {
			System.out.println("Ingrese el valor de la posición: " + i);
			numL = teclado.nextInt();
			X[i]=numL;
			
			}
			
		// Recorriendo el vector lleno
		for(int i = 0; i < 3; i++) {
			System.out.println("El valor de la posición: " + i);
			System.out.println(X[i]);
		}
	}

}
