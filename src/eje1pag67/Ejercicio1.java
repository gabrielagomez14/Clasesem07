/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eje1pag67;

import java.util.*;

/**
 *
 * @author pc
 */
public class Ejercicio1 {
    
    public void mostrar(){
        int num1=0;
        int num2=0; 
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese un numero");
        num1=sc.nextInt();
        
        System.out.println("ingrese un numero");
        num2=sc.nextInt();
        System.out.println("El resultado es: "+ String.valueOf(proceso(num1,num2)));
    
    }
    
    public int proceso(int num1, int num2){
        int  resultado=0;
        if(num1==num2){
            resultado=num1+num2;
        } else {
            resultado=num1*num2;
        }
     return resultado;
    }
    
    
}
