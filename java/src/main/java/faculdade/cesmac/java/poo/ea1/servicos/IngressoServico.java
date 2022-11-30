package faculdade.cesmac.java.poo.ea1.servicos;

import faculdade.cesmac.java.poo.ea1.dominio.TipoIngresso;

import java.util.Scanner;

public class IngressoServico {
    public static Double retornaValorTotalDoIngresso(Integer qtd_ingresso, TipoIngresso tipoDoIngressoEscolhido) {
        double valorTotal = 0;
        if (tipoDoIngressoEscolhido.name().equals(TipoIngresso.COMUM_INTEIRA.name())) {
            valorTotal = TipoIngresso.COMUM_INTEIRA.getValor() * qtd_ingresso;
        } else if (tipoDoIngressoEscolhido.name().equals(TipoIngresso.COMUM_MEIA.name())) {
            valorTotal = TipoIngresso.COMUM_MEIA.getValor() * qtd_ingresso;
        } else if (tipoDoIngressoEscolhido.name().equals(TipoIngresso.VIP_INTEIRA.name())) {
            valorTotal = TipoIngresso.VIP_INTEIRA.getValor() * qtd_ingresso;
        } else if (tipoDoIngressoEscolhido.name().equals(TipoIngresso.VIP_MEIA.name())) {
            valorTotal = TipoIngresso.VIP_MEIA.getValor() * qtd_ingresso;
        }
        return valorTotal;
    }

    public static TipoIngresso retornaTipoDoIngresso(Integer tipoIngressoEscolhido) {
        return switch (tipoIngressoEscolhido) {
            case 1 -> TipoIngresso.COMUM_INTEIRA;
            case 2 -> TipoIngresso.COMUM_MEIA;
            case 3 -> TipoIngresso.VIP_INTEIRA;
            case 4 -> TipoIngresso.VIP_MEIA;
            default -> null;
        };
    }

    public static Integer retornaQtdIngressoEscolhido(Scanner scan) {
        System.out.println("Quantos ingressos deseja para esse filme: ");
        return scan.nextInt();
    }

    public static void acessoLanchonete(Boolean ingressoVip) {
        System.out.println(ingressoVip ? "Lanchonete do cinema liberada" : "Compre um ingresso VIP");
    }
}
