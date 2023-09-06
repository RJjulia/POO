package fatec.poo.model;

public class ContaCorrente {
    private int numeroConta;
    private double saldoConta;
    
    //construtor
    public ContaCorrente(int numeroConta, double saldoConta) {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }
    
    //get and set
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
    
    //demais métodos
    public void sacar(double valor){
        if(valor <= saldoConta){
            saldoConta = saldoConta - valor;
        } else {
            System.out.println("SALDO INSUFICIENTE");
        }
    }
    
    public void depositar(double val){
        saldoConta = saldoConta + val;
    }
    
    
}
