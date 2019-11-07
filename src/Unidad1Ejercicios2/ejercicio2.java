
package Unidad1Ejercicios2;
import java.util.Scanner;

public class ejercicio2 {
    public static void main (String args[]) {
        
    int radio;

    Scanner circulo = new Scanner (System.in);
   
    System.out.println("Introduce el radio del circulo: ");
    
    radio = circulo.nextInt();
    
    int diametro = (2 * radio);
    
    double pi = 3.14159;
    
    double circunferencia = (2 * pi * radio);
    
    double area = (pi * radio * radio);
    
    System.out.println("Diametro = " + diametro);
    
    System.out.println("Circunferencia = " + circunferencia);
    
    System.out.println("Area = " + area);
    
    
    }
}