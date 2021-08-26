package ejercicios.de.interfaces;

public class BibliotecaAmericana implements BibliotecaInterfaz {

	@Override
	public void solicitarIdentificación(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Solicitar cédula o cualquier otro tipo de identificación del usuario");
		System.out.println("Validar identificación");
		System.out.println("Confirmar datos de usuario");
		
	}

	@Override
	public void prestarLibro(String libro) {
		// TODO Auto-generated method stub
		System.out.println("Solicitar campos del libro (título,autor,edición,etc)");
		System.out.println("Ofrecer un catálogo");
		
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
		System.out.println("Validar información de usuario");
		System.out.println("Validar pago");
		System.out.println("Confirmar información");
		
	}

	@Override
	public void brindarSoporte() {
		// TODO Auto-generated method stub
		System.out.println("Solicitar el problema");
		System.out.println("Brindar ayuda en línea");
		System.out.println("Brindar ayuda telefónica");
		System.out.println("Brindar soluciones");
		
	}

}
