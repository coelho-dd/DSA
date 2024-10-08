import time # o módulo 'time' de python nos fornece ferramentas para cálculo do tempo

start = time.time() 
for i in range(1, 6):
    print(i)
end = time.time()

print(end - start) # printando o tempo que levou para a execução do algoritmo