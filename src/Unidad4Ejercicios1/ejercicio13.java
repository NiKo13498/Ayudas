/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad4Ejercicios1;
import java.util.*;
//Loteria
public class ejercicio13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numAleatorio_1 = (int)(Math.random()*9);
        int numAleatorio_2 = (int)(Math.random()*9);
        int num1;
        int num2;
        
        System.out.println("Introduce el primer número:");
        num1 = sc.nextInt();
        
        System.out.println("Introduce el segundo número:");
        num2 = sc.nextInt();
        
        System.out.println(" El numero premiado es:" + numAleatorio_1 + numAleatorio_2 );
        
        
        if (num1 == numAleatorio_1 && num2 == numAleatorio_2){
            System.out.println("Has ganado 10000 leuros, por que los digitos con los mismos y en el mismo orden.");
            
        }else if ((num1 == numAleatorio_1 && num2 == numAleatorio_2) || (num1 == numAleatorio_2 && num2 == numAleatorio_1)){
            System.out.println("Has ganado 3000 leuros, por que son los mismos numeros pero diferente orden.");
            
        }else if (num1 == numAleatorio_1 || num2 == numAleatorio_2){
            System.out.println("Has ganado 1000 leuros, por que solo has adivinado un solo número.");
            
        }else{
            System.out.println("No has ganado NADA.");
        }
    }
}
   