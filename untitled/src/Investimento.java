public class Investimento {
    public String nome_investidor;
    public double saldo_atual;
    static double taxa_rentabilidade = 0.02;
    public Investimento(String nome_investidor, double saldo_atual) {
        this.nome_investidor = nome_investidor;
        this.saldo_atual = saldo_atual;
    }

    void rentabilizar(){
        this.saldo_atual = this.saldo_atual * (1 + taxa_rentabilidade);
    }
}
