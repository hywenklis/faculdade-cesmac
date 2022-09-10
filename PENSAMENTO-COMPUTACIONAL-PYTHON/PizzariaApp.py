from enums import Pizza
from model import Pessoa
from service import TaxaFrete
from system import Mensagem
from utils import Constantes

cliente = Pessoa.Pessoa("", 1000.00)

Mensagem.bem_vindo()
cliente.set_nome()
Mensagem.informacao_do_pedido(cliente.nome)
tamanho_pizza = Mensagem.tamanho_pizza()
Constantes.VALOR_TOTAL = Pizza.Tamanho.retorna_valor(tamanho_pizza, Constantes.VALOR_TOTAL)
sabor_pizza = Mensagem.sabor_pizza()
observacao_pedido = Mensagem.observacao_pedido()
Mensagem.registro_do_pedido(cliente.nome, sabor_pizza, tamanho_pizza, observacao_pedido)
delivery = Mensagem.taxa_frete()
Constantes.VALOR_TOTAL = TaxaFrete.calcula(delivery, Constantes.VALOR_TOTAL, Constantes.TAXA_FRETE)

print("=" * 40)
print("{:^40}".format("DESCONTO"))
print("=" * 40)
if Constantes.VALOR_TOTAL >= Constantes.VALOR_PARA_GANHAR_DESCONTO:
    RESULTADO_DO_DESCONTO = Constantes.VALOR_TOTAL / Constantes.DESCONTO
    Constantes.VALOR_TOTAL_COM_DESCONTO = Constantes.VALOR_TOTAL - RESULTADO_DO_DESCONTO
    print(f"O VALOR DO SEU PEDIDO É DE: R${Constantes.VALOR_TOTAL_COM_DESCONTO}")
else:
    print(f"SUA COMPRA FOI MENOR DO QUE R${Constantes.VALOR_PARA_GANHAR_DESCONTO}, NENHUM DESCONTO SERÁ APLICADO!")
    print(f"O VALOR DO SEU PEDIDO É DE: R${Constantes.VALOR_TOTAL}")
print()

if Constantes.VALOR_TOTAL_COM_DESCONTO > 0:
    Constantes.VALOR_TOTAL = Constantes.VALOR_TOTAL_COM_DESCONTO

print(Constantes.VALOR_TOTAL)


def escolher_metodo_de_pagamento():
    print("=" * 40)
    print("{:^40}".format("PAGAMENTO"))
    print("=" * 40)
    print("Digite a opção que deseja realizar o pagamento: ")
    print("1 - CRÉDITO")
    print("2 - DÉBITO")
    print("3 - PIX")
    METODO_PAGAMENTO = int(input())

    if METODO_PAGAMENTO == 1:
        print("PAGAMENTO NO CREDITO COM PARCELA")
        PARCELA = int(input("DESEJA PARCELAR EM QUANTAS VEZES: "))

        if Constantes.VALOR_TOTAL > 0:
            Constantes.VALOR_TOTAL_PARCELADO = Constantes.VALOR_TOTAL / PARCELA
            print(
                f"{cliente.nome} VOCÊ DIVIDIU O SALDO DE R${Constantes.VALOR_TOTAL} EM {PARCELA}x FICANDO NO VALOR DE R${Constantes.VALOR_TOTAL_PARCELADO} CADA PARCELA")

    elif METODO_PAGAMENTO == 2:
        print("PAGAMENTO NO DEBITO")
        if Constantes.VALOR_TOTAL > 0:
            print(f"{cliente.nome} SEU VALOR TOTAL É DE: R${Constantes.VALOR_TOTAL}")

    elif METODO_PAGAMENTO == 3:
        print("PAGAMENTO NO PIX")
        if Constantes.VALOR_TOTAL > 0:
            print(f"{cliente.nome} SEU VALOR TOTAL É DE: R${Constantes.VALOR_TOTAL}")


escolher_metodo_de_pagamento()
print()

if Constantes.VALOR_TOTAL < cliente.saldo_conta:
    print("COMPRA APROVADA! OBRIGADO PELA PREFERÊNCIA.")
else:
    while Constantes.VALOR_TOTAL > cliente.saldo_conta:
        print("SEU SALDO É INSUFICIENTE DESEJA CONTINUAR COM A COMPRA?")
        CONFIRMA_COMPRA = input("DIGITE [S/N]: ")
        if CONFIRMA_COMPRA == "S":
            escolher_metodo_de_pagamento()
        else:
            print(f"CLIENTE {cliente.nome} OPTOU POR NÃO CONTINUAR COM A COMPRA! ENCERRAMOS O PEDIDO")
            print("ATÉ BREVE!")
            break
