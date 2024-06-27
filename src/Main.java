import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // queue(fila) -> Uma estrutura de dados FIFO(First In First Out). Ela representa uma fila, aonde o primeiro
        // elemento ao ser inserido, é o primeiro a sair.

        // dequeue(remover um elemento da fila)
        // enqueue(adicionar um elemento à fila)

        Queue<String> queue = new LinkedList<>(); // Queue é uma interface(não pode ser instanciada) por isso utilizamos
        // a classe LinkedList que herda de Queue

        queue.offer("Karen"); // método .offer() adiciona elementos ao final da fila
        queue.offer("Chad");
        queue.offer("Harold");
        queue.offer("Steve");

        System.out.println(queue);

        queue.poll(); // Removes Karen

        System.out.println(queue);
    }
}
