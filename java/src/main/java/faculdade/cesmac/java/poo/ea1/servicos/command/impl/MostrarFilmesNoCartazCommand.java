package faculdade.cesmac.java.poo.ea1.servicos.command.impl;

import faculdade.cesmac.java.poo.ea1.servicos.command.Command;

import static faculdade.cesmac.java.poo.ea1.servicos.CinemaServico.nomeDosfilmesNoCartaz;

public class MostrarFilmesNoCartazCommand implements Command {
    @Override
    public void executar() {
        System.out.println(nomeDosfilmesNoCartaz());
    }
}
