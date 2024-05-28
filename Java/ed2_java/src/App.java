import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void imprimir(int vetor[]){
        System.out.println(vetor);
        // i++       --- >     i = i+1
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(i + ": " + vetor[i]);
        }
    }

    public static void main(String[] args) {
        /*
        VETOR - ARRAY - ARRANJO
        ED estatica (tamanho da ED deve ser definido a priori)
        - tamanho da ED nao vai ser alterado
        - tipo nome[] = new tipo[];
        - tipo []nome = new tipo[];
        */ 
        int idade[] = new int[10];
        idade[0] = 5;
        String valor = "8";
        idade[3] = Integer.parseInt(valor);  // converter de String para int
        idade[1] = 2;
        idade[2] = 9;
        imprimir(idade);


        // Collection ArrayList
        System.out.println("COLLECTION");
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        System.out.println(vetor.size());
        System.out.println(vetor.isEmpty());
        vetor.add(65);
        vetor.add(36);
        System.out.println(vetor.size());
        System.out.println(vetor.isEmpty());
        System.out.println(vetor);
        Collections.sort(vetor);
        System.out.println(vetor);

        Arrays.sort(idade);
        imprimir(idade);

    

    }
}
