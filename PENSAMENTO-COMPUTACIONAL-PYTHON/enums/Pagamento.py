from enum import Enum


class Fisico(Enum):
    CREDITO = 1
    DEBITO = 2


class Virtual(Enum):
    PIX = 3


cartao = [0, Fisico.CREDITO.value, Fisico.DEBITO.value, Virtual.PIX.value]


def escolher_metodo_de_pagamento(valor_total, valor_total_parcelado, nome_cliente):
    print("=" * 40)
    print("{:^40}".format("PAGAMENTO"))
    print("=" * 40)
    print("Digite a opção que deseja realizar o pagamento: ")
    print("1 - CRÉDITO")
    print("2 - DÉBITO")
    print("3 - PIX")
    METODO_PAGAMENTO = int(input())

    if METODO_PAGAMENTO == cartao[1]:
        print("PAGAMENTO NO CREDITO COM PARCELA")
        PARCELA = int(input("DESEJA PARCELAR EM QUANTAS VEZES: "))

        if valor_total > 0:
            valor_total_parcelado = valor_total / PARCELA
            print(f"{nome_cliente} VOCÊ DIVIDIU O SALDO DE R${valor_total} EM {PARCELA}x "
                  f"FICANDO NO VALOR DE R${valor_total_parcelado} CADA PARCELA")

    elif METODO_PAGAMENTO == cartao[2]:
        print("PAGAMENTO NO DEBITO")
        if valor_total > 0:
            print(f"{nome_cliente} SEU VALOR TOTAL É DE: R${valor_total}")

    elif METODO_PAGAMENTO == cartao[3]:
        print("PAGAMENTO NO PIX")
        if valor_total > 0:
            print(f"{nome_cliente} SEU VALOR TOTAL É DE: R${valor_total}")
