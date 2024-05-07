from Tarefa import Task

obj = Task("Lavar roupa")
outro = Task("Fazer almoco")
outro.set_descricao("Descricao do outro objeto")

print(obj.info())
print("------------------")
print(outro.info())