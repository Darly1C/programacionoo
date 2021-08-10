package ejercicioss.objetos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante estudiante1 = new Estudiante();
		estudiante1.apellido = "Teran";
		estudiante1.nombre = "Juan";
		estudiante1.edad = 32;
		estudiante1.cedula = "17221284994";
		estudiante1.genero = 'M';
		estudiante1.comer();
		estudiante1.estudiar();
		estudiante1.matricularse();
		
		System.out.println();
		System.out.println("Segunda instancia");
		System.out.println();
		
		Estudiante estudiante2 = new Estudiante();
		estudiante2.apellido = "Pazmiño";
		estudiante2.nombre = "Andrea";
		estudiante2.edad = 25;
		estudiante2.cedula = "172828238";
		estudiante2.genero = 'F';
		estudiante2.comer();
		estudiante2.estudiar();
		estudiante2.matricularse();

	}

}
