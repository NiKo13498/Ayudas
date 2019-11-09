package Unidad4Ejercicios2;
import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Escribe un numero: ");
		num = sc.nextInt();
		
		
		if (num % 4 == 0 && num % 5 == 0 ) {
			System.out.println(num + " es divible por 4 y por 5 a la vez.");
			
		}else if (num % 4 == 0 || num % 5 == 0 ) {
			System.out.println(num + " es divible por 4 o por 5 a la vez.");
			
		}else if (num % 4 == 0 ^ num % 5 == 0 ) {
			System.out.println(num + " es divible por 4 y por 5 pero no por ambos.");
			
		}else {
			System.out.println(num + " no es divisible ni por 4 ni por 5.");
		}
		
		
	}

}
