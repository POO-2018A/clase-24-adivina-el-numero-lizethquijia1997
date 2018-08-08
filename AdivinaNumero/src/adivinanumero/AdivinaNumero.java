/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinanumero;

import java.util.Random;

/**
 *
 * @author ESFOT
 */
public class AdivinaNumero {

    
   
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random numAleatorio = new Random();
        int numero=numAleatorio.nextInt(1000);
        
        System.out.println(""+numero);
    }
    
}
