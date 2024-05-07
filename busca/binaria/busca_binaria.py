import random
import time
lista = []
n_elementos = 10000000
for _ in range(n_elementos):
    lista.append(random.randint(0,1000))

lista.sort()

def busca_binaria(lista, elemento, inicio, fim):
    meio = (inicio+fim)//2
    if inicio < fim:
        if elemento == lista[meio]:
            return True
        elif elemento < lista[meio]:
            # busca a esquerda da lista
            return busca_binaria(lista, elemento, inicio, meio-1)
        # elif elemento > lista[meio]:
        else:
            return busca_binaria(lista, elemento, meio+1, fim)
    else:
        return False

start = time.time()
print(busca_binaria(lista, lista[1000000], 0, n_elementos))
end = time.time()
print(f"tempo de {end - start} segundos")
