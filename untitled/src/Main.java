import java.awt.event.ComponentAdapter;

public class Main {
    public static void main(String[] args) {
        // criação do objeto da classe Colaborador
        Colaborador maria = new Colaborador(); // instanciando o objeto
        maria.nome = "Maria";
        maria.cargo = "Técnica de Qualidade";
        maria.edv = 92906547;
        System.out.println(maria.toString());

        // criação de outros objetos com argumento
        Colaborador jose = new Colaborador("José");
        System.out.println(jose.nome);

        Colaborador antonio = new Colaborador(98876412, "Antonio");
        System.out.println(antonio.toString());

        Colaborador sarah = new Colaborador(92903525, "Sarah", "Aprendiz Digital Solutions");
        System.out.println(sarah.toString());

        // Instanciando a classe Treinamento
        Treinamento treinamento = new Treinamento("PowerBI", 900.0, false, new Instrutor("Leonardo"));
        System.out.println(treinamento);



    }

}