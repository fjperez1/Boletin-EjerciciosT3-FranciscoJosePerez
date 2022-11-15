package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n_intro,n_cif=0;
		Scanner lectura=new Scanner(System.in);
		
		System.out.println("INPUT: Introduce un número para conocer cuántas cifras tiene");
		n_intro=lectura.nextInt();
		
		for (int cif=n_intro;cif>0;cif/=10) {
		n_cif++;
		}
		System.out.println(n_cif);
		
		if (n_cif%2==0) {
			
		} else {
			
		}
	}

}