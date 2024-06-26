def intercala(inicio, meio, fim, lista):
    # print(f"inicio={inicio}, meio={meio}, fim={fim}")
    w_lista = []
    i = inicio
    j = meio
    while i < meio and j < fim:
        if lista[i] < lista[j]:
            w_lista.append(lista[i])
            i = i + 1
        else:
            w_lista.append(lista[j])
            j = j + 1
    
    while j < fim:
        w_lista.append(lista[j])
        j += 1
    while i < meio:
        w_lista.append(lista[i])
        i += 1
    
    for k in range(inicio, fim):
        lista[k] = w_lista[k-inicio]


def merge_sort(inicio, fim, lista):
    if inicio < fim-1:
        # identifica o elemento do meio
        meio = (inicio+fim)//2
        # ordena a primeira metade
        merge_sort(inicio, meio, lista)
        print(lista)
        # ordena a segunda metade
        merge_sort(meio, fim, lista)
        # combina as duas metades
        intercala(inicio, meio, fim, lista)


if __name__ == "__main__":
    import random
    valores = [10,9,8,7,6,5,4,3,2,1]
    # for i in range(10):
    #     valores.append(random.randint(1, 1000))
    tamanho = len(valores)
    merge_sort(0, tamanho, valores)
    print("ordenado")
    print(valores)

