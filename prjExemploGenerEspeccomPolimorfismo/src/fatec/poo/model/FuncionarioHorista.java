package fatec.poo.model;

public class FuncionarioHorista extends Funcionario{
    //atributos
    private double valHoraTrab;
    private int qtHoraTrab;
    
    //construtor

    public FuncionarioHorista(int registro, String nome, String dtAdmissao, String cargo, double valHoraTrab) {
        super(registro, nome, dtAdmissao, cargo);
        this.valHoraTrab = valHoraTrab;
        this.qtHoraTrab = qtHoraTrab;
    }
   
    
    //get and set
    public double getValHoraTrab() {
        return valHoraTrab;
    }
    

    public void setValHoraTrab(double valHoraTrab) {
        this.valHoraTrab = valHoraTrab;
    }

    public int getQtHoraTrab() {
        return qtHoraTrab;
    }

    public void setQtHoraTrab(int qtHoraTrab) {
        this.qtHoraTrab = qtHoraTrab;
    }
    
    public double calcGratificacao(){
        return (calcSalBruto() * 0.075);
    }
    
    public double calcSalLiquido(){
        return (calcSalBruto() + calcGratificacao() - calcDesconto());
    }

    @Override
    public double calcSalBruto() {
        return (valHoraTrab * qtHoraTrab);
    }
    
}
