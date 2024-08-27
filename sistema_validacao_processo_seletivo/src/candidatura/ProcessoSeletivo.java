package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = { "Victor", "Arthur", "Marcos", "Juliana", "Roberta" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        // Inicializa a contagem de tentativas realizadas
        int tentativasRealizadas = 1;

        // Variável que indica se deve continuar tentando entrar em contato
        boolean continuarTentando = true;

        // Variável que indica se o candidato atendeu a chamada
        boolean atendeu = false;

        // Estrutura de repetição do-while para tentar entrar em contato
        do {
            // Chama o método atender() para simular a tentativa de contato
            atendeu = atender();

            // Se o candidato não atendeu, continua tentando
            continuarTentando = !atendeu;

            // Se deve continuar tentando, incrementa o número de tentativas
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                // Se o contato foi realizado com sucesso, imprime a mensagem de sucesso
                System.out.println("Contato realizado com sucesso");
            }
            // Continua tentando enquanto o candidato não atender e o número de tentativas
            // for menor que 3
        } while (continuarTentando && tentativasRealizadas < 3);

        // Verifica se o contato foi estabelecido
        if (atendeu) {
            // Se o candidato atendeu, imprime uma mensagem indicando a tentativa
            // bem-sucedida
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "ª tentativa");
        } else {
            // Se o candidato não atendeu após o número máximo de tentativas, imprime uma
            // mensagem de falha
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas ("
                    + tentativasRealizadas + ") realizadas");
        }
    }

    // Método auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        // Array contendo os nomes dos candidatos
        String[] candidatos = { "Victor", "Arthur", "Marcos", "Juliana", "Roberta" };

        // Mensagem informando que a lista de candidatos será impressa com o índice do
        // elemento
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        // Estrutura de repetição for para percorrer o array de candidatos
        for (int indice = 0; indice < candidatos.length; indice++) {
            // Imprime o número do candidato (índice + 1) e o nome correspondente no array
            System.out.println("O candidato de n° " + (indice + 1) + " é " + candidatos[indice]);
        }

        // Mensagem informando que a forma abreviada de iteração (for each) será
        // utilizada
        System.out.println("Forma abreviada de interação for each");

        // Estrutura de repetição for each para percorrer o array de candidatos
        for (String candidato : candidatos) {
            // Imprime o nome de cada candidato selecionado
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        // Array contendo os nomes dos candidatos
        String[] candidatos = { "Victor", "Arthur", "Marcos", "Juliana", "Roberta", "Giovana", "Daniel", "Mateus",
                "Luciana", "Daniela", "Daniel", "Felipe", "Marcia", "Paulo" };

        // Variável para contar quantos candidatos foram selecionados
        int candidatosSelecionados = 0;

        // Variável para rastrear o candidato atual a ser analisado
        int candidatosAtual = 0;

        // Definindo o salário base oferecido para a vaga
        double salarioBase = 2000.0;

        // Estrutura de repetição que continua até que 5 candidatos sejam selecionados
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            // Obtém o nome do candidato atual
            String candidato = candidatos[candidatosAtual];

            // Gera um valor aleatório para o salário pretendido pelo candidato
            double salarioPretendido = valorPretendido();

            // Exibe o nome do candidato e o valor de salário pretendido
            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);

            // Verifica se o salário pretendido pelo candidato é menor ou igual ao salário
            // base
            if (salarioBase >= salarioPretendido) {
                // Se for, o candidato é selecionado para a vaga
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }

            // Passa para o próximo candidato no array
            candidatosAtual++;
        }
    }

    // Método que retorna um valor aleatório de salário pretendido entre 1800 e 2200
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // Método para analisar o salário pretendido de um candidato em relação ao
    // salário base
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        // Se o salário pretendido for menor que o salário base, liga para o candidato
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        // Se o salário pretendido for igual ao salário base, liga com uma contra
        // proposta
        else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        // Se o salário pretendido for maior que o salário base, aguarda o resultado dos
        // demais candidatos
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
