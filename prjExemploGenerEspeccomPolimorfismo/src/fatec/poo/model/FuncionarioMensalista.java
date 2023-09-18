package fatec.poo.model;

public class FuncionarioMensalista extends Funcionario{
    //atributos
    private double valorSalMin;
    private double numSalMin;

    public FuncionarioMensalista(int registro, String nome, String dtAdmissao, String cargo, double valorSalMin) {
        super(registro, nome, dtAdmissao, cargo);
        this.valorSalMin = valorSalMin;
    }

    public void setNumSalMin(double numSalMin) {
        this.numSalMin = numSalMin;
    }

    @Override
    public double calcSalBruto() {
       return (valorSalMin * numSalMin);
    }
   
}
