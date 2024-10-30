
public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(Cliente cliente, double taxaJuros) {
        super(cliente);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (saldo >= valor) {
            sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }
    }

    public void renderJuros() {
        saldo += saldo * taxaJuros;
    }

    @Override
    public String toString() {
        return "ContaPoupanca [numeroConta=" + numeroConta + ", saldo=" + saldo + ", cliente=" + cliente.getNome() + 
               ", taxaJuros=" + taxaJuros + "]";
    }
}
