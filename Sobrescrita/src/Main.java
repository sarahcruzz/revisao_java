public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Antonio", "123456", "anotnio@br.ets.com");
        UsuarioAdmin usuarioAdmin = new UsuarioAdmin("Antonio", "123456", "anotnio@br.ets.com");

        usuario.autenticar();
        usuario.concederAcessos();
        usuarioAdmin.concederAcessos();
    }
}