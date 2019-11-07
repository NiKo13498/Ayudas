
package Unidad2Ejercicios1;
/*
12(Separación de los dígitos en un entero) Escribe una aplicación que requiere
 del usuario un número compuesto por cinco dígitos, separe ese número en sus 
 dígitos individuales y los imprima, cada uno separado de los demás por tres espacios. 
*/


import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        int quinto;
        int cuarto;
        int tercero;
        int segundo;
        int primero;
        
        System.out.println("Escribe un número de 5 digitos:");
        
        numero = sc.nextInt();
        
        quinto = numero%10;
        
        numero = numero/10;
        cuarto = numero%10;
        
        numero = numero/10;
        tercero = numero%10;
        
        numero = numero/10;
        segundo = numero%10;
        
        numero = numero/10;
        primero = numero%10;
        
        System.out.println("Los números separados son:");
        
        System.out.printf("%d  %d  %d  %d  %d  \n", primero, segundo, tercero, cuarto, quinto);
        
        //System.out.println(primero + segundo + tercero + cuarto + quinto); Asi NO tira.
    }
}