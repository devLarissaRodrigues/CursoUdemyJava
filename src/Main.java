import secao14HerancaPolimorfismo.exercicio01.Funcionario;
import secao14HerancaPolimorfismo.exercicio01.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();
        char terceirizado;
        String nome;
        int horas;
        double valorPorHora;
        double despesaAdicional;

        System.out.print("Entre com o número de funcionários: ");
        int qtdFuncionarios = sc.nextInt();

        for(int i = 1; i <= qtdFuncionarios; i++){
            System.out.print("\nDados do funcionário #" + i + " :\n");
            System.out.print("Terceirizado (s/n)? ");
            terceirizado = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            nome = sc.nextLine();
            System.out.print("Horas: ");
            horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            valorPorHora = sc.nextDouble();

            if(terceirizado == 's'){
                System.out.print("Despesa adicional: ");
                despesaAdicional = sc.nextDouble();
                FuncionarioTerceirizado funcionarioTerceirizado = new FuncionarioTerceirizado(nome, horas, valorPorHora, despesaAdicional);
                funcionarios.add(funcionarioTerceirizado);
            }
            else{
                Funcionario funcionario = new Funcionario(nome, horas, valorPorHora);
                funcionarios.add(funcionario);
            }
        }
        System.out.println("\nPagamentos: ");
        for(Funcionario funcionario: funcionarios){
            System.out.print(funcionario.getNome() + " - R$ " + funcionario.pagamento() + "\n");
        }
    }
}