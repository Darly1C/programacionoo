package ejercicios.modificadores.acceso;

public class PacienteTerceraEdad extends Paciente{
	
	
	public void examenProstata() {
		System.out.println("Su nombre es: " + nombre);
		System.out.println("Su diagnóstico es: " + diagnostico);
		realizarDiagnostico();
	}

}
