package Lista5_ativ3;

public class Calculo {
    // criando os métodos de cálculo do empréstimo
    public double valorParcelaEmprestimo(double valorTotalEmprestimo){
        double valorParcela = valorTotalEmprestimo / 24;

        return valorParcela;
    }

    public double valorTotalEmprestimo(double valorEmprestimo){
        double valorTotal = valorEmprestimo + ((valorEmprestimo * 35) / 100);

        return  valorTotal;
    }

}
