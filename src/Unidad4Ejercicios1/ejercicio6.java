
package Unidad4Ejercicios1;

import java.util.Scanner;


public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Escribe un numero: ");
        
        numero = sc.nextInt();
        
              if ((numero%2 == 0) && (numero%3 == 0)){
                    System.out.println(numero + " es divible por 2 y por 3 a la vez.");
                    
                }else if ((numero%2 == 0) || (numero%3 == 0)){
                    System.out.println(numero + " es divible por 2 o por 3.");
                    
                    }else if ((numero%2 == 0) ^ (numero%3 == 0)){
                         System.out.println(numero + " es divible por 2 o por 3 pero no por ambos.");
                    }


    } 
}

