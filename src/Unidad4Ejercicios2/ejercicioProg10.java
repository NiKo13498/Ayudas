package Unidad4Ejercicios2;

import java.util.Scanner;

public class ejercicioProg10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
	    System.out.println("Por favor, vaya introduciendo números.");
	    System.out.println("El programa terminará cuando la suma de los números sea mayor que 10000.");
	    
	    int suma = 0;
	    int numeroDeElementos = 0;
	    
	    for (int numIntro = 0 ; suma < 10000  ; numeroDeElementos++) {
	    	
	    	numIntro = sc.nextInt();
	    	suma += numIntro;
	    	
	    }

	    System.out.println("Ha introducido un total de " + numeroDeElementos + " números.");
	    System.out.println("La suma total es " + suma + ".");
	    System.out.println("La media es " + suma / numeroDeElementos + ".");

	}

}
