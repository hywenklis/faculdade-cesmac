package faculdade.cesmac.java.poo.ea1.dominio;

public class Filme {
    private String nome;
    private String diretor;
    private String descricao;
    private String genero;
    private String duracaoFilme;

    public Boolean getFilme3D() {
        return filme3D;
    }

    private Boolean filme3D;

    public Boolean setFilme3D(Boolean filme3D) {
        this.filme3D = filme3D;
        return filme3D;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracaoFilme(String duracaoFilme) {
        this.duracaoFilme = duracaoFilme;
    }

    @Override
    public String toString() {
        return "====================================================" +
                "\nFILME = " + nome + "\n" +
                "\nDIRETOR = " + diretor + "\n" +
                "\nDESCRIÇÃO = " + descricao +
                "\nGÊNERO = " + genero + "\n" +
                "\nDURAÇÃO DO FILME = " + duracaoFilme + "\n" +
                "\n=================================================";
    }
}
