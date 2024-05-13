package Lista5_ativ2;

public class Validacao {
    // criando o método de validaão do salário
    public boolean validarSalario(double salario){
        if (salario >= 500 && salario <= 30000){
            return true;
        } else {
            return false;
        }
    }
}
