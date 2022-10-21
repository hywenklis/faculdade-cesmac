package faculdade.cesmac.java.poo.ea1.dominio;


public class Sessao {
    private Integer sala;
    private String hora;

    @Override
    public String toString() {
        return "{sala=" + sala + ", hora='" + hora + '\'' + '}';
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

}
