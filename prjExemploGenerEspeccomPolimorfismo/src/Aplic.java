
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

public class Aplic {


    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        FuncionarioHorista funcHora = new FuncionarioHorista(1010,
                                                             "Pedro Silveira",
                                                             "14/05/1978",
                                                             "Programador",
                                                               15.80);
       
        funcHora.setQtHoraTrab(90);
        
        System.out.println("Registro   => " + funcHora.getRegistro());
        System.out.println("Nome   => " + funcHora.getNome());
        System.out.println("Data Admissao   => " + funcHora.getDtAdmissao());
        System.out.println("Salario Bruto   => " + df.format(funcHora.calcSalBruto()));
        System.out.println("Desconto   => " + df.format(funcHora.calcDesconto())); 
        System.out.println("Salario Liquido   => " + df.format(funcHora.calcSalLiquido()));
        System.out.println("Cargo   => " + funcHora.getCargo());
        
        System.out.println("-----  -----  -----  -----");
        
        FuncionarioMensalista funcMes = new FuncionarioMensalista(2020,
                                                                   "Tonio Mendes",
                                                                    "12/12/2000",
                                                                    "Gerente",
                                                                      1200.0);
        
        funcMes.setNumSalMin(4);
        
        System.out.println("Registro   => " + funcMes.getRegistro());
        System.out.println("Nome   => " + funcMes.getNome());
        System.out.println("Data Admissao   => " + funcMes.getDtAdmissao());
        System.out.println("Salario Bruto   => " + df.format(funcMes.calcSalBruto()));
        System.out.println("Desconto   => " + df.format(funcMes.calcDesconto()));
        System.out.println("Salario Liquido   => " + df.format(funcMes.calcSalLiquido()));
        System.out.println("Cargo   => " + funcMes.getCargo());
    }
    
}
