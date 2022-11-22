package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 De forma similar a la actividad 4, realiza un programa que calcule el mínimo común múltiplo de dos números dados.
		 En este caso, habrá que partir del máximo de los dos e ir incrementando hasta encontrar el primer número que sea
		 múltiplo de los dos números.
		 */
		
		/*PRUEBAS
		 
		 1) PRUEBA 1 (INTRODUCIMOS NÚMERO FUERA DEL RANGO PERMITIDO:a) INPUT: a=-2 b=7
		 		
		 		RESULTADO ESPERADO: "ERROR: Por favor, introduce un número dentro del rango permitido (1,n)"
		 		RESULTADO OBTENIDO: "ERROR: Por favor, introduce un número dentro del rango permitido (1,n)"
		 		
		 1) PRUEBA 2 (INTRODUCIMOS NÚMERO FUERA DEL RANGO PERMITIDO:b) INPUT: a=7 b=-2
		 		
		 		RESULTADO ESPERADO: "ERROR: Por favor, introduce un número dentro del rango permitido (1,n)"
		 		RESULTADO OBTENIDO: "ERROR: Por favor, introduce un número dentro del rango permitido (1,n)"
		 
		  1) PRUEBA 3 (INTRODUCIMOS NÚMERO ALEATORIO) INPUT: a=20 b=30
		 		
		 		RESULTADO ESPERADO: "OUTPUT: mínimo común divisor = 60"
		 		RESULTADO OBTENIDO: "OUTPUT: mínimo común divisor = 60"
		 		
		 */
		
		//DECLARACIÓN DE VARIABLES
		
		int a=1, b=1, rest=0;
		/*
		 
		 a:en esta variable vamos a guardar el valor del primer número introducido por el usuario
		 b:en esta variable vamos a guardar el valor del segundo número introducido por el usuario
		 
		 */
		Scanner lectura = new Scanner (System.in);
		
		System.out.println("INPUT: Introduce el primer número");
		//Solicitamos al usuario que introduzca el primer número
		a = lectura.nextInt();
		//Guardamos el valor introducido por el usuario en la variable "a"
		System.out.println("INPUT: Introduce el primer número");
		//Solicitamos al usuario que introduzca el segundo número
		b = lectura.nextInt();
		//Guardamos el valor introducido por el usuario en la variable "b"
		
		if (a>0 && b>0) {
		//Comprobamos que los valores introducidos por el usuario sean mayores que cero
			for (int c=(a>b?a:b);c>0;c++) {
			//Iniciamos un bucle for, que se va a ejecutar mientras que la variable temporal "c" sea mayor que cero.
			//La variable temporal "c" toma como valor inicial el mayor de los dos valores introducidos por el usuario
				if (c%a==0 && c%b==0) {
				//Para cada valor de la variable temporal "c", vamos a comprobar si el resto de dividir los dos números introducidos entre dicho valor es cero.
					System.out.println("OUTPUT: mínimo común divisor = " + c);
					//Mostramos por pantalla el valor de la variable c (el número más pequeño que divide a ambos).
					break;
				}
			} 
		}else
			System.out.println("ERROR: Por favor, introduce un número dentro del rango permitido (1,n)");
			//Mostramos un error por consola en caso de que el valor introducido por el usuario esté fuera del rango permitido.
		
		lectura.close();
		//Cerramos el Scanner
	}

}
