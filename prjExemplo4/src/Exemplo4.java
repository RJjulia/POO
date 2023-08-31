/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0030482211021
 */
public class Exemplo4 {

    
    public static void main(String[] args) {
        
        //estrutura repetitivas
        double numero, resultado;
        
        numero = Math.random();
        numero = numero * 100;
        
        for(int x=0; x<10; x++) {
            
            resultado = numero * x;
            System.out.println(numero + " x " + x + " = " + resultado);
            
        }
        
    }
    
}
