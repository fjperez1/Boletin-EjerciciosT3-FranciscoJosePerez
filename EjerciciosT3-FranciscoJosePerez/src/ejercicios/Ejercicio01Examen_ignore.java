package ejercicios;

import java.util.Scanner;

public class Ejercicio01Examen_ignore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n_Altura = 0;
		Scanner lectura = new Scanner (System.in);

		System.out.println("Input: Introduce la n por favor");
		n_Altura = lectura.nextInt();

		for (int i=1;i<=n_Altura;i++) { //altura -> número de filas
			
			if (i==1 || i==n_Altura) 
			{
				for (int ast_InicioFinal=1;ast_InicioFinal<=n_Altura;ast_InicioFinal++) {
					System.out.print("*");
			}
			} else {
				
				System.out.print("*");
				for (int ast_Space=1;ast_Space<=n_Altura-2;ast_Space++) {
				System.out.print(" ");
				
				}
				System.out.print("*");
			}
			System.out.println("");
		}
		
			} 
			}


