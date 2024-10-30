
public abstract class Conta {
    private static int SEQUENCIAL = 1;

    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    public abstract void transferir(double valor, Conta contaDestino);

    @Override
    public String toString() {
        return "Conta [numeroConta=" + numeroConta + ", saldo=" + saldo + ", cliente=" + cliente.getNome() + "]";
    }
}
