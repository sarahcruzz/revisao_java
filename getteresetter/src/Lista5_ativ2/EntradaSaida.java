package Lista5_ativ2;

import java.util.Scanner;

public class EntradaSaida {
    // criando o método para obter o salário bruto
    public double obterSalario(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do salário bruto: R$");
        double salario = scanner.nextDouble();

        return salario;
    }

    public int qtdHorasExtras(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de horas extras que foram feitas: ");
        int horas = scanner.nextInt();

        return horas;
    }

    public String mostrarFolhaPagamento(double salarioBruto, double inss, double irpf, double planoSaude, double acrescimoHoraExtra, double salarioLiquido){
        return String.format("\n-- FOLHA DE PAGAMENTO --" +
                "\nSalário Bruto: R$%.2f" +
                "\nDesconto INSS: R$%.2f" +
                "\nDesconto IRPF: R$%.2f" +
                "\nPlano de Saúde: R$%.2f"+
                "\nAcréscimo Horas Extras: R$%.2f" +
                "\n\nSalário Líquido: R$%.2f", salarioBruto, inss, irpf, planoSaude, acrescimoHoraExtra, salarioLiquido);
    }
}
