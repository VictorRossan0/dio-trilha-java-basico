package Exemplo_UML.lanchonete.atendimento;

public class Almoxarife {
    private String nome;

    public Almoxarife(String nome) {
        this.nome = nome;
    }

    public void controlarEntrada() {
        System.out.println(nome + " está controlando a entrada dos itens.");
    }

    public void controlarSaida() {
        System.out.println(nome + " está controlando a saída dos itens.");
    }

    public void entregarIngredientes() {
        System.out.println(nome + " está entregando os ingredientes.");
    }
}

