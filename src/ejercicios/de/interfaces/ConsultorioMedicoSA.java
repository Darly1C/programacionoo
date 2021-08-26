package ejercicios.de.interfaces;

public class ConsultorioMedicoSA implements ConsultorioInterfaz {

	@Override
	public void solicitarInformacionPaciente(String informacionP) {
		// TODO Auto-generated method stub
		System.out.println("Solicitar información del paciente");
		System.out.println("Solicitar #turno");
		
	}

	@Override
	public void solicitarMalestar(String tipoMalestar) {
		// TODO Auto-generated method stub
		System.out.println("Solicitar malestar");
		System.out.println("Solicitar información de síntomas");
		
	}

	@Override
	public void solicitarHistorialMedico() {
		// TODO Auto-generated method stub
		System.out.println("Solicitar historial médico");
		System.out.println("Confirmar historial médico en la base de datos");
		System.out.println("Validar información en la base de datos");
		
	}

	@Override
	public void realizarDiagnostico() {
		// TODO Auto-generated method stub
		System.out.println("Realizar diagnóstico");
		System.out.println("Confirmar síntomas");
		System.out.println("Presentar diagnóstico");
		
	}

	@Override
	public void entregarReceta() {
		// TODO Auto-generated method stub
		System.out.println("Entregar receta");
		System.out.println("Solicitar compra de medicinas");
		
	}

}