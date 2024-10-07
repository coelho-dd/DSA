from queue import Queue

q = Queue() # -> Cria uma queue

q.put('a')
q.put('b')
q.put('c')
q.put('d')

print(q.qsize()) # -> retorna o tamanho da queue

for i in range(q.qsize()):
    print(q.get())