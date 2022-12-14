package faculdade.cesmac.java.poo.ea1.builder;

import faculdade.cesmac.java.poo.ea1.dominio.Filme;
import faculdade.cesmac.java.poo.ea1.dominio.Ingresso;
import faculdade.cesmac.java.poo.ea1.dominio.Sessao;
import faculdade.cesmac.java.poo.ea1.servicos.IngressoServico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static faculdade.cesmac.java.poo.ea1.servicos.CinemaServico.encontraFilmeNaLista;
import static faculdade.cesmac.java.poo.ea1.servicos.CinemaServico.nomeDosfilmesNoCartaz;
import static faculdade.cesmac.java.poo.ea1.servicos.CinemaServico.retornaFilme3D;
import static faculdade.cesmac.java.poo.ea1.servicos.IngressoServico.retornaQtdIngressoEscolhido;
import static faculdade.cesmac.java.poo.ea1.servicos.IngressoServico.retornaTipoDoIngresso;
import static faculdade.cesmac.java.poo.ea1.servicos.IngressoServico.retornaValorTotalDoIngresso;
import static faculdade.cesmac.java.poo.ea1.servicos.SessaoServico.encontraSessaoNaLista;

public class Dados {

    public static List<Filme> filmesNoCartaz() {

        List<Filme> filmes = new ArrayList<>();

        Filme filme1 = new Filme();
        Filme filme2 = new Filme();
        Filme filme3 = new Filme();

        filme1.setNome("Sem Remorso");
        filme1.setDescricao("""
                 Um fuzileiro naval de elite descobre uma conspiração internacional enquanto busca justiça
                 pelo assassinato de sua esposa grávida em Sem Remorso,
                 de Tom Clancy. A história conta a origem explosiva do herói de ação John Clark
                 - um dos personagens mais populares do universo de Jack Ryan, do mesmo autor.
                """);
        filme1.setGenero("Suspense, Ação, Militar e Guerra");
        filme1.setDuracaoFilme("1h50min");
        filme1.setDiretor("Stefano Sollima");

        filme2.setNome("A Guerra do Amanhã");
        filme2.setDescricao("""
                Viajantes do tempo chegam de 2051 trazendo uma mensagem urgente: 30 anos no futuro a\s
                humanidade está perdendo uma guerra contra alienígenas mortíferos.\s
                A única esperança de sobrevivência é enviar soldados e civis para lutar no futuro.\s
                Determinado a salvar o mundo por sua filha,\s
                Dan Forester se une a uma cientista brilhante e a seu pai afastado para reescrever o destino do planeta.
                """);
        filme2.setGenero("Ficção científica, Suspense, Drama, Ação, Aventura");
        filme2.setDuracaoFilme("2h18min");
        filme2.setDiretor("Chris McKay");

        filme3.setNome("Velozes & Furiosos: Hobbs & Shaw");
        filme3.setDescricao("""
                Durante anos, o agente fortão Luke Hobbs e o fora-da-lei Deckard Shaw sempre se estranharam,
                 com muitas provocações. Mas quando Brixton, um anarquista modificado ciberneticamente, passa a controlar
                 uma insidiosa ameaça biológica, que pode alterar a humanidade para sempre, Hobbs e Shaw têm que trabalhar
                 juntos para derrotar o único que pode ser mais furioso do que eles!
                """);
        filme3.setGenero("Ação");
        filme3.setDuracaoFilme("2h16min");
        filme3.setDiretor("David Leitch");

        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);

        return filmes;
    }

    public static List<Sessao> sessoesDoFilme() {
        Sessao sessao1 = new Sessao();
        Sessao sessao2 = new Sessao();
        Sessao sessao3 = new Sessao();

        sessao1.setSala(1);
        sessao1.setHora("18:00");

        sessao2.setSala(2);
        sessao2.setHora("19:00");

        sessao3.setSala(3);
        sessao3.setHora("20:00");

        return List.of(sessao1, sessao2, sessao3);
    }

    public static List<Ingresso> retornaCompraDeIngresso() {
        Scanner scan = new Scanner(System.in);
        List<Ingresso> ingressos = new ArrayList<>();
        Ingresso ingresso = new Ingresso();

        System.out.println(nomeDosfilmesNoCartaz());

        System.out.println("Digite o filme que você quer assistir: ");
        String filmeEscolhido = scan.nextLine();

        Filme filmeEncontrado = encontraFilmeNaLista(filmesNoCartaz(), filmeEscolhido);
        System.out.println(filmeEncontrado);
        ingresso.setFilme(String.valueOf(filmeEncontrado.getNome()));

        System.out.println("Digite o tipo de ingresso [1 - COMUM_INTEIRA / 2 - COMUM_MEIA / 3 - VIP_INTEIRA / 4 - VIP_MEIA]: ");
        Integer tipoIngressoEscolhido = scan.nextInt();
        ingresso.setTipoIngresso(retornaTipoDoIngresso(tipoIngressoEscolhido));

        Boolean filme3d = retornaFilme3D(filmeEncontrado, tipoIngressoEscolhido);

        System.out.println("Escolha a sessao para assistir o filme [1 - 18hrs, 2 - 19hrs, 3 - 20hrs]: ");
        Integer sessaoEscolhida = scan.nextInt();

        Sessao sessaoEncontrada = encontraSessaoNaLista(sessoesDoFilme(), sessaoEscolhida);
        ingresso.setSessao(sessaoEncontrada);

        ingresso.setSessao(sessaoEncontrada);
        ingresso.setQtd_ingresso(retornaQtdIngressoEscolhido(new Scanner(System.in)));

        ingressos.add(ingresso);
        ingressos.forEach(System.out::println);

        double valorTotal = retornaValorTotalDoIngresso(ingresso.getQtd_ingresso(), ingresso.getTipoIngresso());
        System.out.println("Valor total dos ingressos que foi solicitado é de: R$" + valorTotal);
        IngressoServico.acessoLanchonete(filme3d);
        return ingressos;
    }

}

