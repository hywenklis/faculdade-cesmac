package faculdade.cesmac.java.poo.ea1.servicos.command.impl;

import faculdade.cesmac.java.poo.ea1.servicos.command.Command;

import static faculdade.cesmac.java.poo.ea1.builder.Dados.retornaCompraDeIngresso;

public class CompraIngressoCommand implements Command {
    @Override
    public void executar() {
        retornaCompraDeIngresso();
    }
}
