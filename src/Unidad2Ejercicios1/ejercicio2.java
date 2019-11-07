
package Unidad2Ejercicios1;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        /*
        (Convertir de millas a km): Escribe un programa que lea millas 
        como valor double de la consola y lo convierta en km mostrando el resultado. 
        La fórmula para la conversión es: 1 milla = 1.6 km 
        */
        
        Scanner sc = new Scanner(System.in);
        
        double millas;
        
        System.out.println("Escribe las millas para convertirlas a kilometros:");
        
        millas = sc.nextDouble();
        
        System.out.println(millas + " Millas son " + (millas * 1.6) / 1 + " Kilometros");
        
        
    }
}
