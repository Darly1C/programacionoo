package ejercicios.ordenamiento.taller;

import java.util.Arrays;

public class MainPrimerClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 primer d�a de clase
		// El profesor nos da nuestro n�mero de lista

		Estudiante danilo = new Estudiante("Danilo", "Alvarracin");
		//danilo.setNombre("Danilo");
		danilo.setNumeroLista(1);
		//danilo.setApellido("Alvarracin");
		danilo.setEdad(19);

		Estudiante andres = new Estudiante();
		andres.setNombre("Andr�s");
		andres.setNumeroLista(2);
		andres.setApellido("Lema");
		andres.setEdad(23);

		Estudiante alex = new Estudiante();
		alex.setNombre("Alex");
		alex.setNumeroLista(22);
		alex.setApellido("Altamirano");
		alex.setEdad(25);

		Estudiante stefany = new Estudiante();
		stefany.setNombre("Stefany");
		stefany.setNumeroLista(10);
		stefany.setApellido("Cruz");
		stefany.setEdad(21);

		Estudiante jhonny = new Estudiante();
		jhonny.setNombre("Jhonny");
		jhonny.setNumeroLista(21);
		jhonny.setApellido("Carrillo");
		jhonny.setEdad(18);

		// Alex dame tu n�mero de lista
		alex.getNombre();
		System.out.println("Inge. tengo : " + alex.getEdad() + " a�os");
		System.out.println("Inge. tengo: " + andres.getEdad() + " a�os");
		System.out.println("Inge. tengo: " + alex.getEdad() + " a�os");
		System.out.println("Inge. tengo: " + stefany.getEdad() + " a�os");
		System.out.println("Inge. tengo: " + jhonny.getEdad() + " a�os");
		System.out.println("Inge. tengo: " + danilo.getEdad() + " a�os");

		// nombrar el vector que represente el vector estudiantes
		// int X[] = new int[5];
		// ya no es el tipo de dato sino Estudiante
		// char Y[] = new char[5]
		Estudiante edades[] = new Estudiante[5];
		edades[0] = danilo;
		edades[1] = andres;
		edades[2] = alex;
		edades[3] = stefany;
		edades[4] = jhonny;

		// Vector antes de ordenar
		System.out.println("Estudiantes antes de ordenar");
		System.out.println(Arrays.toString(edades));

		// Aqu� ordeno la lista
		Arrays.sort(edades);
		System.out.println("Estudiantes despu�s de ordenar");
		System.out.println(Arrays.toString(edades));

	}

}
