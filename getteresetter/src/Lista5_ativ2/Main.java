package Lista5_ativ2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declaração de variáveis
        String escolha;
        double salarioBruto, qtdHorasExtras, descontoINSS, descontoIRPF, valorPlanoSaude, acrescimoHorasExtras, salarioLiquido;

        // instanciando o objeto das classes
        Scanner scanner = new Scanner(System.in);

        Calculo calculo = new Calculo();
        Validacao validacao = new Validacao();
        EntradaSaida entradaSaida = new EntradaSaida();

        // PROCESSAMENTO
        while (true){
            System.out.print("\nGostaria de iniciar o programa Folha de Pagamento? (s/n) ");
            escolha = scanner.next();

            if (escolha.equalsIgnoreCase("s")){
                salarioBruto = entradaSaida.obterSalario();
                qtdHorasExtras = entradaSaida.qtdHorasExtras();

                while (true){
                    if (validacao.validarSalario(salarioBruto)) {
                        descontoINSS = calculo.descontoINSS(salarioBruto);
                        descontoIRPF = calculo.descontoIRPF(salarioBruto);
                        valorPlanoSaude = calculo.descontoSaude(salarioBruto);
                        acrescimoHorasExtras = calculo.acrescimoHorasExtras(qtdHorasExtras, salarioBruto);


                        salarioLiquido = calculo.obterSalarioLiquido(salarioBruto, descontoINSS, descontoIRPF, valorPlanoSaude, acrescimoHorasExtras);
                        System.out.println(entradaSaida.mostrarFolhaPagamento(salarioBruto, descontoINSS, descontoIRPF, valorPlanoSaude, acrescimoHorasExtras, salarioLiquido));


                        break;
                    }
                    System.out.print("Valor de salário digitado é inválido. Tente novamente!");
                }

            } else {
                System.out.print("Ok, até a próxima!");
                break;
            }
        }
    }
}
