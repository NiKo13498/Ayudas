/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad4Ejercicios1;
import java.util.Scanner;


public class ejercicio17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Numero 1:");
        double x = input.nextDouble();
        
        System.out.println("Numero 2:");
        double y = input.nextDouble();
        
        System.out.println("Numero 3:");
        double z = input.nextDouble();
        
        System.out.println((x < y && y < z)? "Ordenado" : "No ordenado");
    }
   
}
