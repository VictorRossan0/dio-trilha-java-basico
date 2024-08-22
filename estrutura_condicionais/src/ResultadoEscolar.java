// Estrutura de Condicional Composta(if else)

public class ResultadoEscolar {
    // public static void main(String[] args) {
    //     int nota = 8;

    //     if (nota >= 7) {
    //         System.out.println("Aprovado");
    //     } 
    //     else if(nota > 5 && nota < 7){ // Condicional Encadeada(if elseif else)
    //         System.out.println("Prova Recuperação");
    //     }
    //     else {
    //         System.out.println("Reprovado");
    //     }
    // }

    // Condição Ternária
    public static void main(String[] args) {
        int nota = 5;

        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota<7 ? "Recuperação": "Reprovado";

        System.out.println(resultado);
    }
}
