package ejercicios.de.interfaces;

public interface BibliotecaInterfaz {

	public void solicitarIdentificación(String cedula);

	public void prestarLibro(String libro);

	public void venderLibro(int valorLibro);

	public void validarPago();

	public void brindarSoporte();

}
