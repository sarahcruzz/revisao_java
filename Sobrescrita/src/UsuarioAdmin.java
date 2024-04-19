public class UsuarioAdmin extends Usuario{


    public UsuarioAdmin(String nome, String senha, String email) {
        super(nome, senha, email);
    }

    @Override
    void concederAcessos(){
        super.concederAcessos();
        System.out.printf("Usuário %s está com acessos administrativos \n", this.nome);
    }

    @Override
    void configurar(){
        System.out.println("/");
    }
}
