def linear_search(l, element):
    """ Definindo uma função que representa uma função de busca linear """
    for i in l:
        if i == element:
            return True
    return False

print(linear_search([10, 5, 1, 3, 6, 9], 1)) # -> retorna True