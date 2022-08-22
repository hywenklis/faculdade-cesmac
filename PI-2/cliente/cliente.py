from socket import AF_INET, SOCK_STREAM, socket
from getpass import getpass

HOST = '127.0.0.1'
PORTA = 50000

conexao = socket(AF_INET, SOCK_STREAM)
conexao.connect((HOST, PORTA))
print("Conectando com o servidor")


def envia_login():
    login = input("Digite seu login: ")
    conexao.send(login.encode())


def envia_senha():
    senha = getpass("Digite sua senha: ")
    conexao.send(senha.encode())


while True:
    envia_login()
    envia_senha()

    data = conexao.recv(1024)
    print("Servidor: ", data.decode())
    autorizado = "Autenticado com Sucesso! Bem vindo ao nosso sistema :D"
    nao_autorizado = "Não foi possível se conectar, tente novamente"
    if data.decode() == autorizado:
        break

print("Fechando a conexão")
conexao.close()
