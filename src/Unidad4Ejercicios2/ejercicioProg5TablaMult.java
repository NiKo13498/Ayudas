package Unidad4Ejercicios2;
import java.util.Scanner;
public class ejercicioProg5TablaMult {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 
		 int num;
		 
		 System.out.println("Introduce un numero.");
		 
		 num = sc.nextInt();
		 
		 for(int m = 1 ; m < 10 ; m++) {
			 
			 System.out.println(num + " * " + m + " = " + num * m);
			 
		 }

	}

}
