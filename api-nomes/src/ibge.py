import requests


def busca(nome):
    url = f"https://servicodados.ibge.gov.br/api/v2/censos/nomes/{nome}"
    resposta = requests.get(url)
    return resposta.json()


def get_res(obj):
    if len(obj) > 0:
        conteudo = obj[0]
        return conteudo.get("res", [])
    else:
        return []


def calcula_ocorrencias(var_json):
    resposta = get_res(var_json)
    soma = []
    for elemento in resposta:
        # caso nao tenha chave: frequencia, retorna 0
        frequencia = elemento.get("frequencia", 0)
        soma.append(frequencia)

    return sum(soma)


def frequencia_minima(nome):
    dados = busca(nome)
    lista = get_res(dados)
    if len(lista) > 0:
        minimo = lista[0]["frequencia"]
        periodo = lista[0]["periodo"]
    for index in range(1, len(lista)):
        if lista[index]["frequencia"] < minimo:
            minimo = lista[index]["frequencia"]
            periodo = lista[index]["periodo"]
    return {"nome": nome, "frequencia_minima": minimo, "periodo": periodo}

def frequencia_maximo(nome):
    dados = busca(nome)
    lista = get_res(dados)
    if len(lista) > 0:
        maximo = lista[0]["frequencia"]
        periodo = lista[0]["periodo"]
    for index in range(1, len(lista)):
        if lista[index]["frequencia"] > maximo:
            maximo = lista[index]["frequencia"]
            periodo = lista[index]["periodo"]
    return {"nome": nome, "frequencia_maximo": maximo, "periodo": periodo}


def ordena(nome):
    dados = busca(nome)
    lista = get_res(dados)
    return bubble_sort(lista)

def selection_sort(L):
    for i in range(0, len(L)-1):
        menor = i
        for j in range(i+1, len(L)):
            if L[menor]["frequencia"] > L[j]["frequencia"]:
                menor = j
        L[i], L[menor] = L[menor], L[i]
    return L        

def bubble_sort(L):
    j = len(L)-1
    while j>0:
        for i in range(0,j):
            if L[i]["frequencia"]>L[i+1]["frequencia"]:
                L[i],L[i+1] = L[i+1],L[i]
        j = j-1
    return L