package Lista5_ativ1;

public class Resultado {
    // criando o método para verificar a aprovação do aluno
    public String verificarAprovacao(double media){
        if (media >= 7){
            return "Aluno APROVADO! \nMedia: " + media;
        } else {
            return "Aluno REPROVADO! \nMedia: " + media;
        }
    }
}
