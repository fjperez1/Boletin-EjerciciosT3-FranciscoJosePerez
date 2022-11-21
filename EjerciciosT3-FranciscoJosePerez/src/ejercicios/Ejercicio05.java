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
		 		
		 1) PRUEBA 1 (INTRODUCIMOS NÚMERO FUERA DEL RANGO PERMITIDO:b) INPUT: a=7 b=-2
		 		
		 		RESULTADO ESPERADO: "ERROR: Por favor, introduce un número dentro del rango permitido (1,n)"
		 		RESULTADO OBTENIDO: "ERROR: Por favor, introduce un número dentro del rango permitido (1,n)"
		 
		  1) PRUEBA 1 (INTRODUCIMOS NÚMERO ALEATORIO) INPUT: a=20 b=30
		 		
		 		RESULTADO ESPERADO: "OUTPUT: máximo común divisor = 10"
		 		RESULTADO OBTENIDO: "OUTPUT: máximo común divisor = 10"
		 		
		 */
		
		//DECLARACIÓN DE VARIABLES
		
		int a=1, b=1, rest=0;
		Scanner lectura = new Scanner (System.in);
		
		System.out.println("INPUT: Introduce el primer número");
		a = lectura.nextInt();
		System.out.println("INPUT: Introduce el primer número");
		b = lectura.nextInt();
			
			for (int c=(a>b?a:b);c>0;c++) {
				if (c%a==0 && c%b==0) {
					System.out.println(c);
					break;
				}
			} 
	}

}
