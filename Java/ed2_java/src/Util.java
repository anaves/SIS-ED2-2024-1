public class Util {
    // EXERCICIO: Implementar o validarCPF
    public static boolean validarCpf(String cpf){
        if (cpf.length() == 3){
            return true;
        }
        return false;
    }
}
