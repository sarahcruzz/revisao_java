public class Colaborador {
    // Atributos
    public int edv;
    public String nome;
    public String cargo;

    //Construtor completo
    public Colaborador(int edv, String nome, String cargo) {
        this.edv = edv;
        this.nome = nome;
        this.cargo = cargo;
    }

    // Construtor apenas com o nome
    public Colaborador(String nome) {
        this.nome = nome;
    }

    public Colaborador(int edv, String nome) {
        this.edv = edv;
        this.nome = nome;
    }

    public Colaborador() {

    }

    @Override
    public String toString(){
        return String.format("Colaborador com %s com edv %d tem o cargo de %s", this.nome, this.edv, this.cargo);
    }


}
