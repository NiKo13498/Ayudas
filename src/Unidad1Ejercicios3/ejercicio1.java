
package Unidad1Ejercicios3;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
         Scanner califScanner = new Scanner (System.in);
        
        System.out.println("Introduce un valor entre 0 y 10");
        
        int calificacion = califScanner.nextInt();
        
        if (calificacion == 10){
            System.out.println("Su calificacion es MATRICULA DE HONOR" );
        }
        else if(calificacion == 9){
            System.out.println("Su calificacion es un SOBRESALIENTE");
        }
        else if(calificacion >=7 && calificacion <=8){
            System.out.println("Su calificaccion es un NOTABLE");
        }
        else if(calificacion == 6){
            System.out.println("Su calificaccion es una BIEN");
        }
        else if(calificacion == 5){
            System.out.println("Su calificaccion es una SUFICIENTE");
        }
        else if(calificacion <=5){
            System.out.println("Su calificación es un INSUFICIENTE");
        }
        else{
            System.out.println("Valor desconocido. Por favor, Introduzca un valor que sea válido entre 0 y 10.");
        } 
    }
}
