package Exemplo_UML.lanchonete.area.cliente;

public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void escolherLanche() {
        System.out.println(nome + " está escolhendo o lanche.");
    }

    public void fazerPedido() {
        System.out.println(nome + " está fazendo o pedido.");
    }

    public void pagarConta() {
        System.out.println(nome + " está pagando a conta.");
    }
}

