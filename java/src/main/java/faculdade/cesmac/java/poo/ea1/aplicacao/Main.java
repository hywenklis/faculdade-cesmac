package faculdade.cesmac.java.poo.ea1.aplicacao;

import faculdade.cesmac.java.poo.ea1.dominio.Filme;
import faculdade.cesmac.java.poo.ea1.dominio.Sessao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static faculdade.cesmac.java.poo.ea1.servicos.CinemaServico.encontraFilmeNaLista;
import static faculdade.cesmac.java.poo.ea1.servicos.IngressoServico.retornaTipoDoIngresso;
import static faculdade.cesmac.java.poo.ea1.servicos.IngressoServico.retornaValorTotalDoIngresso;

public class Main {

    public static void main(String[] args) {

        List<Filme> filmes = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o filme que você quer assistir: ");
        String filmeEscolhido = scan.nextLine();

        System.out.println("Digite o tipo de ingresso [I - INTEIRA / M - MEIA]: ");
        String tipoDeIngressoEscolhido = scan.nextLine().toLowerCase();

        System.out.println("Escolha a sessao para assistir o filme [1 - 18hrs, 2 - 19hrs, 3 - 20hrs]: ");
        int sessaoEscolhida = scan.nextInt();

        System.out.println("Quantos ingressos deseja para esse filme: ");
        Integer qtd_ingressos_adquiridos = scan.nextInt();

        Filme filme1 = new Filme();
        Filme filme2 = new Filme();
        Filme filme3 = new Filme();

        Sessao sessao1 = new Sessao();
        Sessao sessao2 = new Sessao();
        Sessao sessao3 = new Sessao();

        sessao1.setSala(1);
        sessao1.setHora("18:00");

        sessao2.setSala(2);
        sessao2.setHora("19:00");

        sessao3.setSala(3);
        sessao3.setHora("20:00");

        List<Sessao> sessoes = List.of(sessao1, sessao2, sessao3);

        filme1.setNome("Vingadores");
        filme1.setSessao(List.of(sessoes.get(sessaoEscolhida - 1)));
        filme1.setQtd_ingresso(qtd_ingressos_adquiridos);
        filme1.setTipoIngresso(retornaTipoDoIngresso(tipoDeIngressoEscolhido));

        filme2.setNome("Titanic");
        filme2.setSessao(List.of(sessoes.get(sessaoEscolhida - 1)));
        filme2.setQtd_ingresso(qtd_ingressos_adquiridos);
        filme2.setTipoIngresso(retornaTipoDoIngresso(tipoDeIngressoEscolhido));

        filme3.setNome("Panico");
        filme3.setSessao(List.of(sessoes.get(sessaoEscolhida - 1)));
        filme3.setQtd_ingresso(qtd_ingressos_adquiridos);
        filme3.setTipoIngresso(retornaTipoDoIngresso(tipoDeIngressoEscolhido));

        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);

        Filme filmeEncontrado = encontraFilmeNaLista(filmes, filmeEscolhido);
        System.out.println(filmeEncontrado);

        double valorTotal = retornaValorTotalDoIngresso(qtd_ingressos_adquiridos, tipoDeIngressoEscolhido);
        System.out.println("Valor total dos ingressos que foi solicitado é de: " + valorTotal);
    }

}

