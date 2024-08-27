package desafios.controle_fluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // Criando o objeto Scanner para capturar a entrada do usuário via terminal
        Scanner terminal = new Scanner(System.in);

        try {
            // Solicita ao usuário o primeiro parâmetro
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();

            // Solicita ao usuário o segundo parâmetro
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem quando o segundo parâmetro for menor que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } finally {
            // Fecha o Scanner para evitar vazamento de recurso
            terminal.close();
        }
    }

    // Método estático que realiza a contagem e imprime os números
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        // Calcula a quantidade de iterações
        int contagem = parametroDois - parametroUm;

        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
