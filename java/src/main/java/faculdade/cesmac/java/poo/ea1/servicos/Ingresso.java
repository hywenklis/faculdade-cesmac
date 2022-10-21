package faculdade.cesmac.java.poo.ea1.servicos;

import faculdade.cesmac.java.poo.ea1.dominio.TipoIngresso;

public class Ingresso {
    public static Double retornaValorTotalDoIngresso(Integer qtd_ingresso, String tipoDoIngresso) {
        double valorTotal;
        if (retornaTipoDoIngresso(tipoDoIngresso).equals(TipoIngresso.INTEIRA)) {
            valorTotal = TipoIngresso.INTEIRA.getValor() * qtd_ingresso;
        } else {
            valorTotal = TipoIngresso.MEIA.getValor() * qtd_ingresso;
        }
        return valorTotal;
    }

    public static TipoIngresso retornaTipoDoIngresso(String tipoEngresso) {
        TipoIngresso categoria;
        if (tipoEngresso.equals("I")) {
            categoria = TipoIngresso.INTEIRA;
        } else {
            categoria = TipoIngresso.MEIA;
        }
        return categoria;
    }
}
