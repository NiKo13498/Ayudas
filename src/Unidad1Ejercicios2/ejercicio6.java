
package Unidad1Ejercicios2;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        
        /*Regla de 100  
        Ej.
       
            100km - 7L
            60km  -  x --> 60*7/100
        
        */
        
        Scanner trayectoCoche = new Scanner(System.in);
        
        double kilometros;
        
        double precioLitroGasolina;
       
        System.out.println("Introduce los Kilometros:");
        
        kilometros = trayectoCoche.nextDouble();
        
        System.out.println("Introduce el precio de euros/L: ");
        
        precioLitroGasolina = trayectoCoche.nextDouble();
        
        System.out.println("Tu gasto por ese trayecto es:  " + (kilometros * precioLitroGasolina) / 100 ); 
        

        
    }
}
