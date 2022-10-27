package faculdade.cesmac.java.poo.ea1.servicos;

import faculdade.cesmac.java.poo.ea1.dominio.Filme;

import java.util.List;

public class CinemaServico {
    public static Filme encontraFilmeNaLista(List<Filme> filmes, String filmeEscolhido) {
        return filmes.stream()
                .filter(filme -> filme.getNome().equals(filmeEscolhido))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Filme não encontrado!"));
    }
}
