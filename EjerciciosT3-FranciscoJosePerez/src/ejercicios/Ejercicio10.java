package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n_intro,n_cif=0, temp1;
		boolean capicua="true";
		Scanner lectura=new Scanner(System.in);
		
		System.out.println("INPUT: Introduce un número para conocer cuántas cifras tiene");
		n_intro=lectura.nextInt();
		
		for (int cif=n_intro;cif>0;cif/=10) {
		n_cif++;
		}
		
		for (int dig_izq=1;dig_izq<=n_cif;dig_izq--) {
			if (n_intro>9) {
				if (dig_izq<n_cif) {
					temp1=(n_intro/(10^dig_izq))%10;
				} else
					temp1=(n_intro/(10^dig_izq));
			} else
				temp1=n_intro;
		}
		for (int dig_der=1;dig_der<=(n_cif*2);dig_der++) {
			if (n_intro>9) {
				if (dig_der<n_cif) {
					temp1=(n_intro/(10^dig))%10;
				} else
					temp1=(n_intro/(10^dig));
			} else
				temp2=n_intro;
		}
		
		
		
		
		if (n_cif%2==0) {
			for(int cont=n_cif/2;cont>0;cont-=2) {
				
			}
			for(int cont=n_cif/2;cont>0;cont+=2) {
				
			}
		} else {
			
		}
	}

}