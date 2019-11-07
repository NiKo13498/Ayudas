
package Unidad1Ejercicios2;
import java.util.Scanner;

public class ejercicio5 {
    public static void main (String args[]){
        
        Scanner bmi = new Scanner (System.in);
        
        double pesoEnKilos;
        double alturaEnMetros;
        
        System.out.println("Escriba su peso en Kilos: ");
        
        pesoEnKilos = bmi.nextDouble();
        
        System.out.println("Escriba su altura en Metros: ");
        
        alturaEnMetros = bmi.nextDouble();
        
        double operacion = (pesoEnKilos / (alturaEnMetros * alturaEnMetros));
        
        System.out.println("BMI: " + operacion);
       
        System.out.println("Valores del BMI\nERES UNA PALILLO: menos de 18.5\nPeso Normal: entre 18.5 y 24.9\nSobrepeso: entre 25 y 29.9\nDEJA DE MERENDAR BOLLICAOS PUTO GORDO: 30 o más");
    }
}