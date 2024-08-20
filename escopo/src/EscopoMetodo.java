//1. Escopo de Método (Escopo Local)
// O escopo de método refere-se às variáveis que são declaradas dentro de um método. 
// Essas variáveis só são acessíveis dentro do método onde foram declaradas.

public class EscopoMetodo {

    public void imprimirMensagem() {
        String mensagem = "Olá, Mundo!"; // Variável com escopo local
        System.out.println(mensagem);
    }

    public void calcularSoma() {
        int a = 5; // Variável com escopo local
        int b = 10; // Variável com escopo local
        int soma = a + b; // Variável com escopo local
        System.out.println("A soma é: " + soma);
    }

    public static void main(String[] args) {
        EscopoMetodo exemplo = new EscopoMetodo();
        exemplo.imprimirMensagem();
        exemplo.calcularSoma();
    }
}
