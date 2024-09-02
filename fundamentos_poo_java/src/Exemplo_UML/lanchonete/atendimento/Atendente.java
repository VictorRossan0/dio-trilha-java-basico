package Exemplo_UML.lanchonete.atendimento;

public class Atendente {
    private String nome;

    public Atendente(String nome) {
        this.nome = nome;
    }

    public void servirMesa() {
        System.out.println(nome + " está servindo a mesa.");
    }

    public void receberPagamento() {
        System.out.println(nome + " está recebendo o pagamento.");
    }
}

