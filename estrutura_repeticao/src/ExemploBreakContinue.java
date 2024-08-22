// Estrutura de repetição(break e continue)

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                // break; // Nesse caso, ele para no número 3 e para a operação
                continue; // Nesse caso, ele pula o número 3 continua a operação
            System.out.println(numero);
        }
    }
}
