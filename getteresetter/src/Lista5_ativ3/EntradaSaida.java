package Lista5_ativ3;

import java.util.Scanner;

public class EntradaSaida {
    // criando os métodos de entrada e saída

    public double obterSalario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do salário atual: R$");
        double salario = scanner.nextDouble();

        return salario;

    }

    public double valorEmprestimo(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Digite o valor que gostaria de emprestar: R$");
            double valorEmprestimo = scanner.nextDouble();


        return valorEmprestimo;
    }

}
