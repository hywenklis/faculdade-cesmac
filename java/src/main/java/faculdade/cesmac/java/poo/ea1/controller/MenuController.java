package faculdade.cesmac.java.poo.ea1.controller;

import faculdade.cesmac.java.poo.ea1.servicos.command.Command;
import faculdade.cesmac.java.poo.ea1.servicos.command.impl.CompraIngressoCommand;
import faculdade.cesmac.java.poo.ea1.servicos.command.impl.MostrarFilmesNoCartazCommand;
import faculdade.cesmac.java.poo.ea1.servicos.command.impl.MostrarSessaoDoFilmeCommand;

import java.util.Scanner;


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
        Scanner entrada = new Scanner(System.in);

        while (true) {
            showMenu();
            int opcao = entrada.nextInt();

            if (opcao == 0) {
                break;
            }

            Command command = retorneComandoParaOpcao(opcao);

            if (command == null) {
                System.err.println("Invalid option");
            } else {
                command.executar();
            }
        }
    }

    private static void showMenu() {
        menu();
    }

    private static Command retorneComandoParaOpcao(int opcao) {
        return switch (opcao) {
            case 1 -> new MostrarFilmesNoCartazCommand();
            case 2 -> new MostrarSessaoDoFilmeCommand();
            case 3 -> new CompraIngressoCommand();
            default -> null;
        };
    }
}
