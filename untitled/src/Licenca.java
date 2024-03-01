public class Licenca {
    // atributos
    String software;
    String departamento;
    static int licencas_atribuidas;

    // construtor

    public Licenca(String software, String departamento) {
        this.software = software;
        this.departamento = departamento;
        licencas_atribuidas++;
    }

    static double retornaLicencasAtribuidas(){
        return licencas_atribuidas;
    }


}
