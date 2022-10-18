package faculdade.cesmac.java.media;

public class Media {

    private Double nota1;
    private Double nota2;
    private Double media;

    public void calculaMedia(final Double nota1, final Double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = (nota1 + nota2) / 2;
    }

    public Double retornaMedia() {
        return media;
    }
}
