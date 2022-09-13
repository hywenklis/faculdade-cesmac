print('\033[0;30;43mCALCUO DE POTÊNCIA EM UMA REDE FTTH\033[m')
# POTÊNCIA DE SAÍDA DA PORTA DA "OLT" - ESTE VALOR PODE VARIAR DE NEGATIVO A POSITIVO.
portaolt = float(input('Insira o valor de potência da OLT: '))
# PERDA DA FIBRA DO PERCURSO DA FIBRA - ESTE VALOR SEMPRE SERÁ NEGATIVO EXEMPLO: "-0.5".
perdfibra = float(input('Insira a perda da fibra: '))
# PERDA DO PRISMA DO SPLITTER - ESTE VALOR VARIA COM O TIPO DO SPLITTER.
perdsplitter = float(input('Insira a perda do Splitter: '))
# INFORMA SE O SPLITTER E BALANCEADO OU DESBALANCEADO - CADA PERNA DO SPLITTER PODE
# LIBERAR UM VALOR COMO POTENCIA DEPENDENDO DE QUANTOS % ELE TEM DE PERDA.
tiposplitter = int(input('Se splitter for balanceado DIGITE 1 senao DIGITE 0: '))
# CALCULO DOS VALORES ACIMA, O RESULTADO E O VALOR DE SAIDO DO SPLITTER BALANCEADO.
perda_total_l1 = portaolt+(perdfibra)+(perdsplitter)
#IMPRIMINDO O VALOR DA POTENCIA ATE O PRIMEIRO NIVEL DE ESPLITAGEM.
print("Perda do nivel de esplitagem e: ｛:.2f｝".format(perda_total_l1))
# ESTRUTURA CONDICIONAL PARA INFORMA O VALOR DEPENDEDO DA DECISÃO ACIMA.
if tiposplitter == 1:
    print('Estes e o valor que seguirar para o proximo nivel de esplitagem:{:.2f}'.format(perda_total_l1), 'dBm')
else:
    # FOI APLICADO UMA ESTRUTURA DE REPETIÇÃO PARA CRIAR O NIVEIS, NÃO PODENDO ULTRAPASSAR "-27", ESTE O LIMIAR DOS EQUIP
    perda1 = perda_total_l1
    while perda1 >= -27:
        print('============================================================')
        print('\033[0;30;43mINSÍRA AS INFORMAÇÕES DO PRÓXIMO NÍVEL DA REDE DESBALANCEADA\033[m')
        print('============================================================')
        menor_valor = int(input('Insira o menor valor de porcentagem: '))
        maior_valor = int(input('Insira o maior valor de porcentagem: '))
        porcentagem1 = menor_valor / 100
        porcentagem2 = maior_valor / 100
        calculo1 = perda1 * porcentagem1
        calculo2 = perda1 * porcentagem2
        perdfibra1 = float(input('Insira a perda da fibra: '))
        perdsplitter1 = float(input('Insira a perda do Splitter: '))
        calculo = (perdfibra1) + (perdsplitter1)
        print('O splitter utilizado e um: ', menor_valor, '/', maior_valor)
        print('Este e o valor que seguira para o proximo nivel de esplitagem: {:.2f}'.format(calculo1), 'dBm')
        print('Este e o valor que seguira para as CTO do nível: {:.2f}'.format(calculo2),'dBm')
        perda1 = (calculo1) + (perda1)
        print('Esta e a perda para o próximo nível de Esplitagem: {:.2f}'.format(perda1),'dBm')
    print("Valor Abaixo do Limiar dos Equipamentos!")