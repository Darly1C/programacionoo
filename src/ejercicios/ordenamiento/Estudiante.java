package ejercicios.ordenamiento;

//Interfaz Comparable
public class Estudiante implements Comparable<Estudiante> {
	private String nombre;
	private int numeroLista;

	// Por cada atributo un SET y GET
	// ALT + SHIFT + R S

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroLista() {
		return numeroLista;
	}

	public void setNumeroLista(int numeroLista) {
		this.numeroLista = numeroLista;
	}

	// Método compareTo
	@Override
	public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub

		// Tiene 3 posibles retornos
		// 0
		// -1
		// 1

		if (this.numeroLista > o.getNumeroLista()) {
			return 1;

		} else if (this.numeroLista == o.getNumeroLista()) {
			return 0;

			// } if (this.numeroLista < o.getNumeroLista()) {
			// return -1;
			// }

		} else {
			return -1;
		}

	}

	// Método toString
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", numeroLista=" + numeroLista + "]";
	}

}
