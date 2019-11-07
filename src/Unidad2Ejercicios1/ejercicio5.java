
package Unidad2Ejercicios1;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe la longitud de los lados del triangulo:");
        
        int lado = sc.nextInt();
       
        //Area
        
        double area = ((1.73 / 4) * (lado * lado));
        double volumen = (area * (lado * 3));
        System.out.println("El Area de un triangulo es: " + area);
        
        System.out.println("El volumen de un triangulo equilatero es: " + volumen);
        
        
    }
}
//1.73 raiz cua