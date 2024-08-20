/**
 * A classe {@code EscopoClasse} demonstra o uso do escopo de instância (escopo de classe).
 * O escopo de classe refere-se às variáveis que são declaradas dentro da classe, mas fora de qualquer método.
 * Essas variáveis são chamadas de variáveis de instância e são acessíveis por todos os métodos da classe.
 */
public class EscopoClasse {

    /** 
     * Variável de instância que armazena o nome. 
     */
    private String nome;

    /**
     * Define o nome para a variável de instância.
     * 
     * @param nome O nome a ser atribuído à variável de instância.
     */
    public void definirNome(String nome) {
        this.nome = nome; // 'this.nome' refere-se à variável de instância
    }

    /**
     * Mostra o nome armazenado na variável de instância.
     */
    public void mostrarNome() {
        System.out.println("O nome é: " + this.nome); // Acessando a variável de instância
    }

    /**
     * O método principal que executa o exemplo de escopo de classe.
     * 
     * @param args Argumentos de linha de comando (não utilizados neste exemplo).
     */
    public static void main(String[] args) {
        EscopoClasse exemplo = new EscopoClasse();
        exemplo.definirNome("Maria");
        exemplo.mostrarNome();
    }
}
