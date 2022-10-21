package faculdade.cesmac.java.poo.ea1.aplicacao;

import faculdade.cesmac.java.poo.ea1.dominio.Filme;
import faculdade.cesmac.java.poo.ea1.dominio.Sessao;
import faculdade.cesmac.java.poo.ea1.servicos.Cinema;
import faculdade.cesmac.java.poo.ea1.servicos.Ingresso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Filme> filmes = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o filme que você quer assistir: ");
        String filmeEscolhido = scan.nextLine();

        System.out.println("Digite o tipo de ingresso [I - INTEIRA / M - MEIA]: ");
        String tipoDeIngressoEscolhido = scan.nextLine();

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

        List<Sessao> listaDeSessao = List.of(sessao1, sessao2, sessao3);

        filme1.setNome("Vingadores");
        filme1.setSessao(Collections.singletonList(listaDeSessao.get(sessaoEscolhida - 1)));
        filme1.setQtd_ingresso(qtd_ingressos_adquiridos);
        filme1.setTipoIngresso(Ingresso.retornaTipoDoIngresso(tipoDeIngressoEscolhido));

        filme2.setNome("Titanic");
        filme2.setSessao(Collections.singletonList(listaDeSessao.get(sessaoEscolhida - 1)));
        filme2.setQtd_ingresso(qtd_ingressos_adquiridos);
        filme2.setTipoIngresso(Ingresso.retornaTipoDoIngresso(tipoDeIngressoEscolhido));

        filme3.setNome("Panico");
        filme3.setSessao(Collections.singletonList(listaDeSessao.get(sessaoEscolhida - 1)));
        filme3.setQtd_ingresso(qtd_ingressos_adquiridos);
        filme3.setTipoIngresso(Ingresso.retornaTipoDoIngresso(tipoDeIngressoEscolhido));

        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);

        Cinema.encontraFilme(filmes, filmeEscolhido);
        double valorTotal = Ingresso.retornaValorTotalDoIngresso(qtd_ingressos_adquiridos, tipoDeIngressoEscolhido);
        System.out.println("Valor total dos ingressos que foi solicitado é de: " + valorTotal);
    }

}

