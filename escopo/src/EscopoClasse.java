// 2. Escopo de Classe (Escopo de Instância)
// O escopo de classe refere-se às variáveis que são declaradas dentro da classe, mas fora de qualquer método. 
// Essas variáveis são chamadas de variáveis de instância e são acessíveis por todos os métodos da classe.

public class EscopoClasse {
    private String nome; // Variável com escopo de classe (instância)

    public void definirNome(String nome) {
        this.nome = nome; // 'this.nome' refere-se à variável de instância
    }

    public void mostrarNome() {
        System.out.println("O nome é: " + this.nome); // Acessando a variável de instância
    }

    public static void main(String[] args) {
        EscopoClasse exemplo = new EscopoClasse();
        exemplo.definirNome("Maria");
        exemplo.mostrarNome();
    }
}
