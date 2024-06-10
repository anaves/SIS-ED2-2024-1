import java.util.PriorityQueue;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        System.out.println("ola mundo");
        PriorityQueue fila = new PriorityQueue();
        fila.add(1.0/2);
        fila.add(1.0/3);
        fila.add(1.0/4);
        fila.add(1.0/7);
        fila.add(1.0/6);
        fila.add(1.0/5);
        fila.add(1.0/9);
        
        System.out.println(fila);
        // fila.add(1);
        fila.add(1.0);
        System.out.println(fila);
        // for (int i = 0; i < 4; i++) { // i++ --> i = i+1
        //     System.out.print("Atendeu: ");
        //     System.out.println(fila.remove());
        // }
    }
}