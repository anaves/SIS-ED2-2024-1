from flask import Flask, request
from ibge import busca, calcula_ocorrencias, frequencia_minima, frequencia_maximo, ordena

app = Flask(__name__)

@app.route("/busca_nome")
def busca_nome():
    try:
        nome = request.args.get("nome")
        response = busca(nome)
        soma = calcula_ocorrencias(response)
        objeto_retorno = {
            "nome_procurado": nome,
            "total_ocorrencias": soma
        }
        # percorrer o retorno do busca e somar todas as ocorrências do nome
        return objeto_retorno
    except Exception as e:
        return f"Falha na rota /busca_nome: {e}"

@app.route("/frequencia_min")
def minimo():
    try:
        nome = request.args.get("nome")
        return frequencia_minima(nome)
    except Exception as e:
        return f"Falha na rota /frequencia_min"


@app.route("/frequencia_max")
def maximo():
    try:
        nome = request.args.get("nome")
        return frequencia_maximo(nome)
    except Exception as e:
        return f"Falha na rota /frequencia_max"

@app.route("/ordem_crescente")
def ordenado():
    # retornar os periodos ordenados por ordem de frequencia
    try:
        nome = request.args.get("nome")
        return ordena(nome)
    except Exception as e:
        return f"Falha na rota /ordem_crescente"

app.run(debug=True)
