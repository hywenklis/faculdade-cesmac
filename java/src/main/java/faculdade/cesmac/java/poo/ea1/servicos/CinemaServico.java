package faculdade.cesmac.java.poo.ea1.servicos;

import faculdade.cesmac.java.poo.ea1.dominio.Filme;

import java.util.List;
import java.util.Optional;

public class CinemaServico {
    public static Optional<Filme> encontraFilmeNaLista(List<Filme> filmes, String filmeEscolhido) {
        return Optional.ofNullable(filmes.stream()
                .filter(filme -> filme.getNome().equals(filmeEscolhido))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Filme não encontrado!")));
    }
}
