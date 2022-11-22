package ejercicios;
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. El número introducido debe ser mayor que 0.
		
		/*PRUEBAS
		 
		 1) PRUEBA 1 (INTRODUCIMOS NÚMERO FUERA DEL RANGO PERMITIDO) INPUT: n_intro=-7
		 		
		 		RESULTADO ESPERADO:
					"ERROR: Por favor, introduce un número válido (mayor que 0)"
		 		RESULTADO OBTENIDO:
		 			"ERROR: Por favor, introduce un número válido (mayor que 0)"
		 			
		 2) PRUEBA 2 (INTRODUCIMOS NÚMERO FUERA DEL RANGO PERMITIDO) INPUT: n_intro=0
		 		
		 		RESULTADO ESPERADO:
					"ERROR: Por favor, introduce un número válido (mayor que 0)"
		 		RESULTADO OBTENIDO:
		 			"ERROR: Por favor, introduce un número válido (mayor que 0)"
		 		
		 3) PRUEBA 3 (INTRODUCIMOS NÚMERO ALEATORIO DE VARIAS CIFRAS) INPUT: n_intro=78657
		 		
		 		RESULTADO ESPERADO:
					"El número introducido tiene 5 cifras"
		 		RESULTADO OBTENIDO:
		 			"El número introducido tiene 5 cifras"
		 		
		 */
		
		//DECLARACIÓN DE VARIABLES
		
		int n_intro,n_cif=0;
		/*
		 n_intro: en esta variable vamos a guardar el número introducido por el usuario
		 n_cif: en esta variable vamos a guardar el número de cifras del número introducido
		 */
		Scanner lectura=new Scanner(System.in);
		
		System.out.println("INPUT: Introduce un número mayor que cero para conocer cuántas cifras tiene");
		//Solicitamos al usuario que introduzca un número mayor que cero
		n_intro=lectura.nextInt();
		//Guardamos dicho número en la variable "n_intro"
		
		if (n_intro>0) { //Comprobamos que el número introducido esté dentro del rango
		
		while (n_intro>0) { //Iniciamos un bucle while, que se va a ejecutar mientras que el número introducido sea mayor que cero
		n_cif++;
		//Cada vez que se ejecuta, suma 1 al contador "n_cif" (es decir, a la variable que estamos utilizando como contador)
		n_intro/=10;
		//Cada vez que se ejecuta, divide entre 10 el número introducido
		}
		System.out.println("El número introducido tiene " + n_cif + " cifras");
		//Al final, mostramos en pantalla el valor de la variable "n_cif" (es decir, mostramos el número de cifras que tiene el número introducido"
		}else
			System.out.println("ERROR: Por favor, introduce un número válido (mayor que 0)");
			//Mostramos un mensaje de error en caso de que el número introducido esté fuera del rango permitido
		
		lectura.close();
		//Cerramos el Scanner

}
}
