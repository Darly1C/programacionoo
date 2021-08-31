package prueba.bus;

public class Adulto extends Pasajero {

	private String nombre;
	private String apellido;
	private String codigoSeguroSocial;
	private String empresaDeTrabajo;

	public String getCodigoSeguroSocial() {
		return codigoSeguroSocial;
	}

	public void setCodigoSeguroSocial(String codigoSeguroSocial) {
		this.codigoSeguroSocial = codigoSeguroSocial;
	}

	public String getEmpresaDeTrabajo() {
		return empresaDeTrabajo;
	}

	public void setEmpresaDeTrabajo(String empresaDeTrabajo) {
		this.empresaDeTrabajo = empresaDeTrabajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
