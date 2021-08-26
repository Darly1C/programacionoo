package menu;

public class Paciente {
	
	private String nombre;//SET Y GET
	private String apellido;//SET Y GET
	private int edad;//SET Y GET
	
	private void caminar() {
		
	}
	private void correr() {
		
	}
	
	//Metodos SET Y GET
	//Siempre son públicos
	
	//nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	//apellido
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getApellido() {
		return this.apellido;
	}
	
	//edad
	public void setEdad(int edad1) {
		this.edad = edad1;
	}
	public int getEdad() {
		return this.edad;
	}

}
