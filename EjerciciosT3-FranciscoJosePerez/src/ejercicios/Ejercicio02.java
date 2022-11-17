package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// ENUNCIADO: Realiza un programa que nos pida un número n y nos diga cuántos números hay entre 1 y n que sean primos.

		int fin, contador=0, rest;
		boolean esPrimo = false;
		
		//n: FIN
		
		Scanner lectura = new Scanner (System.in);
		
		System.out.println("INPUT: Introduce el valor de N");
		fin = lectura.nextInt();
		
		for (int x = 2; x < fin; x++) {
			
			esPrimo=true;
			
			for (int y = 2; y<x;y++) {
	
					if (x%y==0) {
						esPrimo=false;
						break;
					}
			}
			if (esPrimo) {
				contador++;
			}
		
		}
		System.out.println(contador);
			
}		
}
