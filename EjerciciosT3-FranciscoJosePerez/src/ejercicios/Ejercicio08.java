package ejercicios;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último dado. La introducción de números finaliza con la introducción de un 0. Al final se mostrará:
		
			El total de números introducidos, excluido el 0.
			El total de números fallados.
		*/
		
		final int n_intro;
		int n=0, n_total=0, n_fall=0;
		
		Scanner lectura = new Scanner (System.in);
		
		System.out.println("INPUT: Introduce un número inicial por favor");
		n_intro=lectura.nextInt();
		
		do{
		System.out.println("INPUT: Dime un número");
		n=lectura.nextInt();
		
		n_total++;
		
		if (n<n_intro) {
			System.out.println("FALLO, el número introducido es menor");
			n_fall++;
		} 
		} while (n!=0);
		
		System.out.println(n_total);
		System.out.println(n_fall);
	}

}