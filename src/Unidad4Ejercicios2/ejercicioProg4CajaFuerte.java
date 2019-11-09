package Unidad4Ejercicios2;

import java.util.Scanner;

/**
  Realiza el control de acceso a una caja fuerte. La combinación será un
  número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
  acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
  y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
  Tendremos cuatro oportunidades para abrir la caja fuerte.
 */

public class ejercicioProg4CajaFuerte {

	public static void main(String[] args) {
		
		// Combinacion 1 5 4 9
		Scanner sc = new Scanner(System.in);
		
		int numeroCF = 1549;
		
		int numeroIntr=0;
		
		for (int num=1 ; num <=4 ; num++) {
			
			System.out.println("Introduce el pin de la caja fuerte:");
			numeroIntr = sc.nextInt();
			
			if(numeroIntr == numeroCF) {
				System.out.println("Pin correcto, caja abierta.");
				
				num=5;
				
			}else{
				System.out.println("Pin Incorrecto. Te quedan " + (4 - num) + " intentos restantes ");
				
			}
			
			
		}
		
		

	}

}
