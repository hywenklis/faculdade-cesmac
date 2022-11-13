package faculdade.cesmac.java.poo.ea1.servicos;

import faculdade.cesmac.java.poo.ea1.dominio.TipoIngresso;

import java.util.Scanner;

public class IngressoServico {
    public static Double retornaValorTotalDoIngresso(Integer qtd_ingresso, TipoIngresso tipoDoIngressoEscolhido) {
        double valorTotal;
        if (tipoDoIngressoEscolhido.name().equals(TipoIngresso.INTEIRA.name())) {
            valorTotal = TipoIngresso.INTEIRA.getValor() * qtd_ingresso;
        } else {
            valorTotal = TipoIngresso.MEIA.getValor() * qtd_ingresso;
        }
        return valorTotal;
    }

    public static TipoIngresso retornaTipoDoIngresso(String tipoIngressoEscolhido) {
        TipoIngresso categoria;
        if (tipoIngressoEscolhido.equals("I".toLowerCase())) {
            categoria = TipoIngresso.INTEIRA;
        } else {
            categoria = TipoIngresso.MEIA;
        }
        return categoria;
    }

    public static Integer retornaQtdIngressoEscolhido(Scanner scan) {
        System.out.println("Quantos ingressos deseja para esse filme: ");
        Integer qtd_ingressos_adquiridos = scan.nextInt();
        return qtd_ingressos_adquiridos;
    }
}
