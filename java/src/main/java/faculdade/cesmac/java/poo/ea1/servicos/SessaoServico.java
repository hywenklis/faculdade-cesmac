package faculdade.cesmac.java.poo.ea1.servicos;

import faculdade.cesmac.java.poo.ea1.builder.Dados;
import faculdade.cesmac.java.poo.ea1.dominio.Sessao;

import java.util.List;

public class SessaoServico {

    public static Sessao encontraSessaoNaLista(List<Sessao> sessoes, Integer sessaoEscolhida) {
        return sessoes.stream()
                .filter(sessao -> sessao.getSala().equals(sessaoEscolhida))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Sessão não encontrada!"));
    }

    public static Sessao retornaSessaoAdquirida() {
        List<Sessao> sessoes = Dados.sessoesDoFilme();
        sessoes.stream().map(Sessao::toString).forEach(System.out::println);
        return new Sessao();
    }
}
