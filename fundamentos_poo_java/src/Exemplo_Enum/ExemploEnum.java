package Exemplo_Enum;

public class ExemploEnum {
    public static void main(String[] args) {
        // Criando uma variável do tipo DiaDaSemana
        DiaDaSemana hoje = DiaDaSemana.QUARTA;

        // Usando o enum em um switch case
        switch (hoje) {
            case SEGUNDA:
                System.out.println("Hoje é segunda-feira.");
                break;
            case TERCA:
                System.out.println("Hoje é terça-feira.");
                break;
            case QUARTA:
                System.out.println("Hoje é quarta-feira.");
                break;
            case QUINTA:
                System.out.println("Hoje é quinta-feira.");
                break;
            case SEXTA:
                System.out.println("Hoje é sexta-feira.");
                break;
            case SABADO:
                System.out.println("Hoje é sábado.");
                break;
            case DOMINGO:
                System.out.println("Hoje é domingo.");
                break;
            default:
                System.out.println("Dia da semana inválido.");
                break;
        }

        // Também é possível percorrer todos os valores do enum
        System.out.println("\nTodos os dias da semana:");
        for (DiaDaSemana dia : DiaDaSemana.values()) {
            System.out.println(dia);
        }
    }
}
