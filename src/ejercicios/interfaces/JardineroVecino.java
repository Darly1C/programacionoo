package ejercicios.interfaces;

public class JardineroVecino extends Persona implements JardineroInterfaz {

	@Override
	public void regar() {
		// TODO Auto-generated method stub
		System.out.println("Abre la llave");
		System.out.println("Toma la manguera");
		System.out.println("Riega el c�sped");
		
	}

	@Override
	public void cortar() {
		// TODO Auto-generated method stub
		System.out.println("Prender la m�quina");
		System.out.println("Poner el c�sped");
		System.out.println("Cortar la primera l�nea");
		
	}

	@Override
	public void abonar() {
		// TODO Auto-generated method stub
		System.out.println("Bajar del carro el abono");
		System.out.println("Mezclar con la viruta");
		System.out.println("Regar por partes");
		
	}

	@Override
	public void fertilizar() {
		// TODO Auto-generated method stub
		
	}

}
