package faculdade.cesmac.java.poo.ea1.servicos;

import faculdade.cesmac.java.poo.ea1.dominio.TipoIngresso;

public class IngressoServico {
    public static Double retornaValorTotalDoIngresso(Integer qtd_ingresso, String tipoDoIngressoEscolhido) {
        double valorTotal;
        if (retornaTipoDoIngresso(tipoDoIngressoEscolhido).equals(TipoIngresso.INTEIRA)) {
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
}
