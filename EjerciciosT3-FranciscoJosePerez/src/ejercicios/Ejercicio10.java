package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n_intro=20, temp1, dobl=0, sav=0;
		Scanner lectura=new Scanner(System.in);
		
		System.out.println("INPUT: Introduce un número para conocer cuántas cifras tiene");
		n_intro=lectura.nextInt();
		sav=n_intro;
		
		while (n_intro>0) {
			temp1=n_intro%10;
			dobl=dobl*10+temp1;
			n_intro/=10;
		}
		
		if (sav==dobl) {
			System.out.println("OUTPUT: El número introducido es capicúa");
		} else
			System.out.println("OUTPUT: El número introducido no es capicúa");

}
}