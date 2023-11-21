package faculdade.cesmac.java.poo.ea1.servicos;

import faculdade.cesmac.java.poo.ea1.dominio.TipoIngresso;

import java.util.Scanner;

public class IngressoServico {

    public static Double retornaValorTotalDoIngresso(Integer qtd_ingresso, TipoIngresso tipoDoIngressoEscolhido) {
        return qtd_ingresso * tipoDoIngressoEscolhido.getValor();
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
