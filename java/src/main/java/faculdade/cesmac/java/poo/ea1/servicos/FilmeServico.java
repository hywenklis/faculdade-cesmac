package faculdade.cesmac.java.poo.ea1.servicos;

import faculdade.cesmac.java.poo.ea1.dominio.Filme;

import java.util.List;

public class FilmeServico {
    static boolean filmeEncontrado(List<Filme> filmes, String filmeEscolhido, int posicaoDoFilme) {
        return filmeEscolhido.equals(filmes.get(posicaoDoFilme).getNome());
    }
}
