package faculdade.cesmac.java.poo.ea1.dominio;

import java.util.List;

public class Filme {
    private String nome;
    private List<Sessao> sessao;
    private Integer qtd_ingresso;
    private TipoIngresso tipoIngresso;

    public void setTipoIngresso(TipoIngresso tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSessao(List<Sessao> sessao) {
        this.sessao = sessao;
    }

    @Override
    public String toString() {
        return "Filme{" + "nome='" + nome + '\'' + ", sessao=" + sessao + ", qtd_ingresso=" + qtd_ingresso + ", tipoIngresso=" + tipoIngresso + '}';
    }

    public void setQtd_ingresso(Integer qtd_ingresso) {
        this.qtd_ingresso = qtd_ingresso;
    }

}
