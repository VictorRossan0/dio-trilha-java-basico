package Exemplo_Getters_Setters;

public class ExemploGetSet {
    public static void main(String[] args) {
        // Criando um objeto Carro usando o construtor
        Carro meuCarro = new Carro("Toyota", 2020);

        // Exibindo as informações do carro
        meuCarro.exibirInfo();
        
        System.out.println();

        // Modificando os atributos usando os setters
        meuCarro.setMarca("Honda");
        meuCarro.setAno(2022);

        // Exibindo as informações do carro novamente
        meuCarro.exibirInfo();

        System.out.println();

        // Tentando definir um ano inválido
        meuCarro.setAno(1800); // Deverá exibir "Ano inválido!"
    }
}
