package ejercicios.ordenamiento.taller;

//Interfaz Comparable
public class Estudiante implements Comparable<Estudiante> {
	private String nombre;
	private String apellido;
	private int numeroLista;
	private int edad;

	// Cuando una clase no está definido un constructor
	// por defecto tiene un constructor sin parámetros
	// Constructor = método que me permite instanciar una clase
	// new Estudiante()
	public Estudiante() {

	}
	// Constructor que inicializa con el nombre
	public Estudiante(String nombre) {
		this.nombre = nombre;
	}
	
	public Estudiante(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}


	// Por cada atributo un SET y GET
	// ALT + SHIFT + R S

	// nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// apellido
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	// numeroLista
	public int getNumeroLista() {
		return numeroLista;
	}

	public void setNumeroLista(int numeroLista) {
		this.numeroLista = numeroLista;
	}

	// edad
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Método compareTo
	@Override
	public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub

		// Tiene 3 posibles retornos
		// 0
		// -1
		// 1

		if (this.edad > o.getEdad()) {
			return 1;

		} else if (this.edad == o.getEdad()) {
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
		return "Estudiante [nombre = " + nombre + ", apellido = " + apellido + ", numeroLista = " + numeroLista + ", edad = "
				+ edad + "]";
	}

}
