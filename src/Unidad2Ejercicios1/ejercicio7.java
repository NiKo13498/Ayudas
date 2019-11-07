/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad2Ejercicios1;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      
        
        int cantidad;
        int unidad;
        
        System.out.println("Introduce la unidad:");
        unidad = sc.nextInt();
        
        System.out.println("Introduce la cantidad:");
        cantidad = sc.nextInt();
        
        if (unidad == 0){System.out.println("Son " + cantidad/(1024) + " Bytes");}
        if (unidad == 1){System.out.println("Son " + cantidad/(1024 * 1024) + " Kilobytes");}
        if (unidad == 2){System.out.println("Son " + cantidad/(1024 * 1024 * 1024) + " Megabytes");}
        if (unidad == 3){System.out.println("Son " + cantidad/(1024 * 1024 * 1024 * 1024) + " Gigabytes");}
        if (unidad == 4){System.out.println("Son " + cantidad/(1024 * 1024 * 1024 * 1024 * 1024) + "Terabyte");}
               
    }
}
