def binary_search(lst, element):
    """ Função que executa uma busca binária em uma lista """
    first = 0
    last = len(lst) - 1  # -> len(lst) retorna o tamanho da lista, mas como os índices funcionam com um número a menos, o último índice seria o tamanho da lista - 1
    while last >= first: # -> o loop é executado enquanto existem itens na lista
        mid = (first + last) // 2 # -> estou trabalhando com índices e não com os elementos em si, então nesse caso eu estou pegando o índice do elemento do meio
        if lst[mid] == element:
            return True
        else:
            if element < lst[mid]:
                last = mid - 1 # -> Descartando a parte superior da lista, caso o element for menor que o meio da lista
            else:
                first = mid + 1 # -> Descartando a parte inferior da lista, caso o element for maior que o meio da lista 
    return False

print(binary_search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20], 20)) # -> retorna True, porque 20 está na lista!