package ejercicios.de.interfaces;

public class BibliotecaAmericana implements BibliotecaInterfaz {

	@Override
	public void solicitarIdentificaci�n(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Solicitar c�dula o cualquier otro tipo de identificaci�n del usuario");
		System.out.println("Validar identificaci�n");
		System.out.println("Confirmar datos de usuario");
		
	}

	@Override
	public void prestarLibro(String libro) {
		// TODO Auto-generated method stub
		System.out.println("Solicitar campos del libro (t�tulo,autor,edici�n,etc)");
		System.out.println("Ofrecer un cat�logo");
		
	}

	@Override
	public void venderLibro(int valorLibro) {
		// TODO Auto-generated method stub
		System.out.println("Ofrecer descuento por ser usuario de la Biblioteca Americana");
		System.out.println("Solicitar libro");
		System.out.println("Solicitar tipo de pago");
		System.out.println("Confirmar pago");
		
	}

	@Override
	public void validarPago() {
		// TODO Auto-generated method stub
		System.out.println("Validar informaci�n de usuario");
		System.out.println("Validar pago");
		System.out.println("Confirmar informaci�n");
		
	}

	@Override
	public void brindarSoporte() {
		// TODO Auto-generated method stub
		System.out.println("Solicitar el problema");
		System.out.println("Brindar ayuda en l�nea");
		System.out.println("Brindar ayuda telef�nica");
		System.out.println("Brindar soluciones");
		
	}

}
