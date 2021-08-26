package ejercicios.modificadores.acceso.tarea;

public class Vertebrado extends Animal {

	public void caracteristicas() {
		System.out.println("El nombre de especie es: " + nombreEspecie);
		System.out.println("Es un animal: " + tipoDeAnimal);
		System.out.println("Pertenece al grupo de los: " + clasificacion);
		System.out.println("Animal : " + clasificacionVertebrados);

		obtenerNombreEspecie();// Este atributo es de tipo public por lo que puede ser utilizada en esta clase.

		ubicarhabitat();// Este atributo es de tipo private por lo que no puede ser utilizada en esta
						// clase.

		obtenerClasificacion();// Este atributo es de tipo protected por lo que puede ser usada en esta clase.

	}

}
