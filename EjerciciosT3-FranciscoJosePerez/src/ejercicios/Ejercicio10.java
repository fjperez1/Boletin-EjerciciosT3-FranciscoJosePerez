package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*PRUEBAS
		 
		 1) PRUEBA 1 (INTRODUCIMOS NÚMERO FUERA DEL RANGO PERMITIDO) INPUT: n_intro=-7
		 		
		 		RESULTADO ESPERADO:
					"ERROR: Por favor, introduce un número válido (mayor que 0)"
		 		RESULTADO OBTENIDO:
		 			"ERROR: Por favor, introduce un número válido (mayor que 0)"
		 			
		 1) PRUEBA 2 (INTRODUCIMOS NÚMERO FUERA DEL RANGO PERMITIDO) INPUT: n_intro=0
		 		
		 		RESULTADO ESPERADO:
					"ERROR: Por favor, introduce un número válido (mayor que 0)"
		 		RESULTADO OBTENIDO:
		 			"ERROR: Por favor, introduce un número válido (mayor que 0)"
		 		
		 1) PRUEBA 3 (INTRODUCIMOS NÚMERO ALEATORIO DE VARIAS CIFRAS) INPUT: n_intro=78657
		 		
		 		RESULTADO ESPERADO:
					"El número introducido tiene 5 cifras"
		 		RESULTADO OBTENIDO:
		 			"El número introducido tiene 5 cifras"
		 		
		 */
		
		//DECLARACIÓN DE VARIABLES
		
		int n_intro=20, temp1, dobl=0, sav=0;
		/*
		 
		 */
		Scanner lectura=new Scanner(System.in);
		
		System.out.println("INPUT: Introduce un número para conocer cuántas cifras tiene");
		n_intro=lectura.nextInt();
		sav=n_intro;
		
		if (n_intro>=0) {
		
		while (n_intro>0) {
			temp1=n_intro%10;
			dobl=dobl*10+temp1;
			n_intro/=10;
		}
		
		if (sav==dobl) {
			System.out.println("OUTPUT: El número introducido es capicúa");
		} else
			System.out.println("OUTPUT: El número introducido no es capicúa");
		
		}else
			System.out.println("ERROR: Por favor, introduce un número dentro del rango permitido (mayor o igual a cero");
			//Mostramos un error por consola en caso de que el valor introducido por el usuario esté fuera del rango permitido.
		
		lectura.close();
		//Cerramos el Scanner

}
}