package Exemplo_UML.lanchonete.atendimento;

public class Cozinheiro {
    private String nome;

    public Cozinheiro(String nome) {
        this.nome = nome;
    }

    public void adicionarLancheNoBalcao() {
        System.out.println(nome + " está adicionando o lanche no balcão.");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println(nome + " está adicionando o suco no balcão.");
    }
}

