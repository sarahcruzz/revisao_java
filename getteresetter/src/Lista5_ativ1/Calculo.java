package Lista5_ativ1;

import java.text.NumberFormat;

public class Calculo {
    // criando o método cálculo de média

    public double calcularMediaAritmetica(double nota1, double nota2){
        double mediaAritmetica = (nota1 + nota2) / 2;
        return mediaAritmetica;
    }

    public double calcularMediaPonderada(double nota1, double nota2, double peso1, double peso2){
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 ) / (peso1 + peso2);
        return mediaPonderada;
    }

}
