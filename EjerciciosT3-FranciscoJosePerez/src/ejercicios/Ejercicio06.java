package ejercicios;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla los
 * números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su valor. Ejemplo:
 */
		
		int n;
		Scanner lectura=new Scanner(System.in);
		
		System.out.println("INPUT: Introduce el valor de n");
		n=lectura.nextInt();
		
		for (int alt=1;alt<=n;alt++) {
			for(int rn=1;rn<=alt;rn++) {
				System.out.print(alt);
			}
		System.out.println("");
		}
		
		

	}

}
