import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {
        
        Queue<String> queue = new PriorityQueue<>(); // Queue não pode ser instanciado
        
        // Populando nossa queue
        queue.offer("C");
        queue.offer("A");
        queue.offer("J");
        queue.offer("B");
        queue.offer("Z");

        // Retirando elementos da nossa fila um por um enquanto a fila não estiver vazia
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // A saída estará em ordem alfabética
    }
}
