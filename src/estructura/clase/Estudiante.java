//1. Declaración del paquete.
package estructura.clase;

//2. Declaración de importación.
// Las clases que están en el mismo paquete no requieren importación.
import java.util.Scanner;
import ejercicios.varios.vectores.matrices.MainMatriz1;

//3. Comentarios.
//Clase estudiante para @algo que quiera puede estar en cualquier lugar.

//4. Definición de la clase.
public class Estudiante {
	//constantes.
	//variables/atributos.
	//constructores.
	//metodos.
	
	Scanner teclado = new Scanner(System.in);
	
	MainMatriz1 main = new MainMatriz1();
	
	//La clase profesor no necesita la importación al estar en el mismo paquete.
	Profesor prof = new Profesor();
	
//5. Constantes.
	public final int MESES_ANIO = 12;
	//Toda constante debe ser declarada en mayúsculas 
	//y si son dos palabras debe estar separada por guón bajo.
	
//6. Atributos/variables.
	public String nombre;
	public String apellido;
	public int edad;
	
//7. Constructores.
//constructor tiene un método especial.
//el constructor siempre va a ser público.
//el constructor no tiene tipo de retorno.
//el nombre debe ser el mismo de la clase.	
	public Estudiante() {
		
	}

	
//8. Métodos.
	public int matricular() {
		
		//2_Tipo de retorno de un método.
		//3_identificador del método o nombre.
		//4_Argumentos del método.
		//5_Apertura y cierre del método.
		
		//programar todo lo que implica el matricular:
		//Insertar base.
		//Validar pase de materias.
		//El número de matrícula: 573
		return 573;
	}
	public void imprimir(String datosImprimir) {
		//Datos de matrícula
		//Datos de las notas
		//Color
		//Posición
		//Tipo de Letra
	}

	
}
