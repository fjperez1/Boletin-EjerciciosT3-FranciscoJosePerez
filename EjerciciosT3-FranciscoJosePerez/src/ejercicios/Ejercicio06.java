package ejercicios;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla los
		 números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su valor.
		 */
		
		/*PRUEBAS
		 
		 1) PRUEBA 1 (INTRODUCIMOS NÚMERO FUERA DEL RANGO PERMITIDO) INPUT: n=-3
		 		
		 		RESULTADO ESPERADO: "ERROR: Por favor, introduce un número dentro del rango permitido (0,20)"
		 		RESULTADO OBTENIDO: "ERROR: Por favor, introduce un número dentro del rango permitido (0,20)"
		 		
		 1) PRUEBA 1 (INTRODUCIMOS NÚMERO FUERA DEL RANGO PERMITIDO) INPUT: n=21
		 		
		 		RESULTADO ESPERADO: "ERROR: Por favor, introduce un número dentro del rango permitido (0,20)"
		 		RESULTADO OBTENIDO: "ERROR: Por favor, introduce un número dentro del rango permitido (0,20)"
		 
		  1) PRUEBA 1 (INTRODUCIMOS NÚMERO ALEATORIO) INPUT: n=7
		 		
		 		RESULTADO ESPERADO:
1
22
333
4444
55555
666666
7777777
		 		RESULTADO OBTENIDO:
1
22
333
4444
55555
666666
7777777
		 		
		 */
		
		//DECLARACIÓN DE VARIABLES
		int n;
		//n: en esta variable vamos a guardar el número introducido por el usuario
		
		Scanner lectura=new Scanner(System.in);
		
		System.out.println("INPUT: Introduce el valor de n");
		//Solicitamos al usuario que introduzca un número
		n=lectura.nextInt();
		//Guardamos dicho número en la variable "n"
		
		if (n>=0 && n<=20) { //Comprobamos que el valor introducido por el usuario esté dentro del rango permitido
		for (int alt=1;alt<=n;alt++) {
		//Iniciamos un bucle for, que se va a ejecutar mientras que la variable temporal "alt" sea menor o igual al número introducido por el usuario (para mostrar todas las filas)
			for(int rn=1;rn<=alt;rn++) {
				//Iniciamos otro bucle for, que se va a ejecutar mientras que la variable temporal "rn" sea menor o igual a la variable temporal "alt"
				//Con este bucle, en cada fila se va a repetir un print tantas veces como indique el valor de la variable "alt" (es decir, el número de fila en ese momento).
				System.out.print(alt);
				//Mostramos por pantalla el valor de la variable "alt" (el número de fila en ese momento)
			}
		System.out.println("");
		//Con este println cambiamos de fila cada vez que se termina de ejecutar el bucle principal
		}
		}else
			System.out.println("ERROR: Por favor, introduce un número dentro del rango permitido (0,20)");
			//Mostramos un error por consola en caso de que el valor introducido por el usuario esté fuera del rango permitido.
		
		lectura.close();
		//Cerramos el Scanner
		
	}

}
