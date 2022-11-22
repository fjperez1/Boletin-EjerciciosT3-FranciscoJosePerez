package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*PRUEBAS
		 
		 1) PRUEBA 1 (INTRODUCIMOS NÚMERO FUERA DEL RANGO PERMITIDO) INPUT: n_intro=-7
		 		
		 		RESULTADO ESPERADO:
					"ERROR: Por favor, introduce un número dentro del rango permitido (mayor o igual a cero)"
		 		RESULTADO OBTENIDO:
		 			"ERROR: Por favor, introduce un número dentro del rango permitido (mayor o igual a cero)"
		 			
		 2) PRUEBA 2 (INTRODUCIMOS UN CERO) INPUT: n_intro=0
		 		
		 		RESULTADO ESPERADO:
					"OUTPUT: El número introducido es capicúa"
		 		RESULTADO OBTENIDO:
		 			"OUTPUT: El número introducido es capicúa"
		 		
		 3) PRUEBA 3 (INTRODUCIMOS NÚMERO CAPICÚA DE VARIAS CIFRAS) INPUT: n_intro=78587
		 		
		 		RESULTADO ESPERADO:
					"OUTPUT: El número introducido es capicúa"
		 		RESULTADO OBTENIDO:
		 			"OUTPUT: El número introducido es capicúa"
		 		
		 */
		
		//DECLARACIÓN DE VARIABLES
		
		int n_intro=20, temp1, dobl=0, sav=0;
		/*
		 n_intro: en esta variable vamos a guardar el número introducido por el usuario
		 temp1: en esta variable vamos a guardar (cifra por cifra) el número introducido por el usuario
		 dobl: en esta variable vamos a guardar el número introducido por el usuario, pero al revés (iremos almacenando en esta variable cada cifra que nos de la variable "temp1")
		 sav: en esta variable vamos a guardar una copia del número introducido por el usuario, para compararlo con la variable "dobl".
		 	Al ir descomponiendo el número introducido, vamos a perderlo a no ser que hagamos una copia al inicio del código
		 */
		Scanner lectura=new Scanner(System.in);
		
		System.out.println("INPUT: Introduce un número para conocer cuántas cifras tiene");
		//Solicitamos al usuario que introduzca un número
		n_intro=lectura.nextInt();
		//Guardamos dicho número en la variable "n_intro"
		sav=n_intro;
		//Guardamos el valor de la variable "n_intro" en la variable "sav"
		
		if (n_intro>=0) { //Comprobamos que el número introducido esté dentro del rango permitido
		
		while (n_intro>0) {
		//Iniciamos un bucle while, que se va a ejecutar mientras que la variable "n_intro" sea mayor que cero
			temp1=n_intro%10; //Cada vez que se ejecuta el bucle, calculamos el resto de dividir el número introducido entre 10 (para "coger" la primera cifra"
			dobl=dobl*10+temp1; 
			//Ahora guardamos dicho número en la variable "dobl". Multiplicamos "dobl" por 10 para formar correctamente el número.
			//Al calcular el módulo 10 del número, "cogemos" el dígito en sí, pero no tenemos en cuenta si son decenas, centenas, millares, etc. Por éso lo multiplicamos por 10.
			
			n_intro/=10;
			//Para finalizar, dividimos el número introducido entre 10, para que al calcular el siguiente módulo 10 nos de como resultado el siguiente dígito.
		}
		
		if (sav==dobl) {
			//Ahora comprobamos si el número introducido es igual a "dobl" (es decir, al mismo número pero al revés)
			System.out.println("OUTPUT: El número introducido es capicúa");
			//Si es así, mostramos un mensaje en la consola.
		} else
			System.out.println("OUTPUT: El número introducido no es capicúa");
			//Si no es capicúa, también lo indicamos en la consola.
		
		}else
			System.out.println("ERROR: Por favor, introduce un número dentro del rango permitido (mayor o igual a cero)");
			//Mostramos un error por consola en caso de que el valor introducido por el usuario esté fuera del rango permitido.
		
		lectura.close();
		//Cerramos el Scanner

}
}