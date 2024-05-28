import java.util.ArrayList;

public class AppTeste {
    public static void main(String[] args) {
        Cliente jose = new Cliente("123");
        Cliente maria =  new Cliente("34");
        jose.setNome("Jose");
        jose.setSaldo(500);

        maria.setNome("Maria");
        maria.setSaldo(800);

        System.out.println(jose);
        // System.out.println(maria);
        System.out.println(maria.toString());
        //jose.setCpf("Bicicleta");  // ERRO!!!
        
        ArrayList<Cliente> cadastro = new ArrayList<Cliente>();
        cadastro.add(jose);
        cadastro.add(maria);
        System.out.println(cadastro);        
    }
}
