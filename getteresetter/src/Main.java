public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("João","JJJ3CA", "123456", 18);

        usuario.setNome("Cleber");

        System.out.println(usuario.getNome());
    }
}