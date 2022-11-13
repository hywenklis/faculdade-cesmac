package faculdade.cesmac.java.poo.ea1.dominio;

public class Ingresso {
    private String filme;
    private TipoIngresso tipoIngresso;
    private Sessao sessao;
    private int qtd_ingresso;

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public void setTipoIngresso(TipoIngresso tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public TipoIngresso getTipoIngresso() {
        return tipoIngresso;
    }

    public int getQtd_ingresso() {
        return qtd_ingresso;
    }

    public void setQtd_ingresso(int qtd_ingresso) {
        this.qtd_ingresso = qtd_ingresso;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "filme=" + filme +
                ", tipo do ingresso=" + tipoIngresso +
                ", sessao=" + sessao +
                ", quantidade de ingressos=" + qtd_ingresso +
                '}';
    }
}
