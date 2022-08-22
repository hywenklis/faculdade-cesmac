from socket import AF_INET, SOCK_STREAM, socket

HOST = 'localhost'
PORTA = 50000
LOGIN = "hywenklis"
SENHA = "1234"

sockobj = socket(AF_INET, SOCK_STREAM)
sockobj.bind((HOST, PORTA))
sockobj.listen(1)
print("Aguardando conexão de um cliente")


def autenticando_cliente():
    FALHA = True
    login_decodificado = recupera_login_do_cliente()
    senha_decodificado = recupera_senha_do_cliente()
    while FALHA:
        if login_decodificado != LOGIN or senha_decodificado != SENHA:
            print(f"Cliente: login={login_decodificado} senha={senha_decodificado}")
            nao_autorizado = "Não foi possível se conectar, tente novamente"
            conexao.send(nao_autorizado.encode())
            autenticando_cliente()
        else:
            print(f"Cliente: login={login_decodificado} senha={senha_decodificado}")
            autorizado = "Autenticado com Sucesso! Bem vindo ao nosso sistema :D"
            conexao.send(autorizado.encode())
        break


def recupera_login_do_cliente():
    login_cliente = conexao.recv(1024)
    login_decodificado = login_cliente.decode()
    return login_decodificado


def recupera_senha_do_cliente():
    senha_cliente = conexao.recv(1024)
    senha_decodificado = senha_cliente.decode()
    return senha_decodificado


def conexao_entre_cliente_e_servidor():
    global conexao
    while True:
        conexao, endereco = sockobj.accept()
        print("Conectado em", endereco)
        autenticando_cliente()
        print("fechando a conexão")
        break


conexao_entre_cliente_e_servidor()
