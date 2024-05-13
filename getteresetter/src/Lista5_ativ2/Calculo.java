package Lista5_ativ2;

public class Calculo {
    // criando os métodos de cálculo dos descontos, acréscimos e salário líquido
    public double descontoINSS(double salarioBruto){
        double desconto;
        desconto = (20 * salarioBruto) / 100;

        return desconto;
    }

    public double descontoIRPF(double salarioBruto){
        double desconto;
        desconto = (10 * salarioBruto) / 100;

        return desconto;
    }

    public double descontoSaude(double salarioBruto){
        double desconto;
        desconto = (5 * salarioBruto) / 100;

        return desconto;
    }


}
