package prueba.uno.avion;

import java.util.Scanner;

public class MainReservaVuelos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tecladoInt = new Scanner(System.in);
		Scanner tecladoString = new Scanner(System.in);
		System.out.println("Ingrese información de pasajero");
		System.out.println("Ingrese Nombre: ");
		String nombre = tecladoString.nextLine();
		System.out.println("Ingrese Apellido: ");
		String apellido = tecladoString.nextLine();
		System.out.println("Ingrese Edad: ");
		int edad = tecladoInt.nextInt();
		System.out.println("¿Qué tipo de pasajero es: 1.Pasajero Vip  2.Pasajero Económico");
		int opcion = tecladoInt.nextInt();

		String membresia = "";
		String descuento = "";
		if (opcion == 1) {
			System.out.println("Ingrese Código de Membresía: ");
			membresia = tecladoString.nextLine();
		} else {
			System.out.println("Ingrese Código de Descuento: ");
			descuento = tecladoString.nextLine();
		}

//TERMINO QUEMADO: Poner textos de forma específica que no se puede modificar.
		PasajeroVip pasajero1 = new PasajeroVip();
		pasajero1.setNombre(nombre);
		pasajero1.setApellido(apellido);
		pasajero1.setEdad(edad);
		pasajero1.setCodigoMembresia(membresia);

		PasajeroVip pasajero2 = new PasajeroVip("Javier", "Cruz", 30, "dfgdgd");

		PasajeroEconomico pasajeroEconomico1 = new PasajeroEconomico();
		pasajeroEconomico1.setNombre("Darly");
		pasajeroEconomico1.setApellido("Castillo");
		pasajeroEconomico1.setEdad(34);
		pasajeroEconomico1.setCodigoDescuento("65jd");

		PasajeroEconomico pasajeroEconomico2 = new PasajeroEconomico();
		pasajeroEconomico2.setNombre("Darly2");
		pasajeroEconomico2.setApellido("Castillo2");
		pasajeroEconomico2.setEdad(20);
		pasajeroEconomico2.setCodigoDescuento("10ds");

		Pasajero[][] asientos = new Pasajero[4][5];
		asientos[0][0] = pasajero1;
		asientos[0][1] = pasajero2;
		asientos[0][2] = pasajeroEconomico1;
		asientos[3][2] = pasajeroEconomico2;

		int opcionSalir = 0;
		do {
			System.out.println("Ingrese datos del asiento,  0 continuar,  -1 Salir");
			opcionSalir = tecladoInt.nextInt();
			if (opcionSalir == 0) {
				System.out.println();
				System.out.println("Ingrese fila del asiento");
				int fila = tecladoInt.nextInt();
				System.out.println("Ingrese columna del asiento");
				int columna = tecladoInt.nextInt();

				System.out.println("Los datos del pasajero son: ");
				System.out.println(asientos[fila][columna]);
			} else if (opcionSalir == -1) {
				System.out.println("Va ha salir del sistema");
			}
		} while (opcionSalir != -1);

	}

}
