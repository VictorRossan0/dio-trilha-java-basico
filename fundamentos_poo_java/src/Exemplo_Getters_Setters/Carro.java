package Exemplo_Getters_Setters;

public class Carro {
    // Atributos privados
    private String marca;
    private int ano;

    // Construtor para inicializar o objeto
    public Carro(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    // Getter para o atributo marca
    public String getMarca() {
        return marca;
    }

    // Setter para o atributo marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter para o atributo ano
    public int getAno() {
        return ano;
    }

    // Setter para o atributo ano
    public void setAno(int ano) {
        // Opcional: validar o ano antes de definir
        if (ano > 1885) { // O primeiro carro foi inventado em 1886
            this.ano = ano;
        } else {
            System.out.println("Ano inválido!");
        }
    }

    // Método para exibir as informações do carro
    public void exibirInfo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
    }
}