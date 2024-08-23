// Estruturas excepcionais(Try Catch, Finally é opcional)

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            // Criando o objeto scanner e definindo o locale para US, que usa ponto como
            // separador decimal

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            // Solicitando e capturando as informações do usuário
            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura (em metros)");
            double altura = scanner.nextDouble();

            // Imprimindo os dados obtidos pelo usuário
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "m");

            // Fechando o scanner para evitar possíveis vazamentos de recursos
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Campos idade e altura precisam ser numéricos");
        }
    }
}