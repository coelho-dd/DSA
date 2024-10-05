from collections import deque

# Como Python não possui uma estrutura linked list nativa, devemos importar do módulo collections a classe deque(), que retorna um objeto representando uma linked list

LL = deque()

LL.append('davi')
LL.append('nayara')
LL.append('liara')

for item in LL:
    print(item)

print(type(LL)) # -> Indicando que não se trata de uma lista comum, mas sim de um objeto da classe deque() [double-ended queue]