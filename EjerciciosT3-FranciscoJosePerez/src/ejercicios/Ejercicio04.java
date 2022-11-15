package ejercicios;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1, b=1, rest=0;
		Scanner lectura = new Scanner (System.in);
		
		System.out.println("INPUT: Introduce el primer número");
		a = lectura.nextInt();
		System.out.println("INPUT: Introduce el primer número");
		b = lectura.nextInt();
			
			for (int c=(a>b?b:a);c>0;c--) {
				if (a%c==0 && b%c==0) {
					System.out.println(c);
					break;
				}
			} 
}
}
