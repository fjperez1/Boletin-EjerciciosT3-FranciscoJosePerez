package ejercicios;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		Escribe un programa que lea un número n e imprima una pirámide de números con n filas como en la siguiente figura:
		
		1
		121
		12321
		1234321
		 */
		
		/*PRUEBAS
		 
		 1) PRUEBA 1 (INTRODUCIMOS NÚMERO FUERA DEL RANGO PERMITIDO) INPUT: n=-3
		 		
		 		RESULTADO ESPERADO: "ERROR: Por favor, introduce un número dentro del rango permitido"
		 		RESULTADO OBTENIDO: "ERROR: Por favor, introduce un número dentro del rango permitido"
		 
		 1) PRUEBA 2 (INTRODUCIMOS NÚMERO ALEATORIO) INPUT: n=7
		 		
		 		RESULTADO ESPERADO:
1
121
12321
1234321
123454321
12345654321
1234567654321
		 		RESULTADO OBTENIDO:
1
121
12321
1234321
123454321
12345654321
1234567654321
		 		
		 */
		
		//DECLARACIÓN DE VARIABLES
		
		int n;
		//n: en esta variable vamos a guardar el número introducido por el usuario
		Scanner lectura=new Scanner(System.in);
		
		System.out.println("INPUT: Introduce el valor de n");
		//Solicitamos al usuario que introduzca un número
		n=lectura.nextInt();
		//Guardamos dicho número en la variable "n"
		
		if (n>0) { //Comprobamos que el valor introducido por el usuario esté dentro del rango permitido
			for (int alt=1;alt<=n;alt++) {
			//Iniciamos un bucle for, que se va a ejecutar mientras que la variable temporal "alt" sea menor o igual al número introducido por el usuario (para mostrar todas las filas)
				for(int rn=1;rn<=alt;rn++) {
				//Iniciamos otro bucle for, que se va a ejecutar mientras que la variable temporal "rn" sea menor o igual a la variable temporal "alt"
				//Con este bucle imprimimos por pantalla el rango [1-alt]
					System.out.print(rn);
					//Mostramos por pantalla el valor de la variable temporal "rn"
				}
				for(int rn=alt-1;rn>0;rn--) {
				//Iniciamos otro bucle for, que se va a ejecutar mientras que la variable temporal "rn" sea mayor que cero.
				//Con este bucle imprimimos por pantalla el mismo rango que antes, pero a la inversa, es decir (alt,1]
					System.out.print(rn);
					//Mostramos por pantalla el valor de la variable temporal "rn"
				}
			System.out.println("");
			//Con este println cambiamos de fila cada vez que se termina de ejecutar el bucle principal
			}
		}else
		System.out.println("ERROR: Por favor, introduce un número dentro del rango permitido");
		//Mostramos un error por consola en caso de que el valor introducido por el usuario esté fuera del rango permitido.
		
		lectura.close();

	}

}
