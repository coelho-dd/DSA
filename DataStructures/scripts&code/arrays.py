import array as arr

# Como python lida com listas automaticamente, para lidar com arrays é necessário importar o módulo 'arrays'

A = arr.array('f', [1.0, 1.5, 2.0, 2.5])        # Criando um array do tipo float
L = [1, 2, 3, 4, 5]                             # Criando uma lista

# Para verificar que são objetos diferentes, perceba o retorno das funções print() para cada objeto criado acima

print(type(A))
print(type(L))