// Estrutura de repetição (do-while)
// Estrutura condicional de fim
// Ideal para garantir que o bloco de código seja executado pelo menos uma vez, verificando a condição depois.

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {

        System.out.println("Discando...");

        // O loop do-while executa o bloco de código pelo menos uma vez
        // antes de verificar a condição. No exemplo, o telefone irá tocar
        // pelo menos uma vez, independente de alguém atender ou não.
        do {
            System.out.println("Telefone tocando");
        } while (tocando());  // A condição é verificada após a execução do bloco.
                              // Se tocando() retornar true, o loop continua,
                              // caso contrário, o loop termina.

        System.out.println("Alô !!!");  // Este código é executado quando alguém atende o telefone.

    }

    // Método que simula se o telefone foi atendido
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;  // Simula a probabilidade de atender o telefone.
        System.out.println("Atendeu? " + atendeu);
        // Negando o valor de "atendeu" para continuar ou parar o loop do-while.
        return !atendeu;  // Se atendeu for true, o loop para; se for false, o loop continua.
    }
}

/*
Explicação:

Loop do-while:

Comentários: O loop do-while sempre executa o bloco de código pelo menos uma vez antes de verificar a condição.
Neste exemplo, o telefone sempre "toca" pelo menos uma vez, e a condição para continuar o loop (a pessoa não atender)
é verificada após essa execução inicial.

Exemplo com condição falsa: Mesmo que a condição "tocando()" seja falsa desde o início (ou seja, alguém atende o telefone),
o bloco de código dentro do do-while é executado uma vez antes de verificar se deve continuar repetindo.
*/
