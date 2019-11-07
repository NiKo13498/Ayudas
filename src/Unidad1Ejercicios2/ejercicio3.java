
package Unidad1Ejercicios2;
import java.util.Scanner;


public class ejercicio3 {
    public static void main (String args[]) {
        
        int num1;
        int num2;
        int num3;
        
        Scanner numeros = new Scanner(System.in);
        
        System.out.println("++++ Escribe 3 números ++++");
        
        System.out.println("Escribe el primer: ");
        
        num1 = numeros.nextInt();
        
        System.out.println("Escribe el segundo: ");
        
        num2 = numeros.nextInt();
        
        System.out.println("Escribe el tercero : ");
        
        num3 = numeros.nextInt();
        
        int suma = (num1 + num2 + num3);
        
        System.out.println("Suma = " + suma);
        
        int promedio = (suma / 3);
        
        System.out.println("Promedio = " + promedio);
        
        int producto = (num1 * num2 * num3);
        
        System.out.println("Producto = " + producto);
        
        
    }
}