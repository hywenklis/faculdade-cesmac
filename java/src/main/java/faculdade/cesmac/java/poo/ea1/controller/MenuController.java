package faculdade.cesmac.java.poo.ea1.controller;

import java.util.Scanner;

import static faculdade.cesmac.java.poo.ea1.aplicacao.Dados.retornaCompraDeIngresso;
import static faculdade.cesmac.java.poo.ea1.servicos.CinemaServico.nomeDosfilmesNoCartaz;
import static faculdade.cesmac.java.poo.ea1.servicos.SessaoServico.retornaSessaoAdquirida;


public class MenuController {

    public static void menu() {
        System.out.println("=================================================");
        System.out.println("\t\t\t\t\tCINEMA");
        System.out.println("=================================================");
        System.out.println("Digite um número para selecionar a opção desejada");
        System.out.println("0. Fim");
        System.out.println("1. Lista de filmes no cartaz");
        System.out.println("2. Lista de Sessões");
        System.out.println("3. Comprar ingressos");
        System.out.println("Opcao: ");
    }

    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);

        do {
            menu();
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> nomeDosfilmesNoCartaz();
                case 2 -> retornaSessaoAdquirida();
                case 3 -> retornaCompraDeIngresso();
            }

            if (opcao > 3) {
                System.err.println("Opção inválida");
            }

        } while (opcao != 0);
    }
}
