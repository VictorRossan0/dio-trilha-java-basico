public class Retangulo {

    // Atributos (propriedades) da classe
    private double largura;
    private double altura;

    // Construtor para inicializar os atributos
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Método para calcular a área do retângulo
    public double calcularArea() {
        return largura * altura;
    }

    // Método para calcular o perímetro do retângulo
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    // Método para verificar se é um quadrado
    public boolean isQuadrado() {
        return largura == altura;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto da classe Retangulo
        Retangulo ret1 = new Retangulo(5, 10);
        Retangulo ret2 = new Retangulo(7, 7);

        // Testando o primeiro retângulo
        System.out.println("Retângulo 1:");
        System.out.println("Área: " + ret1.calcularArea());
        System.out.println("Perímetro: " + ret1.calcularPerimetro());
        System.out.println("É um quadrado? " + ret1.isQuadrado());

        // Testando o segundo retângulo
        System.out.println("\nRetângulo 2:");
        System.out.println("Área: " + ret2.calcularArea());
        System.out.println("Perímetro: " + ret2.calcularPerimetro());
        System.out.println("É um quadrado? " + ret2.isQuadrado());
    }
}
