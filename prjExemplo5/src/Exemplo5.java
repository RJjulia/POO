
/**
 *
 * @author 0030482211021
 */
public class Exemplo5 {

   
    public static void main(String[] args) {
        
        double numero, resultado;
        int x = 1;
        
        numero = Math.random();
        numero =  numero * 100;
        
        while(x<=10) {
            
            resultado = numero * x;
            System.out.println(numero + "x" + x + "=" + resultado);
            x++;
            
        }
    }
    
}
