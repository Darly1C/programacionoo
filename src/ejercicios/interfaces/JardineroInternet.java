package ejercicios.interfaces;

public class JardineroInternet extends Persona implements JardineroInterfaz {

	public void regar(){
		System.out.println("Abre la llave");
		System.out.println("Toma la manguera");
		System.out.println("Cloro al agua");
		System.out.println("Moja el c�sped");
	}
	
	public void cortar(){
		System.out.println("Prender la m�quina");
		System.out.println("Poner el c�sped");
		System.out.println("Cortar por la mitad de linea");
		
	}
	
	public void abonar(){
		System.out.println("Bajar del carro el abono");
		System.out.println("Regar por partes");
		
	}

	public void fertilizar() {
		
	}
}
