class Pessoa:
    def __init__(self, nome, saldo_conta):
        self.nome = nome
        self.saldo_conta: float = saldo_conta

    def set_nome(self):
        self.nome = input("Digite seu nome: ")
