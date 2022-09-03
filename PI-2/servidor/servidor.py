from socket import *


class Conta:
    def __init__(self, cliente, senha, agencia, numero_conta, saldo):
        self.cliente = cliente
        self.senha = senha
        self.agencia = agencia
        self.numero_conta = numero_conta
        self.saldo = saldo


pessoa = Conta('hywenklis', '1234', '0001', '1010-2', 0)

HOST = 'localhost'
PORTA = 50000

sockobj = socket(AF_INET, SOCK_STREAM)
sockobj.bind((HOST, PORTA))
sockobj.listen(1)
print("Aguardando conexão de um cliente")


def autenticando_cliente():
    FALHA = True
    login_decodificado = recupera_login_do_cliente()
    senha_decodificado = recupera_senha_do_cliente()
    while FALHA:
        if login_decodificado != pessoa.cliente or senha_decodificado != pessoa.senha:
            print(f"Cliente: login={login_decodificado} senha={senha_decodificado}")
            nao_autorizado = "Não foi possível se conectar, tente novamente"
            conexao.send(nao_autorizado.encode())
            autenticando_cliente()
        else:
            print(f"Cliente: login={login_decodificado} senha={senha_decodificado}")
            autorizado = "Autenticado com Sucesso! Bem vindo ao nosso sistema :D"
            conexao.send(autorizado.encode())
            break


def envia_comando(conexao, comando):
    comando += '\r\n'
    conexao.send(comando.encode('UTF-8'))


def recupera_login_do_cliente():
    login_cliente = conexao.recv(1024)
    login_decodificado = login_cliente.decode()
    return login_decodificado


def recupera_senha_do_cliente():
    senha_cliente = conexao.recv(1024)
    senha_decodificado = senha_cliente.decode()
    return senha_decodificado


def recupera_opcao_do_cliente():
    opcao = conexao.recv(1024)
    opcao_decodificada = opcao.decode()
    return opcao_decodificada


def recupera_valor_do_deposito():
    valor_depositado = conexao.recv(1024)
    valor_depositado_decodificado = valor_depositado.decode()
    return float(valor_depositado_decodificado)


def recupera_valor_de_saque():
    valor_para_sacar = conexao.recv(1024)
    valor_para_sacar_decodificado = valor_para_sacar.decode()
    return float(valor_para_sacar_decodificado)


def extrato(self):
    envia_comando(conexao, f"seu saldo é: R${self.saldo}".replace(".", ","))


def depositar(valor):
    pessoa.saldo += valor
    envia_comando(conexao, "Depósito realizado!")


def sacar(valor):
    if valor <= pessoa.saldo:
        pessoa.saldo -= valor
        envia_comando(conexao, "Saque realizado!")
    else:
        envia_comando(conexao, 'Saldo insuficiente.')


def fecha_conexao():
    exit()


def conexao_entre_cliente_e_servidor():
    while True:
        global conexao
        conexao, endereco = sockobj.accept()
        print("Conectado em", endereco)
        autenticando_cliente()
        while True:
            opcao = recupera_opcao_do_cliente()
            if opcao == "1":
                extrato(pessoa)
            elif opcao == "2":
                valor_deposito = recupera_valor_do_deposito()
                depositar(valor_deposito)
            elif opcao == "3":
                valor_saque = recupera_valor_de_saque()
                sacar(valor_saque)
            else:
                print("Fechando conexão!")
                fecha_conexao()


conexao_entre_cliente_e_servidor()
