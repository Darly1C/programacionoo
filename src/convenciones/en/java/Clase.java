//1. Declaraci�n del paquete.
package convenciones.en.java;

//2. Declaraci�n de importaci�n.
	// Las clases que est�n en el mismo paquete no requieren importaci�n.
	import java.util.Scanner;

import ejercicios.herencia.Estudiante;
import estructura.clase.Profesor;


public class Clase {
	
	//3. Comentarios.

	//4. Definici�n de la clase.
	public class Profesor{
		//constantes.
		//variables/atributos.
		//constructores.
		//metodos.
		
		Scanner teclado = new Scanner(System.in);
		
		Profesor main = new Profesor();
		
		//La clase profesor no necesita la importaci�n al estar en el mismo paquete.
		Estudiante est = new Estudiante();
		
	//5. Constantes.
		public final int ANIO_DIAS = 365;
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
		public Profesor() {
			
		}

		
	//8. M�todos.
		public int calificar() {
			
			//2_Tipo de retorno de un m�todo.
			//3_identificador del m�todo o nombre.
			//4_Argumentos del m�todo.
			//5_Apertura y cierre del m�todo.
			
		
			return 573;
		}
		public void imprimir(String datosImprimir) {
			
			}
		}

	}
