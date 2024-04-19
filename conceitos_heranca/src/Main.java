public class Main {
    public static void main(String[] args) {
        Mensalista mensalista = new Mensalista(92897645, "Maria", "Técnica de Qualidade", 4000);
        Horista horista = new Horista(92897425, "José", "Operador me Manufatura 1", 240, 8.25);

        //System.out.printf("Salario do Mensalista: %s é de %.2f \n", mensalista.nome, mensalista.receberSalario());
        //System.out.printf("Salario do Horista: %s é de %.2f \n", horista.nome, horista.receberSalario());
        System.out.println(mensalista + "\n");
        System.out.println(horista);

    }
}