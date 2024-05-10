package Lista5_ativ1;

import java.util.Scanner;

public class EntradaSaida {

    // método de entrada para obter a nota
    public double obterNota(){
        System.out.print("Insira o valor da nota: ");
        Scanner scanner = new Scanner(System.in);
        double nota = scanner.nextDouble();

        return nota;
    }

    public double obterPeso(){
        System.out.print("Insira o valor do peso: ");
        Scanner scanner = new Scanner(System.in);
        double peso = scanner.nextDouble();

        return peso;
    }
}
