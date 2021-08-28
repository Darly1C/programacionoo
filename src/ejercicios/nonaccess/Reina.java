package ejercicios.nonaccess;

public class Reina extends Pieza {

	private String color;
	private char nombre;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getNombre() {
		return nombre;
	}

	public void setNombre(char nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Reina [color=" + color + ", nombre=" + nombre + "]";
	}

}
