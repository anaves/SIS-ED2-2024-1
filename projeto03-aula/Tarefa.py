class Task():
    # construtor
    def __init__(self, titulo: str):
        print("construtor")
        print(self)
        self.__tit = titulo
        self.__desc = "Descricao padrao"
        # definir o valor da prioridade da task
        self.__prioridade = len(self.__tit) 

    def get_titulo(self):
        return self.__tit
    
    def get_descricao(self):
        return self.__desc
    
    def get_prioridade(self):
        return self.__prioridade
    
    def set_descricao(self, descricao: str):
        self.__desc =  descricao
    
    def info(self):
        return f"----\nTitulo: {self.__tit}\nDescricao: {self.get_descricao()}\nPrioridade: {self.get_prioridade()}"