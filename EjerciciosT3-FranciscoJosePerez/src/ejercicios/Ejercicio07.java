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
		
		int n;
		long cha;
		Scanner lectura=new Scanner(System.in);
		
		System.out.println("INPUT: Introduce el valor de n");
		n=lectura.nextInt();
		
		for (int alt=1;alt<=n;alt++) {
			for(int rn=1;rn<=alt;rn++) {
				System.out.print(rn);
			}
			for(int rn=alt-1;rn>0;rn--) {
				System.out.print(rn);
			}
		System.out.println("");
		}
		
		

	}

}
