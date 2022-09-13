def calcula(valor_total, valor_para_ganhar_desconto, desconto):
    if valor_total >= valor_para_ganhar_desconto:
        resultado_desconto = valor_total / desconto
        valor_total_com_desconto = valor_total - resultado_desconto
        return valor_total_com_desconto