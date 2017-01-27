/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.egervaccir.a3p1;
import java.util.Scanner;
import java.lang.Math.*;

/**
 *
 * @author alumno
 */
public class SPP2EGervacciRA3P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Coin Flip");
        // Simulación de lanzamiento de moneda.
        
        // Variables.
        Scanner teclado = new Scanner (System.in);
        
        double r;
        String c;
        String d;
        
        //Ejecución
        System.out.println("¿Sol o Águila?");
        d = teclado.nextLine();
        
                
        r = Math.round(Math.random());       
        
        if (r < 1) {
            c= "Águila";
        }else
            c = "Sol";
        
        
        System.out.println("¡"+c+"!");
     
            
        
        
        
                
       
    }
    
}
