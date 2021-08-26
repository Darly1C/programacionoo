package ejercicio.de.ordenamiento.de.objetos;

//Construya un programa de nomina de la empresa GPF, en la que existen 10 empleados, 
//que tiene la siguiente información:
//	nombre
//	apellido
//	edad
//	salario
//	El programa debe imprimir un reporte de todos los empleados ordenados por su salario (menor a mayor).
//	Nota: los datos de los 10 empleados se deben setear con valores de ejemplo cualquiera.
// Modificado

	// Interfaz Comparable
public class Empleado implements Comparable<Empleado> {

	//Atributos
	private String nombre;
	private String apellido;
	private int edad;
	private double salario;

	
	// nombre SET Y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// apellido SET Y GET
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	// edad SET Y GET
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// salario SET Y GET
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// Método compareTo
	@Override
	public int compareTo(Empleado o) {
		// TODO Auto-generated method stub

		if (this.salario > o.getSalario()) {
			return 1;

		} else if (this.salario == o.getSalario()) {
			return 0;

		} else {
			return -1;
		}

	}

	@Override
	public String toString() {
		return "Empleado [nombre = " + nombre + ", "+ "apellido = " + apellido + ", " + "edad = " + edad + ", " + "salario = " + "$" + salario 
				+ "]";
	}

}
