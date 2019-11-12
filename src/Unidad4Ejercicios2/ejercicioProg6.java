package Unidad4Ejercicios2;
import java.util.Scanner;
public class ejercicioProg6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num;
		int i;
		
		System.out.println("Introduce un numero para saber cuantos digitos tiene:");
		num = sc.nextInt();
		
		for (i = 0 ; num > 0 ; i++) {
			
			 num = num/10;
			 
		}
			System.out.println("El numero tiene " + i + " cifras.");
			
// Otra forma:
// https://github.com/LuisJoseSanchez/aprende-java-con-ejercicios/blob/master/soluciones/05_Bucles/S05Ejercicio09.java
			
	}

}
