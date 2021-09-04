package prueba.uno.avion;

public class PasajeroVip extends Pasajero {

	private String codigoMembresia;

	public PasajeroVip() {

	}

	public PasajeroVip(String nombre, String apellido, int edad, String codigoMembresia) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.codigoMembresia = codigoMembresia;

	}

	// Métodos SET Y GET
	public String getCodigoMembresia() {
		return codigoMembresia;
	}

	public void setCodigoMembresia(String codigoMembresia) {
		this.codigoMembresia = codigoMembresia;
	}

	@Override
	public String toString() {
		return "PasajeroVip [codigoMembresia = " + codigoMembresia + "]";
	}

}
