package faculdade.cesmac.java.poo.ea1.servicos.command.impl;

import faculdade.cesmac.java.poo.ea1.servicos.command.Command;

import static faculdade.cesmac.java.poo.ea1.servicos.SessaoServico.retornaSessaoDoFilme;

public class MostrarSessaoDoFilmeCommand implements Command {
    @Override
    public void executar() {
        retornaSessaoDoFilme();
    }
}
