P = 15.00
M = 20.00
G = 30.00
GG = 45.00
TAMANHO_FAMILIA = 150.00

VALOR_TOTAL = 0.0
TAXA_FRETE = 10.00
VALOR_PARA_GANHAR_DESCONTO = 150.00
DESCONTO = 10

print("BEM-VINDO(A) IREMOS SEGUIR COM O SEU ATENDIMENTO!")
print("COMO PODEMOS LHE CHAMAR ?")
nome_cliente = input("Digite seu nome: ")
print(f"OLÁ {nome_cliente} VAMOS SEGUIR COM SEU PEDIDO, ABAIXO PASSE ALGUMA INFORMAÇÕES PARA QUE POSSAMOS SEGUIR!")
tamanho_pizza = input("Escolha entre os seguintes tamanho [P, M, G, GG]: ")

if tamanho_pizza == "P":
    VALOR_TOTAL += P
elif tamanho_pizza == "M":
    VALOR_TOTAL += M
elif tamanho_pizza == "G":
    VALOR_TOTAL += G
elif tamanho_pizza == "GG":
    VALOR_TOTAL += GG
else:
    VALOR_TOTAL += TAMANHO_FAMILIA

sabor_pizza = input("Digite o sabor que deseja: ")
observacao_pedido = input("Alguma observação para o seu pedido ?: ")
print()
print("------------PEDIDO-PIZZARIA---------------")
print("------------------------------------------")
print(f"PEDIDO REGISTRADO PARA SRº{nome_cliente}!")
print(f"SABOR: {sabor_pizza}")
print(f"TAMANHO: {tamanho_pizza}")
print(f"OBSERVAÇÕES: {observacao_pedido}")
print("------------------------------------------")
print()

delivery = input("SERÁ DELIVERY ? ESCOLHA [S/N]: ")

if delivery == "S":
    VALOR_TOTAL += TAXA_FRETE
else:
    print("COMO NÃO SERÁ DELIVERY FICARÁ INSENTO DA TAXA DE FRETE!")

if VALOR_TOTAL >= VALOR_PARA_GANHAR_DESCONTO:
    RESULTADO_DO_DESCONTO = VALOR_TOTAL / DESCONTO
    VALOR_TOTAL_COM_DESCONTO = VALOR_TOTAL - RESULTADO_DO_DESCONTO
else:
    print("Nenhum desconto aplicado")
print(f"O VALOR DO SEU PEDIDO É DE: R${VALOR_TOTAL_COM_DESCONTO}")
