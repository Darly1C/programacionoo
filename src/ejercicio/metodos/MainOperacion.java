package ejercicio.metodos;

public class MainOperacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperacionMatematica oper = new OperacionMatematica();
		int suma = oper.sumar(100,200);
		oper.sumar(100, 200);
		System.out.println("El valor es: " + suma);
	}

}
