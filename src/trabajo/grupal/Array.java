package trabajo.grupal;

import java.util.Arrays;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Desarrollar un programa, que solicite al usuario ingresar el n�mero de la longitud de un vector de enteros (int), 
//		a partir de este n�mero, crear un vector con dicha longitud; el programa deber� solicitar al usuario que ingrese 
//		un n�mero entero para cada posici�n del vector; luego de que se termine de ingresar los valores de todas las posiciones,
//		el programa deber� realizar un ordenamiento (de acuerdo con el m�todo asignado por grupo) del vector en funci�n
//		de sus valores ingresados.
	
		// Teclado
		Scanner teclado = new Scanner(System.in);
		// El usuario digita la longitud del vector.
		int longitud = teclado.nextInt();
		// Declaramos el Vector en un bucle
		int vectorGrupo1[] = new int[longitud];
		
		for (int fila = 0; fila < longitud; fila++) {
			System.out.println("El valor de la posici�n " + fila);// Me imprime el n�mero de posiciones
			int numN = teclado.nextInt();
			vectorGrupo1[fila] = numN;
		}

		for (int fila = 0; fila < longitud; fila++) {
			System.out.print("[" + vectorGrupo1[fila] + "]" + " ");

		}
		System.out.println();
		for (int fila = 0; fila < longitud; fila++) {
			quicksort(vectorGrupo1, 0, vectorGrupo1.length - 1);
			System.out.print("[" + vectorGrupo1[fila] + "]" + " ");
		}
	}

	private static int colocacion(int vectorGrupo1[], int izquierda, int derecha) {
		int pivote = vectorGrupo1[izquierda];
		while (true) {
			while (vectorGrupo1[izquierda] < pivote) {
				izquierda++;
			}
			while (vectorGrupo1[derecha] > pivote) {
				derecha--;
			}

			if (izquierda >= derecha) {
				return derecha;
			} else {

				int colocamiento = vectorGrupo1[izquierda];
				vectorGrupo1[izquierda] = vectorGrupo1[derecha];
				vectorGrupo1[derecha] = colocamiento;

				izquierda++;
				derecha--;
			}
		}
	}

	private static void quicksort(int vectorGrupo1[], int izquierda, int derecha) {
		if (izquierda < derecha) {
			int orden = colocacion(vectorGrupo1, izquierda, derecha);
			quicksort(vectorGrupo1, izquierda, orden);
			quicksort(vectorGrupo1, orden + 1, derecha);
		}
		
	//syso Ctrl + espacio
		Arrays.toString(vectorGrupo1);
		
		//Aqu� ordenamos el vector
		Arrays.sort(vectorGrupo1);
		
		System.out.println("El vector ordenado es el siguiente: " + Arrays.toString(vectorGrupo1));

	}

}