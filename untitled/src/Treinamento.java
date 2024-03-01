public class Treinamento {
    public String nome;
    public double preco;
    public boolean exclusivoParaGestores;

    // criação do objeto da classe instrutor
    Instrutor instrutor;
    public Treinamento(String nome, double preco, boolean exclusivoParaGestores, Instrutor instrutor) {
        this.nome = nome;
        this.preco = preco;
        this.exclusivoParaGestores = exclusivoParaGestores;
        this.instrutor = instrutor;
    }

    public Treinamento() {
        this.nome = "Sem nome";
        this.preco = 10;
        this.exclusivoParaGestores = true;
    }

    @Override
    public String toString(){
        return String.format("O treinamento %s está com valor de %.2f e ele %s exclusivo para gestores com o instrutor %s",
                this.nome, this.preco, this.exclusivoParaGestores ? "é": "não é", this.instrutor);
    }
}
