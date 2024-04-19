public class Main {
    public static void main(String[] args) {
        Prioridade prioridade = Prioridade.valueOf("BAIXA");

        switch (prioridade){
            case URGENTE:
                System.out.println("Prioridade Total: resolver agora");
                break;
            case ALTA:
                System.out.println("Prioridade Alta: resolver o mais cedo possível");
                break;
            case MEDIA:
                System.out.println("Prioridade Média: resolver dentro do prazo");
                break;
            case BAIXA:
                System.out.println("Prioridade Baixa: resolver quando houver disponibilidade");
                break;
            default:
                System.out.println("Prioridade não identificada");
        }

    }
}