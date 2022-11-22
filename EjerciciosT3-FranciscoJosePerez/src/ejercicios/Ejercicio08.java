package ejercicios;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último dado. La introducción de números finaliza con la introducción de un 0. Al final se mostrará:
		
			El total de números introducidos, excluido el 0.
			El total de números fallados.
		*/
		
		/*PRUEBAS
		 
		 1) PRUEBA 1 (INTRODUCIMOS NÚMERO MENOR) INPUT: n_intro=5 n=4
		 		
		 		RESULTADO ESPERADO:
					"FALLO, el número introducido es menor"
					"INPUT: Dime un número"
		 		RESULTADO OBTENIDO:
		 			"FALLO, el número introducido es menor"
					"INPUT: Dime un número"
		 		
		 1) PRUEBA 1 (INTRODUCIMOS VARIOS NÚMEROS MAYORES Y UN CERO) INPUT: n_intro=6 n=7 n=8 n=9 n=0
		 		
		 		RESULTADO ESPERADO:
					"Has introducido un total de 3 números"
					"Has fallado un total de 0 números"
		 		RESULTADO OBTENIDO:
		 			"Has introducido un total de 4 números"
					"Has fallado un total de 0 números"
		 		
		 */
		
		//DECLARACIÓN DE VARIABLES
		
		final int n_intro;
		//n_intro: en esta variable vamos a guardar el número inicial introducido por el usuario
		int n=0, n_total=0, n_fall=0;
		/*
		 n: en esta variable vamos a guardar los números que el usuario vaya introduciendo posteriormente
		 n_total: vamos a utilizar esta variable como contador del total de números introducidos
		 n_total: vamos a utilizar esta variable como contador del total de números fallados (aquellos que sean menores que el número inicial)
		 */
		
		Scanner lectura = new Scanner (System.in);
		
		System.out.println("INPUT: Introduce un número inicial por favor");
		//Solicitamos al usuario que introduzca el número inicial
		n_intro=lectura.nextInt();
		//Guardamos dicho número en la variable final "n_intro"
		
		do{ //Iniciamos un bucle do-while, que se va a ejecutar mientras que el número que introducimos posteriormente sea distinto de cero
		System.out.println("INPUT: Dime un número");
		//Solicitamos al usuario que introduzca un número
		n=lectura.nextInt();
		//Guardamos dicho número en la variable "n"
		
		if (n!=0) {
			n_total++;
			//Sumamos 1 al contador "n_total" cada vez que se ejecuta este bucle (siempre que "n" sea distinto de cero
		}
		
		
		if (n<n_intro && n!=0) { //Comprobamos si el número introducido es menor que el número inicial
			System.out.println("FALLO, el número introducido es menor");
			//En tal caso, mostramos un mensaje de error.
			n_fall++;
			//Y por último sumamos 1 al contador de números fallados
		} 
		} while (n!=0); //Definimos con qué condición se va a ejecutar este bucle (siempre que el número introducido en la variable "n" sea distinto de cero.
		
		System.out.println("Has introducido un total de " + n_total + " números");
		//Para finalizar, mostramos en pantalla la cantidad de números que se han introducido (es decir, la variable "n_total")
		System.out.println("Has fallado un total de " + n_fall + " números");
		//Y también vamos a mostrar en pantalla la cantidad de números introducidos que han sido menores que el número inicial.
		
		lectura.close();
		//Cerramos el Scanner
	}

}