package Lista5_ativ1;

public class Validacao {
    // criando um método de validação da snotas recebidas
    public boolean validar(double valor){
        if (valor >= 0 && valor <= 10){
            return true;
        } else {
            return false;
        }
    }

}
