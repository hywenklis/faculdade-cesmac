package faculdade.cesmac.java.poo.ea1.servicos;

import faculdade.cesmac.java.poo.ea1.builder.Dados;
import faculdade.cesmac.java.poo.ea1.dominio.Filme;
import faculdade.cesmac.java.poo.ea1.dominio.TipoIngresso;

import java.util.List;
import java.util.stream.Collectors;

import static faculdade.cesmac.java.poo.ea1.dominio.TipoIngresso.*;
import static faculdade.cesmac.java.poo.ea1.servicos.IngressoServico.retornaTipoDoIngresso;

public class CinemaServico {
    public static Filme encontraFilmeNaLista(List<Filme> filmes, String filmeEscolhido) {
        return filmes.stream()
                .filter(filme -> filme.getNome().equals(filmeEscolhido))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Filme não encontrado!"));
    }

    public static List<String> nomeDosfilmesNoCartaz() {
        List<Filme> filmes = Dados.filmesNoCartaz();
        return filmes.stream()
                .map(Filme::getNome)
                .collect(Collectors.toList());
    }

    public static Boolean retornaFilme3D(Filme filme, Integer tipoIngressoEscolhido) {
        TipoIngresso tipo = retornaTipoDoIngresso(tipoIngressoEscolhido);
        filme.setFilme3D(tipo == VIP_INTEIRA || tipo == VIP_MEIA);
        return filme.getFilme3D();
    }
}
