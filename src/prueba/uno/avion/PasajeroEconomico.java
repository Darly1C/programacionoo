package prueba.uno.avion;

public class PasajeroEconomico extends Pasajero {

	private String codigoDescuento;

	// Métodos SET Y GET
	public String getCodigoDescuento() {
		return codigoDescuento;
	}

	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}

	@Override
	public String toString() {
		return "PasajeroEconomico [codigoDescuento = " + codigoDescuento + "]";
	}

}
