from enum import Enum


class Tamanho(Enum):
    P = 15.00
    M = 20.00
    G = 30.00
    GG = 45.00
    TF = 150.00

    def retorna_valor(self, valor):

        if self == Tamanho.P.name:
            valor = Tamanho.P.value
        elif self == Tamanho.M.name:
            valor = Tamanho.M.value
        elif self == Tamanho.G.name:
            valor = Tamanho.G.value
        elif self == Tamanho.GG.name:
            valor = Tamanho.GG.value
        elif self == Tamanho.TF.name:
            valor = Tamanho.TF.value
        return valor
