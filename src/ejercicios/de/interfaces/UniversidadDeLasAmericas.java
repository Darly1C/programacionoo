package ejercicios.de.interfaces;

public class UniversidadDeLasAmericas implements MatriculaInterfaz {

	@Override
	public void solicitarIdentificacionEstudiante(String cedula, String nombre, String apellido, int edad) {
		// TODO Auto-generated method stub
		System.out.println("Solicitar nombres de estudiante");
		System.out.println("Solicitar apellidos de estudiante");
		System.out.println("Solicitar edad del estudiante");
		System.out.println("Confirmar informaci�n del estudiante en la base de datos de la Universidad de las Americas");
		System.out.println("Validar informaci�n");
		
	}

	@Override
	public void solicitarPaseDeAnio() {
		// TODO Auto-generated method stub
		System.out.println("Solicitar pase de a�o");
		System.out.println("Consultar aprobaci�n de materias");
		System.out.println("Verificar calificaciones finales del semestre anterior");
		System.out.println("Confirmar si el estudiante cumple con los requisitos");
		
	}

	@Override
	public void solicitarHistorialAcademico() {
		// TODO Auto-generated method stub
		System.out.println("Solicitar historial acad�mico de la Universidad de las Americas");
		System.out.println("Ofrecer beca estudiantil");
		
	}

	@Override
	public void validarMatricula() {
		// TODO Auto-generated method stub
		System.out.println("Validar matr�cula");
		System.out.println("Validar pase de a�o");
		System.out.println("Validar matricula de la materia o materias establecidas");
		System.out.println("Solicitar pago de materias (estudiantes segunda matr�cula)");
		
	}

	@Override
	public void entregarReciboDeMatricula() {
		// TODO Auto-generated method stub
		System.out.println("Entregar recibo de matricula");
		System.out.println("Entregar informaci�n de estudiante");
		System.out.println("Entregar la matr�cula");
		
	}

}