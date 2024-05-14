import java.util.LinkedList;

/**
 * App
 */
public class App {
    static LinkedList tabela[] = new LinkedList[26];
    // def hash()
    public static int hash(String valor){
        valor = valor.toLowerCase();
        // System.out.println(valor.charAt(0));
        int codigoAscii = valor.charAt(0);
        int resto = (codigoAscii+7)%26;
        // System.out.println(codigoAscii + " " + resto);
        return resto;
    }

    public static void adiciona(String valor){
        int categoria = hash(valor);
        if (tabela[categoria] == null){
            tabela[categoria] = new LinkedList();
        }
        tabela[categoria].add(valor);
    }
    public static void main(String[] args) {
        System.out.println("ola");        
        adiciona("astrogildo");
        adiciona("Silvio santos");
        adiciona("anibal");
        adiciona("creonilso");
        // imprimir todos
        for (LinkedList lista : tabela) {
            System.out.println(lista);
        }
    }
}