package ejercicioss.objetos;

public class Estudiante {
	
	//Propiedades
	String nombre;
	String apellido;
	String cedula;
	int edad;
	char genero;
	
	
	//Acciones/M�todos
	void comer() {
		System.out.println("Est� comiendo: " + nombre);
		
	}
	
	void estudiar() {
		System.out.println("Est� estudiando: " + apellido);
		
	}
	
	void matricularse() {
		System.out.println("Su cedula es: " + cedula);
		System.out.println("Su apellido: " + apellido);
		System.out.println("Su nombre: " + nombre);
		System.out.println("Su edad: " + edad);
		//cedula va ha buscar en la base de datos
		//Va a verificar si ya ha pagado matricula
		//va a verificar que haya pasado de semestre
		//imprimir un comprobante
	}

}
