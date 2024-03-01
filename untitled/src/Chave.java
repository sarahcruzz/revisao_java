public class Chave {
    // atributos
    public String cor;
    public int numero;
    static String lab = "laboratório 04";

    // construtor

    public Chave(String cor, int numero) {
        this.cor = cor;
        this.numero = numero;
    }

    // métodos

    @Override
    public String toString() {
        return String.format("A cor da chave é %s, o número dela é %d e ela abre o %s", this.cor, this.numero, lab);
    }
}

