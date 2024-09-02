package Exemplo_Construtores;

public class ExemploConstrutores {
    public static void main(String[] args) {
        // Usando o construtor padrão
        Pessoa pessoa1 = new Pessoa();
        pessoa1.exibirInfo();
        
        System.out.println();

        // Usando o construtor com parâmetros
        Pessoa pessoa2 = new Pessoa("Ana", 25);
        pessoa2.exibirInfo();
    }
}

