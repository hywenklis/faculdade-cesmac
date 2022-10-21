package faculdade.cesmac.java.poo.ea1.dominio;

public enum TipoIngresso {
    INTEIRA(32.00), MEIA(16.00);

    private final Double valor;

    TipoIngresso(double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }
}
