package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		/*PRUEBAS
		 
		 1) PRUEBA 1 (INTRODUCIMOS NÚMERO FUERA DEL RANGO PERMITIDO) INPUT: n= -2
		 		
		 		RESULTADO ESPERADO: "ERROR: Introduce un número entero positivo por favor"
		 		RESULTADO OBTENIDO: "ERROR: Introduce un número entero positivo por favor"
		 
		 2) PRUEBA 2 (NÚMERO MENOR QUE 10) INPUT: n= 10
		 		
		 		RESULTADO ESPERADO: "OUTPUT: Existen un total de 4 números primos en el rango (1,n)"
		 		RESULTADO OBTENIDO: "OUTPUT: Existen un total de 4 números primos en el rango (1,n)"
		 		
		 3) PRUEBA 3 (NÚMERO 100) INPUT: INPUT: n= 100
		 		
		 		RESULTADO ESPERADO: "OUTPUT: Existen un total de 25 números primos en el rango (1,n)"
		 		RESULTADO OBTENIDO: "OUTPUT: Existen un total de 25 números primos en el rango (1,n)"
		 		
		 */
		
		// ENUNCIADO: Realiza un programa que nos pida un número n y nos diga cuántos números hay entre 1 y n que sean primos.
		
		//DECLARACIÓN DE VARIABLES

		int fin, contador=0;
		boolean esPrimo = false;
		
		/* Variables:
		 
		 fin: en esta variable vamos a almacenar el número introducido por el usuario
		 contador: en esta variable vamos a ir guardando la cantidad de números primos que hay en el rango (1,n)
		 esPrimo: en esta variable vamos a guardar el resultado de comprobar si un número es primo o no (al calcular x%y)  
		  
		 */
		
		Scanner lectura = new Scanner (System.in); //Iniciamos el Scanner
		
		System.out.println("INPUT: Introduce el valor de n para conocer cuántos números primos hay en el rango (1,n)");
		//Utilizamos un println para pedir al usuario que introduzca por consola el valor de la variable "fin"
		fin = lectura.nextInt();
		//Guardamos el valor introducido por el usuario en la variable "fin"
		
		if (fin>1) { //Comprobamos que el valor introducido por el usuario sea un número positivo mayor que 1
			
			for (int x = 2; x < fin; x++) {
		
		//Iniciamos un bucle for, que irá desde 2 hasta el número introducido por el usuario
			
			esPrimo=true;
			//El valor por defecto del booleano "esPrimo" será true
			
			for (int y = 2; y<x;y++) {
			//Iniciamos un bucle for, que irá desde el 2 hasta el valor de x que haya en cada momento.
			//Por tanto, cada vez que se ejecute el primer for, el programa irá comprobando si dicho número (x) es primo o no,
			//calculando el resto de dividir dicho número entre la variable temporal y (que toma el rango de valores (2,x)).
				
	
					if (x%y==0) {
					//Comprobamos si el resto de dividir la variable x entre la variable y da igual a cero
						
						esPrimo=false;
						//Si da igual a cero, quiere decir que dicho número no es primo.
						//Por tanto, asignamos el valor "false" al booleano esPrimo
						break;
						//Una vez el programa ha "averiguado" que dicho número no es primo, procedemos a salir de este bucle para
						//comprobar el siguiente número.
					}
			}
			if (esPrimo) {
				contador++;
				//Comprobamos el valor del booleano "esPrimo", y si es verdadero, sumamos 1 a la variable "contador"
			}
		
		}
			System.out.println("OUTPUT: Existen un total de " + contador + " números primos en el rango (1,n)");
			//Mostramos el resultado (el valor de la variable "contador") al usuario mediante un println.
		} else
			System.out.println("ERROR: Introduce un número entero positivo por favor");
		
		lectura.close();
		//Cerramos el Scanner.
			
}		
}
