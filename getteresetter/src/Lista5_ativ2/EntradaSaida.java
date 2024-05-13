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

    public double qtdHorasExtras(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do salário bruto: R$");
        double horas = scanner.nextDouble();

        return horas;
    }
}
