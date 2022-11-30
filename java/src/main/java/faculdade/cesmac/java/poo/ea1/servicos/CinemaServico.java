package faculdade.cesmac.java.poo.ea1.servicos;

import faculdade.cesmac.java.poo.ea1.builder.Dados;
import faculdade.cesmac.java.poo.ea1.dominio.Filme;

import java.util.List;

import static faculdade.cesmac.java.poo.ea1.servicos.IngressoServico.retornaTipoDoIngresso;

public class CinemaServico {
    public static Filme encontraFilmeNaLista(List<Filme> filmes, String filmeEscolhido) {
        return filmes.stream()
                .filter(filme -> filme.getNome().equals(filmeEscolhido))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Filme não encontrado!"));
    }

    public static void nomeDosfilmesNoCartaz() {
        List<Filme> filmes = Dados.filmesNoCartaz();
        filmes.stream().map(Filme::getNome).forEach(System.out::println);
    }

    public static Boolean retornaFilme3D(Filme filmeEncontrado, Integer tipoIngressoEscolhido) {
        return switch (retornaTipoDoIngresso(tipoIngressoEscolhido)) {
            case VIP_INTEIRA, VIP_MEIA -> filmeEncontrado.setFilme3D(true);
            default -> filmeEncontrado.setFilme3D(false);
        };
    }
}
