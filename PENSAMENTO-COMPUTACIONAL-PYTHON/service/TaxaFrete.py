def calcula(delivery, valor_total_cliente, taxa_frete):
    if delivery == "S":
        valor_total_cliente += taxa_frete
        print(f"FOI APLICADO UMA TAXA DE FRETE NO VALOR DE R$:{taxa_frete}")
    else:
        print("COMO NÃO SERÁ DELIVERY FICARÁ INSENTO DA TAXA DE FRETE!")
    print()
    return valor_total_cliente
