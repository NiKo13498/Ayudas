package Unidad4Ejercicios2;

import java.util.Scanner;

public class ejercicioProg8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int base=0;
		int exponente=0;
		int tatalPotencia=0;
		
		System.out.println("Escribe la base de una potencia:");
		base = sc.nextInt();
		
		System.out.println("Escribe el exponente de una potencia:");
		exponente = sc.nextInt();
		
		double potencia = 1;
        
	    if (exponente == 0) {
	      potencia = 1;
	    }
	    
	    if (exponente > 0) {
	    	
	      for (int i = 0; i < exponente; i++) {
	    	  
	        potencia *= base;
	        
	      }
	      
	    }
	    
	    System.out.println(base + "^" + exponente + " = " + potencia);
	  }
	
}


