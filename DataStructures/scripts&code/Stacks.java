import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        // <[tipo dos dados dentro da estrutura]>
        Stack<String> stack = new Stack<String>(); // Instanciando uma nova Stack(classe já pronta de Java)
        
        System.out.println(stack.empty()); // stack até o momento está vazia

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        System.out.println(stack.empty()); // false -> stack está agora populada
        System.out.println(stack);

        stack.pop(); // pop() remove o último elemento da stack (FFVII)
        stack.pop(); // remove Borderlands
        stack.pop(); // remove DOOM
        stack.pop(); // remove Skyrim

        System.out.println(stack); // Agora a stack só contém "Minecraft"

        // Repopulando a stack
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        System.out.println(stack.peek()); // método peek() retorna o último objeto da stack, que no caso é FFVII
    
        // Casos de uso de uma stack:
        // 1- funcionalidades de voltar para um ponto específico(CTRL+Z | CTRL+Y)
        // 2- histórico do browser (se movendo para frente ou para trás no navegador)
        // 3- algoritmos de backtracking
        // 4- quando uma função é chamada, ela é alocada em uma stack de funções (call stack)
        // ...
    }
    
}