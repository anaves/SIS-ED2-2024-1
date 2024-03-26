

def contagem_regressiva(n):
    # caso base - caso de parada
    if n == 0:
        print("fogo")
    else:
        print(n)
        # chamada recursiva - funcao chama ela mesma
        return contagem_regressiva(n-1)


if __name__ == '__main__':
    contagem_regressiva(10)