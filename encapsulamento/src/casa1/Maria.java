package casa1;

public class Maria {
    private String segredo = "Roubei um carro"; // o mais protegido, apenas a classe maria consegue ver esse atributo
    String facoDentroDeCasa = "Ronca durante o sono"; // esse atributo, por ser default, só consegue ver quem está no mesmo pacote que a classe Maria
    protected String familiaSabe = "Deve no banco"; // No caso do protected, caso exista a relação de herança é possível visualizar esse atributos
    public String todoMundoSabe = "Vou no bar"; // public, todo mundo consegue ver esses atributos


    void teste(){
        System.out.println(segredo);
    }
}
