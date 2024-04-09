import time

def seu_algoritmo_aqui():
    # Insira seu algoritmo aqui
    # por exemplo, um loop simples para demonstração
    for _ in range(100000000):
        pass
    

# Marca o tempo de início
inicio = time.time()

# Chama o algoritmo que você deseja medir o tempo de execução
seu_algoritmo_aqui()

# Marca o tempo de término
fim = time.time()

# Calcula o tempo de execução em segundos
tempo_execucao = fim - inicio

print("O algoritmo levou", tempo_execucao, "segundos para executar.")
