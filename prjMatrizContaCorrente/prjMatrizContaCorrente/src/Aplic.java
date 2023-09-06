import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Aplic {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        ContaCorrente[] conta = new ContaCorrente[5];
        double valDep, valSac, valSaldo;
        int opcao, num;
        boolean contaEncontrada = false;
        
        System.out.println("Digite o numero da conta: ");
        num = entrada.nextInt();
        System.out.println("Digite o saldo da Conta: ");
        valSaldo = entrada.nextDouble();
        conta[0] = new ContaCorrente(num,valSaldo);
        System.out.println("Digite o numero da conta: ");
        num = entrada.nextInt();
        System.out.println("Digite o saldo da Conta: ");
        valSaldo = entrada.nextDouble();
        conta[1] = new ContaCorrente(num,valSaldo);
        System.out.println("Digite o numero da conta: ");
        num = entrada.nextInt();
        System.out.println("Digite o saldo da Conta: ");
        valSaldo = entrada.nextDouble();
        conta[2] = new ContaCorrente(num,valSaldo);
        System.out.println("Digite o numero da conta: ");
        num = entrada.nextInt();
        System.out.println("Digite o saldo da Conta: ");
        valSaldo = entrada.nextDouble();
        conta[3] = new ContaCorrente(num,valSaldo);
        System.out.println("Digite o numero da conta: ");
        num = entrada.nextInt();
        System.out.println("Digite o saldo da Conta: ");
        valSaldo = entrada.nextDouble();
        conta[4] = new ContaCorrente(num,valSaldo);
        
        do{
            System.out.println("\n\n1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Listar Contas");
            System.out.println("5 - Sair");
            System.out.println("\nDigite a opcao: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1 :
                    System.out.println("Digite o numero da conta: ");
                    num = entrada.nextInt();
                    
                    for(int i = 0; i<5;i++){
                        if(conta[i].getNumeroConta() == num){
                           System.out.println("Conta " + conta[i].getNumeroConta());
                           System.out.println("Digite o valor a ser sacado: ");
                           valSac = entrada.nextDouble();
                           
                           conta[i].sacar(valSac);
                           contaEncontrada = true;
                           break;
                        }
                    }
                    
                    if(contaEncontrada == false){
                        System.out.println("Essa conta nao existe");
                    }
                    break;
                case 2 :
                    System.out.println("Digite o numero da conta: ");
                    num = entrada.nextInt();
                    
                    for(int i = 0; i<5;i++){
                        if(conta[i].getNumeroConta() == num){
                           System.out.println("Conta " + conta[i].getNumeroConta());
                           System.out.println("Digite o valor a ser depositado: ");
                           valDep = entrada.nextDouble();
                           
                           conta[i].depositar(valDep);
                           contaEncontrada = true;
                           break;
                        }
                    }
                    
                    if(contaEncontrada == false){
                       System.out.println("Essa conta nao existe");
                    }
                    break;
                    
                case 3 :
                    System.out.println("Digite o numero da conta: ");
                    num = entrada.nextInt();
                    
                    for(int i = 0; i<5;i++){
                        if(conta[i].getNumeroConta() == num){
                           System.out.println("Conta " + conta[i].getNumeroConta());
                           System.out.println(df.format(conta[i].getSaldoConta()));
                           
                           contaEncontrada = true;
                           break;
                        }
                    }
                    
                    if(contaEncontrada == false){
                       System.out.println("Essa conta nao existe");
                    }
                   
                    break;
                    
                case 4 :
                    System.out.println("\nConta");
                    System.out.println("Saldo");
                    
                    for(int i = 0; i<5; i++){
                        System.out.println(conta[i].getNumeroConta());
                        System.out.println("\t" + df.format(conta[i].getSaldoConta()));
                    }
                    break;
            }
        } while(opcao < 5);
    }
    
}
