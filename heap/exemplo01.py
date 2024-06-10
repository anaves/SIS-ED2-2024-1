import heapq

lista = []
heapq.heappush(lista, (2, "2"))
heapq.heappush(lista, (3, "3"))
heapq.heappush(lista, (4, "4"))
heapq.heappush(lista, (7, "7"))
print("ATENDIMENTOS")
for i in range(4):
    elemento = heapq.heappop(lista)
    print(elemento)
    input("proximo")
    