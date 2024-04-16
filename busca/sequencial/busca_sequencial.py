import random
import time
lista = []
n_elementos = 10000000
for _ in range(n_elementos):
    lista.append(random.randint(0,1000))

# print(lista)
lista.sort()
# print(lista)

procurar = lista[1000000]
achou = False
comparacoes = 0 
# busca sequencial
inicio = time.time()
for index, elemento in enumerate(lista): 
    comparacoes += 1
    if procurar < elemento:
        achou = False
        break       # parar
        # 0.0000054   <  
    if procurar == elemento:
        print(f"encontrei {procurar} na posicao {index}")
        achou = True
        break

fim = time.time()
if not achou:
    print(f"{procurar} nao esta na lista")
    print(f"comparacoes: {comparacoes}")
print(f"tempo de {fim - inicio} segundos")

inicio = time.time()
print(procurar in lista)
fim = time.time()
print(f"tempo de {fim - inicio} segundos")

