//1. Declaraci�n del paquete.
package estructura.clase;

//2. Declaraci�n de importaci�n.
// Las clases que est�n en el mismo paquete no requieren importaci�n.
import java.util.Scanner;
import ejercicios.varios.vectores.matrices.MainMatriz1;

//3. Comentarios.
//Clase estudiante para @algo que quiera puede estar en cualquier lugar.

//4. Definici�n de la clase.
public class Estudiante {
	//constantes.
	//variables/atributos.
	//constructores.
	//metodos.
	
	Scanner teclado = new Scanner(System.in);
	
	MainMatriz1 main = new MainMatriz1();
	
	//La clase profesor no necesita la importaci�n al estar en el mismo paquete.
	Profesor prof = new Profesor();
	
//5. Constantes.
	public final int MESES_ANIO = 12;
	//Toda constante debe ser declarada en may�sculas 
	//y si son dos palabras debe estar separada por gu�n bajo.
	
//6. Atributos/variables.
	public String nombre;
	public String apellido;
	public int edad;
	
//7. Constructores.
//constructor tiene un m�todo especial.
//el constructor siempre va a ser p�blico.
//el constructor no tiene tipo de retorno.
//el nombre debe ser el mismo de la clase.	
	public Estudiante() {
		
	}

	
//8. M�todos.
	public int matricular() {
		
		//2_Tipo de retorno de un m�todo.
		//3_identificador del m�todo o nombre.
		//4_Argumentos del m�todo.
		//5_Apertura y cierre del m�todo.
		
		//programar todo lo que implica el matricular:
		//Insertar base.
		//Validar pase de materias.
		//El n�mero de matr�cula: 573
		return 573;
	}
	public void imprimir(String datosImprimir) {
		//Datos de matr�cula
		//Datos de las notas
		//Color
		//Posici�n
		//Tipo de Letra
	}

	
}
