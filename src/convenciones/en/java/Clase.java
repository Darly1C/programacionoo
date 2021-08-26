//1. Declaración del paquete.
package convenciones.en.java;

//2. Declaración de importación.
	// Las clases que están en el mismo paquete no requieren importación.
	import java.util.Scanner;

import ejercicios.herencia.Estudiante;
import estructura.clase.Profesor;


public class Clase {
	
	//3. Comentarios.

	//4. Definición de la clase.
	public class Profesor{
		//constantes.
		//variables/atributos.
		//constructores.
		//metodos.
		
		Scanner teclado = new Scanner(System.in);
		
		Profesor main = new Profesor();
		
		//La clase profesor no necesita la importación al estar en el mismo paquete.
		Estudiante est = new Estudiante();
		
	//5. Constantes.
		public final int ANIO_DIAS = 365;
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
		public Profesor() {
			
		}

		
	//8. Métodos.
		public int calificar() {
			
			//2_Tipo de retorno de un método.
			//3_identificador del método o nombre.
			//4_Argumentos del método.
			//5_Apertura y cierre del método.
			
		
			return 573;
		}
		public void imprimir(String datosImprimir) {
			
			}
		}

	}
