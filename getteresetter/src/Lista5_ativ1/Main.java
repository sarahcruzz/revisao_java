package Lista5_ativ1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declaração das variáveis
        double nota1, nota2, mediaPonderada, mediaAritmetica, peso1, peso2;
        int escolha;

        // instanciando objeto das classes
        Scanner scanner = new Scanner(System.in);

        EntradaSaida entradaSaida = new EntradaSaida();
        Calculo calculo = new Calculo();
        Validacao validacao = new Validacao();
        Resultado resultado = new Resultado();

        //PROCESSAMENTO
        while (true){
            System.out.print("Digite o que gostaria de fazer: \n1 - Média Aritmética \n2 - Média Ponderada \nR: ");
            escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    while (true) {
                        // recebendo as notas
                        nota1 = entradaSaida.obterNota();
                        nota2 = entradaSaida.obterNota();

                        if (validacao.validar(nota1) && validacao.validar(nota2)){
                            // calculando a média Aritmética das notas
                            mediaAritmetica = calculo.calcularMediaAritmetica(nota1, nota2);

                            // verificando aprovação ou não do aluno
                            System.out.println(resultado.verificarAprovacao(mediaAritmetica) + "\n");
                            break;
                        }

                        System.out.println("A nota informada é inválida, tente novamente!");

                    }
                    break;

                case 2:
                    while (true) {
                        // recebendo as notas e pesos
                        nota1 = entradaSaida.obterNota();
                        peso1 = entradaSaida.obterPeso();

                        nota2 = entradaSaida.obterNota();
                        peso2 = entradaSaida.obterPeso();

                        if (validacao.validar(nota1) && validacao.validar(nota2)) {
                            // calculando a média Ponderada das notas
                            mediaPonderada = calculo.calcularMediaPonderada(nota1, nota2, peso1, peso2);

                            System.out.println(mediaPonderada);
                            // verificando aprovação ou não do aluno
                            System.out.println(resultado.verificarAprovacao(mediaPonderada) + "\n");
                            break;
                        }

                        System.out.println("A nota informada é inválida, tente novamente!");
                    }
                    break;

            }
        }


    }
}
