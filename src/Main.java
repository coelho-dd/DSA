import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // stack(pilha) -> Estrutura de dado LIFO(Last In First Out)
        // essa estrutura representa uma pilha de objetos, aonde só podemos retirar o último objeto colocado nela.
        // Ou seja, não é possível remover o primeiro elemento de uma pilha, sem antes remover o objeto de "cima".
        // utiliza métodos push() para adicionar objetos ao topo e pop() para remover objetos do topo.

        Stack<String> stack = new Stack<>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        System.out.println(stack);

        stack.pop(); // remove o item no topo da pilha(o último elemento do array) e retorna o item

        System.out.println(stack); // sem FFVII

        // o método peek() da classe Stack permite visualizar toda a stack no momento atual
        // o método search() da classe Stack permite procurar um elemento específico dentro da stack, retornando um
        // valor representando o local aonde se encontra(caso exista na stack) ou -1(caso não exista na stack).
    }
}
