package faculdade.cesmac.java.poo.ea1.servicos;

import faculdade.cesmac.java.poo.ea1.dominio.Filme;

import java.util.List;

import static faculdade.cesmac.java.poo.ea1.servicos.FilmeServico.filmeEncontrado;

public class CinemaServico {

    public static void encontraFilmeNaLista(List<Filme> filmes, String filmeEscolhido) {

        int posicaoDoFilme = 0;

        while (!filmeEscolhido.equals(filmes.get(posicaoDoFilme).getNome())) {

            posicaoDoFilme++;

            if (posicaoDoFilme == filmes.size()) {
                System.out.println("Filme não foi encontrado");
                break;
            }

            if (filmeEncontrado(filmes, filmeEscolhido, posicaoDoFilme)) break;

        }
        filmes.stream().filter(filme -> filme.getNome().equals(filmeEscolhido)).forEach(System.out::println);
    }
}
