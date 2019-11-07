
package Unidad2Ejercicios1;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        /*
        Crea un programa llamado MostrarTiempo.java que tomando una cantidad por teclado de segundos (entero positivo) muestre
        la cantidad de minutos y segundos contenidos. Ejemplo salida:
        
        -Introduzca un entero para segundos: 500
        500 seconds son 8 minutos y 20 segundos
        Nota: para calcular los segundos se puede hacer uso de módulo pues el resto son los segundos que faltan.
        */
        
        Scanner sc = new Scanner(System.in);
        
        int segundos;
        
        System.out.println("Escriba un número entero en segundos: ");
        
        segundos = sc.nextInt();
        
        int minutos = segundos / 60;
        
        int restoSeg = segundos % 60;
        
        System.out.println(segundos + " segundos son " + minutos + " minutos " + " y " + restoSeg + " segundos") ;
        
        
    }
}
