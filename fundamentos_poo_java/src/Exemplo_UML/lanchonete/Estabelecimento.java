package Exemplo_UML.lanchonete;

import Exemplo_UML.lanchonete.area.cliente.Cliente;
import Exemplo_UML.lanchonete.atendimento.Almoxarife;
import Exemplo_UML.lanchonete.atendimento.Atendente;
import Exemplo_UML.lanchonete.atendimento.Cozinheiro;

public class Estabelecimento {
    private Atendente atendente;
    private Cozinheiro cozinheiro;
    private Almoxarife almoxarife;

    public Estabelecimento(Atendente atendente, Cozinheiro cozinheiro, Almoxarife almoxarife) {
        this.atendente = atendente;
        this.cozinheiro = cozinheiro;
        this.almoxarife = almoxarife;
    }

    public static void main(String[] args) {
        Atendente atendente = new Atendente("João");
        Cozinheiro cozinheiro = new Cozinheiro("Maria");
        Almoxarife almoxarife = new Almoxarife("Pedro");

        Estabelecimento lanchonete = new Estabelecimento(atendente, cozinheiro, almoxarife);

        Cliente cliente = new Cliente("Ana");
        cliente.escolherLanche();
        cliente.fazerPedido();

        atendente.servirMesa();
        atendente.receberPagamento();
    }
}
