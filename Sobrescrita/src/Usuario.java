public class Usuario {
    String nome;
    String senha;
    String email;

    public Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    void autenticar(){
        System.out.printf("Usuario %s está autenticado \n", this.nome);
    }

    void concederAcessos(){
        System.out.printf("Usuario %s está com acessos regulares \n ", this.nome);
    }

    void configurar(){

    }
}
