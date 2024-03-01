public class Circulo {
    static final double PI = 3.14; // para variavel constante sempre utilizar maiusculo e quando for um numero predefinido que não sera modificado, usar o final
    double raio;
    String cor;

    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    double calcularArea(){
        return PI*raio*raio;
    }
}
