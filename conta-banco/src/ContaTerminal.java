import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner
        // A classe Scanner é usada para capturar a entrada do usuário através do terminal.
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário
        // Pedimos ao usuário que insira os detalhes necessários para criar a conta.
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();  // Captura a entrada do usuário para o número da agência.

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();  // Captura a entrada do usuário para o número da conta.

        scanner.nextLine();  // Limpa o buffer do scanner.

        System.out.println("Por favor, digite o nome do Titular:");
        String nomeCliente = scanner.nextLine();  // Captura a entrada do usuário para o nome do titular da conta.

        System.out.println("Por favor, digite o Saldo Inicial:");
        double saldo = scanner.nextDouble();  // Captura a entrada do usuário para o saldo inicial da conta.

        // Exibir a mensagem da conta criada
        // Após obter todas as informações, exibimos uma mensagem confirmando a criação da conta.
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
