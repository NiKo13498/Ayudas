
package Unidad2Ejercicios1;
/*
  Realice un programa que calcule la nota que hace falta sacar en el 
   segundo examen de la asignatura Programación para obtener la media deseada.
   Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la del
   segundo examen un 60%.
    -Ejemplo:
      Introduce la nota del primer examen: 7
      ¿Qué nota quieres sacar en el trimestre? 8.5
      Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
*/

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double nota1;
        double notaTrimestre;
        
        System.out.println("Introduce la nota del primer examen: ");
        
        nota1 = sc.nextDouble();
        
        System.out.println("Introduce la nota que quieres sacar en el trimestre:");
        
        notaTrimestre = sc.nextDouble();
        
        double nota2 = ((notaTrimestre * 100) - (nota1 * 40)) / 60;
        System.out.println("Para tener un " + notaTrimestre + 
        " en el trimestre necesitas sacar un " + nota2 + " en el segundo examen."  );
    }
}
