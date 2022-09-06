P = 15.00
M = 20.00
G = 30.00
GG = 45.00
TAMANHO_FAMILIA = 150.00

VALOR_TOTAL = 0
TAXA_FRETE = 10.00
VALOR_PARA_GANHAR_DESCONTO = 150.00
DESCONTO = 10
VALOR_TOTAL_COM_DESCONTO = 0
VALOR_TOTAL_PARCELADO = 0

SALDO_DO_CLIENTE1 = 200
SALDO_DO_CLIENTE2 = 20

print("BEM-VINDO(A) IREMOS SEGUIR COM O SEU ATENDIMENTO!")
print("COMO PODEMOS LHE CHAMAR? ")
nome_cliente = input("Digite seu nome: ")
print(f"OLÁ {nome_cliente} VAMOS SEGUIR COM SEU PEDIDO, ABAIXO PASSE ALGUMAS INFORMAÇÕES PARA QUE POSSAMOS SEGUIR!")
tamanho_pizza = input("Escolha entre os seguintes tamanho [P, M, G, GG, TM]: ")

if tamanho_pizza == "P":
    VALOR_TOTAL += P
elif tamanho_pizza == "M":
    VALOR_TOTAL += M
elif tamanho_pizza == "G":
    VALOR_TOTAL += G
elif tamanho_pizza == "GG":
    VALOR_TOTAL += GG
elif tamanho_pizza == "TM":
    VALOR_TOTAL += TAMANHO_FAMILIA

sabor_pizza = input("Digite o sabor que deseja: ")
observacao_pedido = input("Alguma observação para o seu pedido ?: ")
print()
print("=" * 40)
print("{:^40}".format("PEDIDO DE PIZZA"))
print("=" * 40)
print(f"PEDIDO REGISTRADO PARA {nome_cliente}!")
print(f"SABOR: {sabor_pizza}")
print(f"TAMANHO: {tamanho_pizza}")
print(f"OBSERVAÇÕES: {observacao_pedido}")
print()

print("=" * 40)
print("{:^40}".format("TAXA DE FRETE"))
print("=" * 40)
delivery = input("SERÁ DELIVERY ? ESCOLHA [S/N]: ")

if delivery == "S":
    VALOR_TOTAL += TAXA_FRETE
    print(f"FOI APLICADO UMA TAXA DE FRETE NO VALOR DE R$:{TAXA_FRETE}")
else:
    print("COMO NÃO SERÁ DELIVERY FICARÁ INSENTO DA TAXA DE FRETE!")
print()

print("=" * 40)
print("{:^40}".format("DESCONTO"))
print("=" * 40)
if VALOR_TOTAL >= VALOR_PARA_GANHAR_DESCONTO:
    RESULTADO_DO_DESCONTO = VALOR_TOTAL / DESCONTO
    VALOR_TOTAL_COM_DESCONTO = VALOR_TOTAL - RESULTADO_DO_DESCONTO
    print(f"O VALOR DO SEU PEDIDO É DE: R${VALOR_TOTAL_COM_DESCONTO}")
else:
    print(f"SUA COMPRA FOI MENOR DO QUE R${VALOR_PARA_GANHAR_DESCONTO}, NENHUM DESCONTO SERÁ APLICADO!")
    print(f"O VALOR DO SEU PEDIDO É DE: R${VALOR_TOTAL}")
print()


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

        if VALOR_TOTAL_COM_DESCONTO > 0:
            VALOR_TOTAL_PARCELADO = VALOR_TOTAL_COM_DESCONTO / PARCELA
            print(
                f"{nome_cliente} VOCÊ DIVIDIU O SALDO DE R${VALOR_TOTAL_COM_DESCONTO} EM {PARCELA}x FICANDO NO VALOR DE R${VALOR_TOTAL_PARCELADO} CADA PARCELA")
        else:
            VALOR_TOTAL_PARCELADO = VALOR_TOTAL / PARCELA
            print(
                f"{nome_cliente} VOCÊ DIVIDIU O SALDO DE R${VALOR_TOTAL} EM {PARCELA}x FICANDO NO VALOR DE R${VALOR_TOTAL_PARCELADO} CADA PARCELA")

    elif METODO_PAGAMENTO == 2:
        print("PAGAMENTO NO DEBITO")
        if VALOR_TOTAL_COM_DESCONTO > 0:
            print(f"{nome_cliente} SEU VALOR TOTAL É DE: R${VALOR_TOTAL_COM_DESCONTO}")
        else:
            print(f"{nome_cliente} SEU VALOR TOTAL É DE: R${VALOR_TOTAL}")

    elif METODO_PAGAMENTO == 3:
        print("PAGAMENTO NO PIX")
        if VALOR_TOTAL_COM_DESCONTO > 0:
            print(f"{nome_cliente} SEU VALOR TOTAL É DE: R${VALOR_TOTAL_COM_DESCONTO}")
        else:
            print(f"{nome_cliente} SEU VALOR TOTAL É DE: R${VALOR_TOTAL}")


escolher_metodo_de_pagamento()
print()

if VALOR_TOTAL_COM_DESCONTO or VALOR_TOTAL < SALDO_DO_CLIENTE2:
    print("COMPRA APROVADA! OBRIGADO PELA PREFERÊNCIA.")

while VALOR_TOTAL_COM_DESCONTO or VALOR_TOTAL > SALDO_DO_CLIENTE2:
    print("SEU SALDO É INSUFICIENTE DESEJA CONTINUAR COM A COMPRA?")
    CONFIRMA_COMPRA = input("DIGITE [S/N]: ")
    if CONFIRMA_COMPRA == "S":
        escolher_metodo_de_pagamento()
    else:
        print(f"CLIENTE {nome_cliente} OPTOU POR NÃO CONTINUAR COM A COMPRA! ENCERRAMOS O PEDIDO")
        print("ATÉ BREVE!")
        break