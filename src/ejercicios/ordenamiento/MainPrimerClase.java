package ejercicios.ordenamiento;

import java.util.Arrays;

public class MainPrimerClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 primer d�a de clase
		// El profesor nos da nuestro n�mero de lista

		Estudiante danilo = new Estudiante();
		danilo.setNombre("Danilo");
		danilo.setNumeroLista(1);

		Estudiante andres = new Estudiante();
		andres.setNombre("Andr�s");
		andres.setNumeroLista(2);

		Estudiante alex = new Estudiante();
		alex.setNombre("Alex");
		alex.setNumeroLista(22);

		Estudiante stefany = new Estudiante();
		stefany.setNombre("Stefany");
		stefany.setNumeroLista(10);

		Estudiante jhonny = new Estudiante();
		jhonny.setNombre("Jhonny");
		jhonny.setNumeroLista(21);

		// Alex dame tu n�mero de lista
		alex.getNombre();
		System.out.println("Inge. soy el: " + alex.getNumeroLista());
		System.out.println("Inge. soy el: " + jhonny.getNumeroLista());

		// nombrar el vector que represente el vector estudiantes
		// int X[] = new int[5];
		// ya no es el tipo de dato sino Estudiante
		// char Y[] = new char[5]
		Estudiante listaEstudiantes[] = new Estudiante[5];
		listaEstudiantes[0] = danilo;
		listaEstudiantes[1] = andres;
		listaEstudiantes[2] = alex;
		listaEstudiantes[3] = stefany;
		listaEstudiantes[4] = jhonny;

		// Vector antes de ordenar
		System.out.println("Estudiantes antes de ordenar");
		System.out.println(Arrays.toString(listaEstudiantes));

		// Aqu� ordeno la lista
		Arrays.sort(listaEstudiantes);
		System.out.println("Estudiantes despu�s de ordenar");
		System.out.println(Arrays.toString(listaEstudiantes));

	}

}
