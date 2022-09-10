def bem_vindo():
    print("BEM-VINDO(A) IREMOS SEGUIR COM O SEU ATENDIMENTO!")
    print("COMO PODEMOS LHE CHAMAR? ")


def informacao_do_pedido(nome):
    print(f"OLÁ {nome} VAMOS SEGUIR COM SEU PEDIDO, ABAIXO PASSE ALGUMAS INFORMAÇÕES PARA QUE POSSAMOS SEGUIR!")


def tamanho_pizza():
    tamanho_pizza = input("Escolha entre os seguintes tamanho [P, M, G, GG, TF]: ")
    return tamanho_pizza


def sabor_pizza():
    sabor_pizza = input("Digite o sabor que deseja: ")
    return sabor_pizza


def observacao_pedido():
    observacao_pedido = input("Alguma observação para o seu pedido ?: ")
    return observacao_pedido


def registro_do_pedido(nome, sabor, tamanho, observacao):
    print()
    print("=" * 40)
    print("{:^40}".format("PEDIDO DE PIZZA"))
    print("=" * 40)
    print(f"PEDIDO REGISTRADO PARA {nome}!")
    print(f"SABOR: {sabor}")
    print(f"TAMANHO: {tamanho}")
    print(f"OBSERVAÇÕES: {observacao}")
    print()


def taxa_frete():
    print("=" * 40)
    print("{:^40}".format("TAXA DE FRETE"))
    print("=" * 40)
    delivery = input("SERÁ DELIVERY ? ESCOLHA [S/N]: ")
    return delivery