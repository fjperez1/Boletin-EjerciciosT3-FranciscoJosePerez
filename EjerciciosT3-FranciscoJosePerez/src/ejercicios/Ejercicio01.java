package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		/*PRUEBAS
		 
		 1) PRUEBA 1 (SIN LLEGAR A LOS LÍMITES) INPUT: hor=16 min=30 seg=45 inc=13
		 		
		 		RESULTADO ESPERADO: "OUTPUT: Son las 16:30:58" RESULTADO OBTENIDO: "OUTPUT: Son las 16:30:58"
		 		
		 2) PRUEBA 2 (LLEGANDO A LOS LÍMITES) INPUT: hor=23 min=59 seg=59 inc=1
		 
		 		RESULTADO ESPERADO: "OUTPUT: Son las 00:00:00" RESULTADO OBTENIDO: "OUTPUT: Son las 00:00:00"
		 		
		 3) PRUEBA 3 (INTRODUCIR UN VALOR FUERA DEL RANGO PERMITIDO:horas) INPUT: hor=40 min=30 seg=15 inc=15
		 
		 		RESULTADO ESPERADO: "ERROR, introduce una hora válida" RESULTADO OBTENIDO: "ERROR, introduce una hora válida"
		 
		 4) PRUEBA 4 (INTRODUCIR UN VALOR FUERA DEL RANGO PERMITIDO:minutos) INPUT: hor=15 min=100 seg=20 inc=15
		 
		 		RESULTADO ESPERADO: "ERROR, introduce una hora válida" RESULTADO OBTENIDO: "ERROR, introduce una hora válida"
		 		
		 5) PRUEBA 5 (INTRODUCIR UN VALOR FUERA DEL RANGO PERMITIDO:segundos) INPUT: hor=15 min=30 seg=90 inc=15
		 
		 		RESULTADO ESPERADO: "ERROR, introduce una hora válida" RESULTADO OBTENIDO: "ERROR, introduce una hora válida"
		 */
		
		//DECLARACIÓN DE VARIABLES
		int hor, min, seg, inc;
		
		//hor: en esta variable vamos a guardar el valor de las horas introducido por el usuario
		//min: en esta variable vamos a guardar el valor de los minutos introducido por el usuario
		//seg: en esta variable vamos a guardar el valor de los segundos introducido por el usuario
		//inc: en esta variable vamos a guardar el valor del incremento de segundos introducido por el usuario
		
		Scanner lectura = new Scanner (System.in);
		
		System.out.println("INPUT: Introduce el valor de las horas"); 
		//Mostramos un mensaje en consola para solicitar al usuario la variable "hor"
		hor = lectura.nextInt();
		//Guardamos el valor introducido por el usuario en la variable "hor"
		System.out.println("INPUT: Introduce el valor de los minutos");
		//Mostramos un mensaje en consola para solicitar al usuario la variable "min"
		min = lectura.nextInt();
		//Guardamos el valor introducido por el usuario en la variable "min"
		System.out.println("INPUT: Introduce el valor de los segundos");
		//Mostramos un mensaje en consola para solicitar al usuario la variable "seg"
		seg = lectura.nextInt();
		//Guardamos el valor introducido por el usuario en la variable "seg"
		
		if (seg>0 && seg<60 && min>0 && min<60 && hor>0 && hor<24) {
		//Establecemos una serie de restricciones a los valores que puede introducir el usuario:
			
			/*
			 
			 Los valores de la variable "seg" deben estar comprendidos entre 1 y 59
			 Los valores de la variable "min" deben estar comprendidos entre 1 y 59
			 Los valores de la variable "hor" deben estar comprendidos entre 1 y 23
			 
			 */
			System.out.println("INPUT: Introduce la cantidad de segundos a incrementar");
			//Mostramos un mensaje en consola para solicitar al usuario la variable "inc"

			inc = lectura.nextInt();
			//Guardamos el valor introducido por el usuario en la variable "inc"
			
			for (; inc>0; inc--) {
			//Este for se va a ejecutar hasta que el valor de "inc" sea cero, es decir, hasta que no quede ningún segundo más por añadir.
			
				//Cada vez que se ejecuta el bucle, se resta 1 al valor de la variable "inc"
				
				seg++; //Cada vez que se ejecuta el bucle, se suma un segundo
				
				if (seg==60) { //Si los segundos llegan a 60, reiniciamos su valor a cero y sumamos 1 a los minutos
					seg=0;
					min++;
				}
				if (min==60) { //Si los minutos llegan a 60, reiniciamos su valor a cero y sumamos 1 a las horas
					min=0;
					hor++;
				}
				if (hor==24) { //Si las horas llegan a 24, reiniciamos su valor a cero
					hor=00;
				}
			}
			System.out.println("OUTPUT: Son las " + hor + ":" + min + ":" + seg);
			//Mostramos por pantalla el resultado (es decir, el valor de las variables "hor", "min" y "seg"
		} else
			System.out.println("ERROR, introduce una hora válida");
			//Mostramos un mensaje de error en caso de que alguno de los valores introducidos esté fuera del rango permitido
		
		lectura.close();
		//Cerramos el Scanner
	}
}