package ejercicios;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n_altura;
		Scanner lectura = new Scanner (System.in);
		
		System.out.println("Introduce la base y altura del triángulo");
		n_altura = lectura.nextInt();
		
		for (int alt=1;alt<=n_altura;alt++) {
			for (int n_spa=1;n_spa<=n_altura-alt;n_spa++) {
				System.out.print(" ");
			}
			for (int n_ast=1;n_ast<=alt;n_ast++) {
				System.out.print("*");
				System.out.print(" ");
				
			}
		System.out.println("");
		}

	}

}