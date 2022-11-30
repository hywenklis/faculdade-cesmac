package faculdade.cesmac.java.poo.ea1.dominio;

public enum TipoIngresso {
    VIP_INTEIRA(48.00),
    VIP_MEIA(24.00),
    COMUM_INTEIRA(24.00),
    COMUM_MEIA(12.00);

    private final Double valor;

    TipoIngresso(double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }
}
