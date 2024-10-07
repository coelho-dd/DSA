import java.util.LinkedList;
import java.util.Queue;

class Queues {
    public static void main(String[] args) {
        
        // Em java não é possível instanciar de Queue diretamente pois é uma interface e não uma classe
        Queue<String> queue = new LinkedList<String>(); // um objeto de LinkedList terá um comportamento similar

        // Populando nossa fila
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);

        System.out.println(queue.peek()); // -> peek() retorna o primeiro elemento da fila

        queue.poll(); // -> remove o primeiro elemento da lista (Karen)
        queue.poll(); // -> remove (Chad)
        // ...

        // Como filas são úteis?
        // 1- Buffer do teclado (a ordem das letras que aparecem na tela devem ser a mesma das teclas que foram apertadas)
        // 2- Fila da impressora(a ordem dos arquivos impressos deve ser a mesma que a ordem em que cada arquivo foi indicado)
        // 3- Usado em outras estruturas de dados
    }
}