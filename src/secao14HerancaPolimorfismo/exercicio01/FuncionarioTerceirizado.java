package secao14HerancaPolimorfismo.exercicio01;

public class FuncionarioTerceirizado extends Funcionario{
    private double despesaAdicional;

    public FuncionarioTerceirizado() {
    }

    public FuncionarioTerceirizado(String nome, int horasTrabalhadas, double valorPorHora, double despesaAdicional) {
        super(nome, horasTrabalhadas, valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }
    @Override
    public double pagamento(){
        return super.pagamento() + (1.1 * despesaAdicional);
    }
}