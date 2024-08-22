// Estrutura de repetição (while)
// Estrutura condicional de início
// Ideal para loops onde a condição é verificada antes do bloco de código ser executado.

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.00;  // Joãozinho começa com uma mesada de 50 reais.

        // O loop while continua executando enquanto a condição for verdadeira.
        // Neste caso, o loop continua até que a mesada de Joãozinho seja maior que 0.
        while (mesada > 0) {
            double valorDoce = valorAleatorio();  // Gera um valor aleatório para o preço de um doce.
            
            // Se o valor do doce for maior que a mesada restante, ajusta o valor para gastar exatamente o restante da mesada.
            // Esse passo garante que a mesada não fique negativa.
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " adicionado no carrinho.");
            mesada = mesada - valorDoce;  // Subtrai o valor do doce da mesada de Joãozinho.
        }

        // Quando a mesada acaba, o loop termina e o programa exibe que a mesada foi totalmente gasta.
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }

    // Método que gera um valor aleatório entre 2 e 8 reais, representando o preço de um doce.
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}

/*
Explicação:

Loop while:

Comentários: O loop while executa o bloco de código enquanto a condição for verdadeira. 
No exemplo, o loop continua a execução enquanto Joãozinho ainda tem mesada disponível. 
Cada doce comprado reduz o valor da mesada, e o loop termina quando a mesada atinge 0.

Exemplo de controle com condição: O loop verifica a condição antes de cada execução. 
Se a mesada de Joãozinho for menor que o preço de um doce, o código ajusta o preço do doce para 
não exceder o valor restante da mesada, evitando assim que a mesada fique negativa.
*/
