

/**
 *
 * @author 0030482211021
 */
public class Exemplo6 {

  
    public static void main(String[] args) {
        
        //matrizes
        double tabNum[], numero;
        tabNum = new double[5];
        
        for(int x=0; x<5; x++) {
            
            numero = Math.random();
            numero = numero *100;
            tabNum[x]=numero;
        }
        
        for(int y=0; y<5; y++) {
            
            System.out.println("Posição" + y + "=" + tabNum[y]);
            
        }
        
    }
    
}
