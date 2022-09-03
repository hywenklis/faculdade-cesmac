import time
from socket import AF_INET, SOCK_STREAM, socket
from getpass import getpass
from os import system

HOST = '127.0.0.1'
PORTA = 50000
AUTORIZADO = "Autenticado com Sucesso! Bem vindo ao nosso sistema :D"

clear = lambda: system('clear')

conexao = socket(AF_INET, SOCK_STREAM)
conexao.connect((HOST, PORTA))
print("Conectando com o servidor")


def envia_login():
    login = input("Digite seu login: ")
    conexao.send(login.encode())


def envia_senha():
    senha = getpass("Digite sua senha: ")
    conexao.send(senha.encode())


def menu():
    clear()
    print('=' * 30)
    print("{:^30}".format("MENU DE OPERAÇÕES"))
    print('=' * 30)
    print('Opções:')
    print('1 - Extrato')
    print('2 - Depósito')
    print('3 - Saque')
    print('4 - Sair')
    print('=' * 30)
    print('=' * 30)


def condicao(aperte):
    if aperte == 'X' or aperte == 'x':
        exit()
    else:
        menu()


while True:
    envia_login()
    envia_senha()

    resposta = conexao.recv(2048)
    print("Servidor: ", resposta.decode('UTF-8'))

    if resposta.decode() == AUTORIZADO:
        time.sleep(1.5)
        menu()
        while True:
            opcao = input('Digite a opção desejada: ')
            if opcao == '1':
                conexao.send(opcao.encode())
                msg = conexao.recv(2048).decode('UTF-8')
                print(msg)
                print()
                print("Aperte ENTER para retornar ao MENU ou (X e ENTER) para sair: ")
                aperte = input()
                condicao(aperte)
            elif opcao == "2":
                conexao.send(opcao.encode())
                print("Digite o valor do deposito: ")
                valor = input()
                conexao.send(valor.encode())
                msg2 = conexao.recv(2048).decode("UTF-8")
                print(msg2)
                print("Aperte ENTER para retornar ao MENU ou (X e ENTER) para sair: ")
                aperte = input()
                condicao(aperte)
            elif opcao == "3":
                conexao.send(opcao.encode())
                print("Digite o valor que deseja sacar: ")
                valor = input()
                conexao.send(valor.encode())
                msg3 = conexao.recv(2048).decode("UTF-8")
                print(msg3)
                print("Aperte ENTER para retornar ao MENU ou (X e ENTER) para sair: ")
                aperte = input()
                condicao(aperte)
            elif opcao == "4":
                print("Aperte ENTER para retornar ao MENU ou (X e ENTER) para sair: ")
                aperte = input()
                condicao(aperte)
            else:
                print("Opção inválida")
                continue
