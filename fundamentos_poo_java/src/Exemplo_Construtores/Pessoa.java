package Exemplo_Construtores;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;

    // Construtor padrão (sem parâmetros)
    public Pessoa() {
        this.nome = "Desconhecido";
        this.idade = 0;
    }

    // Construtor com parâmetros
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos para exibir as informações da pessoa
    public void exibirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
}