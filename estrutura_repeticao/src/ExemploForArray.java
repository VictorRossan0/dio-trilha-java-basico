// Estrutura de repetição(for array)

public class ExemploForArray {
    public static void main(String[] args) {

        // Em Arrays o indice inicia em ZERO
        String alunos[] = { "Victor", "João", "Marcos", "William", "Juliana", "Roberta", "Ana", "Mari" };

        // for(int x=0; x < alunos.length; x++){ //length significa tamanho
        // System.out.println(" O aluno no indice x= " + x + " é " + alunos[x]);
        // }

        // for each
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
