
package Unidad4Ejercicios1;
import java.util.Scanner;
public class ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe los 9 digitos para calcular los 10 del ISBN:");
   
        System.out.println("Número 1: ");
        int d1 = sc.nextInt();
        System.out.println("Número 2: ");
        int d2 = sc.nextInt();
        System.out.println("Número 3: ");
        int d3 = sc.nextInt();
        System.out.println("Número 4: ");
        int d4 = sc.nextInt();
        System.out.println("Número 5: ");
        int d5 = sc.nextInt();
        System.out.println("Número 6: ");
        int d6 = sc.nextInt();
        System.out.println("Número 7: ");
        int d7 = sc.nextInt();
        System.out.println("Número 8: ");
        int d8 = sc.nextInt();
        System.out.println("Número 9: ");
        int d9 = sc.nextInt();
        
        int d10 = ((d1*1) + (d2*2) + (d3*3) + (d4*4) + (d5*5) + (d5*6) + (d6*7) + (d8*8) + (d9*9)) % 11;
        
        if (d10 == 10){
            System.out.println("El numero ISBN completo es: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
        }else{
            System.out.println("El numero ISBN completo es: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
        }
          
    }
}
