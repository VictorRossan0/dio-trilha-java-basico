public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00");

        Conta contaCorrente = new ContaCorrente(cliente1, 500);
        Conta contaPoupanca = new ContaPoupanca(cliente2, 0.02);

        contaCorrente.depositar(1000);
        contaCorrente.transferir(200, contaPoupanca);

        Banco banco = new Banco("Meu Banco Digital");
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        System.out.println("Lista de contas:");
        banco.listarContas();

        ((ContaPoupanca) contaPoupanca).renderJuros();
        System.out.println("Saldo após render juros:");
        System.out.println(contaPoupanca);
    }
}
