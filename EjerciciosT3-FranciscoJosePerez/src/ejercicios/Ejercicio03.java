package ejercicios;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		/*PRUEBAS
		 
		 1) PRUEBA 1 (INTRODUCIMOS NÚMERO FUERA DEL RANGO PERMITIDO) INPUT: n= -2
		 		
		 		RESULTADO ESPERADO: "ERROR: Introduce un número entero positivo por favor"
		 		RESULTADO OBTENIDO: "ERROR: Introduce un número entero positivo por favor"
		 
		 1) PRUEBA 2 (NÚMERO MENOR QUE 10) INPUT: n= 10
		 		
		 		RESULTADO ESPERADO: "OUTPUT: Existen un total de 4 números primos en el rango (1,n)"
		 		RESULTADO OBTENIDO: "OUTPUT: Existen un total de 4 números primos en el rango (1,n)"
		 		
		 1) PRUEBA 1 (NÚMERO 100) INPUT: INPUT: n= 100
		 		
		 		RESULTADO ESPERADO: "OUTPUT: Existen un total de 25 números primos en el rango (1,n)"
		 		RESULTADO OBTENIDO: "OUTPUT: Existen un total de 25 números primos en el rango (1,n)"
		 		
		 */
		
		// ENUNCIADO: Realiza un programa que nos pida un número n y nos diga cuántos números hay entre 1 y n que sean primos.
		
		//DECLARACIÓN DE VARIABLES
		
		int n_altura;
		//En esta variable vamos a guardar el valor introducido por el usuario (la base y altura del triángulo)
		Scanner lectura = new Scanner (System.in); //Iniciamos el scanner
		
		System.out.println("Introduce la base y altura del triángulo");
		//Solicitamos al usuario que introduzca el valor de la variable "n_altura", es decir, la base y altura del triángulo
		n_altura = lectura.nextInt();
		//Guardamos el valor introducido por el usuario en la variable "n_altura"
		
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
				System.out.print("*");
				System.out.print(" ");
				
			}
			
		System.out.println("");
		
		}
		
		lectura.close();
		//Cerramos el Scanner

	}

}