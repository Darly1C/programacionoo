package ejercicios.de.interfaces;

public class ConsultorioMedicoSA implements ConsultorioInterfaz {

	@Override
	public void solicitarInformacionPaciente(String informacionP) {
		// TODO Auto-generated method stub
		System.out.println("Solicitar informaci�n del paciente");
		System.out.println("Solicitar #turno");
		
	}

	@Override
	public void solicitarMalestar(String tipoMalestar) {
		// TODO Auto-generated method stub
		System.out.println("Solicitar malestar");
		System.out.println("Solicitar informaci�n de s�ntomas");
		
	}

	@Override
	public void solicitarHistorialMedico() {
		// TODO Auto-generated method stub
		System.out.println("Solicitar historial m�dico");
		System.out.println("Confirmar historial m�dico en la base de datos");
		System.out.println("Validar informaci�n en la base de datos");
		
	}

	@Override
	public void realizarDiagnostico() {
		// TODO Auto-generated method stub
		System.out.println("Realizar diagn�stico");
		System.out.println("Confirmar s�ntomas");
		System.out.println("Presentar diagn�stico");
		
	}

	@Override
	public void entregarReceta() {
		// TODO Auto-generated method stub
		System.out.println("Entregar receta");
		System.out.println("Solicitar compra de medicinas");
		
	}

}