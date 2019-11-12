package Unidad4Ejercicios2;

import java.util.Scanner;

public class ejercicioProg7 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	int num = 0;
		  System.out.println("Por favor, introduzca 10 números enteros: ");
		  num = sc.nextInt();
		  
		    int negativos = 0;
		    int positivos = 0;
		    
		    for (int i = 0; i < 10; i++) {
		    
		      if (num < 0) {
		        negativos++;
		      } else {
		        positivos++;
		      }
		    }
		    
		    System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos");
	}

}
