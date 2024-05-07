import java.util.PriorityQueue;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        System.out.println("ola mundo");
        PriorityQueue fila = new PriorityQueue();
        fila.add(5);
        fila.add(7);
        fila.add(8);
        fila.add(4);
        System.out.println(fila);
        for (int i = 0; i < 4; i++) { // i++ --> i = i+1
            System.out.print("Atendeu: ");
            System.out.println(fila.remove());
        }
    }
}