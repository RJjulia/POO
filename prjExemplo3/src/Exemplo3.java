
import static java.lang.Math.random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0030482211021
 */
public class Exemplo3 {

    public static void main(String[] args) {
        
        double numero;
        
        numero = random();
        numero = numero * 100;
        
        if(numero < 50) {
            System.out.println("O número " + numero + " é menor que 50");
        } else if(numero > 50) {
            System.out.println("O numero " + numero + " é maior que 50");
        }
    }
    
}
