
package Unidad4Ejercicios1;

import java.util.Scanner;
public class ejercicio14 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int anioNacimiento = 0;
         
         System.out.println("Introduce un tu año de nacimiento: ");
         
         anioNacimiento = sc.nextInt();
         
         if (anioNacimiento % 12 == 0){
             System.out.println("Tu año chino de nacimiento es el del MONO");
         }else if (anioNacimiento % 12 == 1){
             System.out.println("Tu año chino de nacimiento es el del GALLO");
         }else if (anioNacimiento % 12 == 2){
             System.out.println("Tu año chino de nacimiento es el del PERRO");
         }else if (anioNacimiento % 12 == 3){
             System.out.println("Tu año chino de nacimiento es el del CERDO");
         }else if (anioNacimiento % 12 == 4){
             System.out.println("Tu año chino de nacimiento es el del RATA");
         }else if (anioNacimiento % 12 == 5){
             System.out.println("Tu año chino de nacimiento es el del BUEY");
         }else if (anioNacimiento % 12 == 6){
             System.out.println("Tu año chino de nacimiento es el del TIGRE");
         }else if (anioNacimiento % 12 == 7){
             System.out.println("Tu año chino de nacimiento es el del CONEJO");
         }else if (anioNacimiento % 12 == 8){
             System.out.println("Tu año chino de nacimiento es el del DRAGON");
         }else if (anioNacimiento % 12 == 9){
             System.out.println("Tu año chino de nacimiento es el del SERPIENTE");
         }else if (anioNacimiento % 12 == 10){
             System.out.println("Tu año chino de nacimiento es el del CABALLO");
         }else if (anioNacimiento % 12 == 11){
             System.out.println("Tu año chino de nacimiento es el del OVEJA");
         }
             
    }
}
