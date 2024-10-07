# Criando uma classe representando uma estrutura de dados stack
class Stack:
    def __init__(self):
        self.items = []

    def push(self, data):
        return self.items.append(data)

    def pop(self, data):
        return self.items.pop(data)

    def size(self):
        return len(self.items)
    
    def is_empty(self):
        return len(self.items) == 0
    
    def peek(self):
        return self.items[-1]
    
stack = Stack()

print(stack.is_empty()) # -> True | a pilha ainda está vazia

stack.push('davi')
stack.push('nayara')
stack.push('liara')
stack.push('cristiane')
stack.push('daniel')

print(stack.is_empty()) # -> False | agora a pilha não está mais vazia

print(stack.peek()) # -> 'daniel'
print(stack.size()) # -> 5