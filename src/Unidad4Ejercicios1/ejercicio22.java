
package Unidad4Ejercicios1;
import java.util.Scanner;

public class ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double peso;
        
        System.out.println("Escribe el peso del paquete:");
        
        peso = sc.nextDouble();
        
        if (peso > 0 && peso <= 2){
            System.out.println("El coste del envio es de " + peso * 2.5 + "$" );      
        }else if (peso > 2 && peso <= 4){
            System.out.println("El coste del envio es de " + peso * 4.5 + "$" );
        }else if (peso > 4 && peso <= 10){
            System.out.println("El coste del envio es de " + peso * 7.5 + "$" );
        }else if (peso > 10 && peso <= 20){
            System.out.println("El coste del envio es de " + peso * 10.5 + "$" );
        }else {
            System.out.println("El paquete no puede ser enviado.");
        }
        
      
       
        
    }
}
