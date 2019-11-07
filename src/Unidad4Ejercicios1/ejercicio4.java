/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad4Ejercicios1;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int estadoCivil=0;
        double salario=0;
        
        System.out.println("Elige tu estado civil:\n 0 -> Soltero/a \n 1 -> Recien casado/a o viudo/a \n 2 -> Casados/as y separados/as \n 3 -> Cabeza de familia"); 
        estadoCivil = sc.nextInt();
        
        System.out.println("Salario: ");
        salario = sc.nextInt();

        switch (estadoCivil){
            case 0:
                if(salario >= 0 && salario <= 8350)
                    salario=salario * 0.1;
                
                if(salario >= 8351 && salario <= 33950)
                    salario=salario * 0.15;
                
                if(salario >= 33951 && salario <= 82250)
                    salario=salario * 0.25;
                
                if(salario >= 82251 && salario <= 171550)
                    salario=salario * 0.28;
                
                if(salario >= 171551 && salario <= 372950)
                    salario=salario * 0.33;
                
                if(salario >= 372951)
                    salario=salario * 0.35;
                break;
            
            case 1:
                if(salario >= 0 && salario <= 16700)
                    salario=salario * 0.10;
                
                if(salario >= 16701 && salario <= 67900)
                    salario=salario * 0.15;
                
                if(salario >= 67901 && salario <= 137050)
                    salario=salario * 0.25;
                
                if(salario >= 137051 && salario <= 208850)
                    salario=salario * 0.28;
                
                if(salario >= 208851 && salario <= 372950)
                    salario=salario * 0.33;
                
                if(salario >= 372951)
                    salario=salario * 0.35;
                break;
                
                case 2:
                if(salario >= 0 && salario <= 8350)
                    salario=salario * 0.1;
                
                if(salario >= 8351 && salario <= 33950)
                    salario=salario * 0.15;
                
                if(salario >= 33951 && salario <= 68525)
                    salario=salario * 0.25;
                
                if(salario >= 68525 && salario <= 104425)
                    salario=salario * 0.28;
                
                if(salario >= 104425 && salario <= 186475)
                    salario=salario * 0.33;
                
                if(salario >= 186476)
                    salario=salario * 0.35;
                break;
                
                case 3:
                if(salario >= 0 && salario <= 11950)
                    salario=salario * 0.1;
                
                if(salario >= 11951 && salario <= 45500)
                    salario=salario * 0.15;
                
                if(salario >= 45501 && salario <= 117450)
                    salario=salario * 0.25;
                
                if(salario >= 117451 && salario <= 190200)
                    salario=salario * 0.28;
                
                if(salario >= 190201 && salario <= 372950)
                    salario=salario * 0.33;
                
                if(salario >= 372951)
                    salario=salario * 0.35;
                break;
                        
        }
        
        
        System.out.println("Tasa total: " + salario);
        
    }
}