
package Unidad1Ejercicios3;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner scannerGrados = new Scanner(System.in);

        System.out.println(" ####Conversion ºF a ºC / ºC a ºF ");
        System.out.println(" Escribe 0 si quiere convertir de Fº a Cº y escriba 1 si quiere de ºC a ºF");

        int celsiusYfahrenheit = scannerGrados.nextInt();

        if (celsiusYfahrenheit == 0) {

            System.out.println("Ha elegido pasar de ºF a ºC, escriba el número de ºF que desea convertir:");
            int fAc = scannerGrados.nextInt();
            System.out.println("El resultado de conversión de ºF a ºC es: " + ((fAc - 32) / 1.8));

        } else if (celsiusYfahrenheit == 1) {

            System.out.println("Ha elegido pasar de ºC a ºF, escriba el número de ºF que desea convertir:");
            int cAf = scannerGrados.nextInt();
            System.out.println("El resultado de conversión de ºC a ºF es: " + ((cAf * 1.8) + 32));
            
        } else {
            
            System.out.println("Por favor, el numero a introducir debe ser 0 o 1");
            
        }

    }
}
