package ejercicios;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		/*PRUEBAS
		 
		 1) PRUEBA 1 (INTRODUCIMOS NÚMERO FUERA DEL RANGO PERMITIDO) INPUT: n_altura=-3
		 		
		 		RESULTADO ESPERADO: "ERROR: Por favor, introduce un número entero positivo"
		 		RESULTADO OBTENIDO: "ERROR: Por favor, introduce un número entero positivo"
		 
		 2) PRUEBA 2 (NÚMERO INTRODUCIDO MENOR A 3) INPUT: n_altura=2
		 		
		 		RESULTADO ESPERADO: "* 
		 							* *"
		 		RESULTADO OBTENIDO: "* 
		 							* *"
		 		
		 3) PRUEBA 3 (NÚMERO INTRODUCIDO CON VALOR + ELEVADO) INPUT: INPUT: n_altura=20
		 		
		 		RESULTADO ESPERADO:
		 		      * 
				     * * 
				    * * * 
				   * * * * 
				  * * * * * 
				 * * * * * * 
				* * * * * * * 
		 		RESULTADO OBTENIDO:
		 		      * 
				     * * 
				    * * * 
				   * * * * 
				  * * * * * 
				 * * * * * * 
				* * * * * * * 
		 		
		 */
		
		//DECLARACIÓN DE VARIABLES
		
		int n_altura;
		//En esta variable vamos a guardar el valor introducido por el usuario (la base y altura del triángulo)
		Scanner lectura = new Scanner (System.in); //Iniciamos el scanner
		
		System.out.println("Introduce la base y altura del triángulo");
		//Solicitamos al usuario que introduzca el valor de la variable "n_altura", es decir, la base y altura del triángulo
		n_altura = lectura.nextInt();
		//Guardamos el valor introducido por el usuario en la variable "n_altura"
		
		if (n_altura>1) {
		//En primer lugar vamos a comprobar que el valor introducido por el usuario sea mayor que uno
		//¿Por qué el mínimo es 2? Es el valor mínimo necesario para poder representar un triángulo
			
			for (int alt=1;alt<=n_altura;alt++) {
		
		//Iniciamos un bucle for, que irá desde el 1 hasta el valor introducido por el usuario (nos servirá para mostrar cada fila)
				
			for (int n_spa=1;n_spa<=n_altura-alt;n_spa++) {
				
			/*
			Declaramos otro bucle for, que vamos a utilizar para representar en consola los espacios vacíos.
			La primera fila va a necesitar tantos espacios como altura tenga el triángulo.
			Estos espacios se irán reduciendo cada vez que el bucle padre se ejecuta (cada vez que aumenta el valor de "alt")
			Por éste motivo ponemos como límite de ejecución la resta de n_altura-alt
			*/
				
				System.out.print(" ");
				//Mostramos por pantalla el espacio en blanco
			}
			for (int n_ast=1;n_ast<=alt;n_ast++) {
				
			/*
			Declaramos otro bucle for, que vamos a utilizar para representar en consola los asteriscos.
			En este caso, vamos a ejecutar el bucle hasta que n_ast llegue al valor de la variable "alt".
			Es decir, en cada fila vamos a mostrar una cantidad de asteriscos igual al valor de la variable "alt".
			 */
				System.out.print("*");
				//Mostramos por pantalla el asterisco
				System.out.print(" ");
				//Mostramos por pantalla un espacio entre cada asterisco (como indica el enunciado del problema)
				
			}
			System.out.println("");
			//Éste println será necesario para poder pasar a la siguiente línea
		}
			
		}else
			System.out.println("ERROR: Por favor, introduce un número entero positivo");
		
		lectura.close();
		//Cerramos el Scanner

	}

}