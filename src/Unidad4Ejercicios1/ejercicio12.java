
package Unidad4Ejercicios1;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int anio = 0;
        
        System.out.println("Escribe un año para ver si este es bisiesto o no: ");
        
        anio = sc.nextInt();
        
        if(anio % 4 == 0 && anio % 100 !=0 || anio % 400 == 0){
            System.out.println(anio + " es un año bisiesto");
        }else{
            System.out.println(anio + " No es un año bisiesto");
        }
        
        
    }
}
