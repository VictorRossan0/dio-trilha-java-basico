public class Calculadora {

    // Método para somar dois números
    public int somar(int a, int b) {
        return a + b;
    }

    // Método para subtrair dois números
    public int subtrair(int a, int b) {
        return a - b;
    }

    // Método para multiplicar dois números
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para dividir dois números
    public double dividir(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
    }

    public static void main(String[] args) {
        // Criando um objeto da classe Calculadora
        Calculadora calc = new Calculadora();

        // Chamando os métodos e mostrando os resultados
        int soma = calc.somar(10, 5);
        int subtracao = calc.subtrair(10, 5);
        int multiplicacao = calc.multiplicar(10, 5);
        double divisao = calc.dividir(10, 5);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
