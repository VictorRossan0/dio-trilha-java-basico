/**
 * A classe {@code EscopoMetodo} demonstra o uso do escopo de método (escopo local).
 * O escopo de método refere-se às variáveis que são declaradas dentro de um método.
 * Essas variáveis só são acessíveis dentro do método onde foram declaradas.
 */
public class EscopoMetodo {

    /**
     * Imprime uma mensagem no console.
     */
    public void imprimirMensagem() {
        String mensagem = "Olá, Mundo!"; // Variável com escopo local
        System.out.println(mensagem);
    }

    /**
     * Calcula e imprime a soma de duas variáveis locais.
     */
    public void calcularSoma() {
        int a = 5; // Variável com escopo local
        int b = 10; // Variável com escopo local
        int soma = a + b; // Variável com escopo local
        System.out.println("A soma é: " + soma);
    }

    /**
     * O método principal que executa o exemplo de escopo de método.
     * 
     * @param args Argumentos de linha de comando (não utilizados neste exemplo).
     */
    public static void main(String[] args) {
        EscopoMetodo exemplo = new EscopoMetodo();
        exemplo.imprimirMensagem();
        exemplo.calcularSoma();
    }
}
