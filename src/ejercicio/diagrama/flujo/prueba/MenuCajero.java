package ejercicio.diagrama.flujo.prueba;

import java.util.Scanner;

public class MenuCajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		int valor;
		int clave;		
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("***Banco del Pichincha seleccione una opción");
			System.out.println("1. Retirar dinero");
			System.out.println("2. Cambiar clave");
			System.out.println("3. Bloquear cuenta");
			System.out.println("4. Salir");
			opcion = teclado.nextInt();

			if (opcion == 1) {
				System.out.println("Ingrese valor a retirar");
				valor = teclado.nextInt();
				System.out.println("El valor a retirar es : " + valor);
				System.out.println();

			} else {
			}
			if (opcion == 2) {
				System.out.println("Ingrese nueva clave");
				clave = teclado.nextInt();
				System.out.println("Su clave ha sido cambiada");
				System.out.println();
			} else {
			}
			if (opcion == 3) {
				System.out.println("Su cuenta ha sido bloqueada");
				System.out.println();
			} else {
			}
		} while (opcion != 4);
		System.out.println("Salir");

	}

}