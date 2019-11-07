
package Unidad1Ejercicios2;
import java.util.Scanner;

public class ejercicio1 {
    public static void main (String args[]) {
        double numeroA;
        
        double numeroB;
        
        Scanner operaciones = new Scanner(System.in);
        
        System.out.println("Introduce el numera A: ");
        
        numeroA = operaciones.nextInt();
        
        System.out.println("Introduce el numero B: ");
        
        numeroB = operaciones.nextInt();
        
        double suma = (numeroA + numeroB);
        
        System.out.println("Suma es igual a: " + suma);
        
        double resta = (numeroA - numeroB);
        
        System.out.println("Resta es igual a: " + resta);
        
        double multiplicacion = (numeroA * numeroB);
        
        System.out.println("Multiplicacion es igual a: " + multiplicacion);
        
        double division = (numeroA / numeroB);
        
        System.out.println("Division es igual: " + division);
        
    }
}