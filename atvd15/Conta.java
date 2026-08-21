package atvd15;

public class Conta implements OperacoesConta {

    private int numero;
    private Cliente cliente;
    private double saldo;
    private TipoConta tipo;

    public Conta(int numero, Cliente cliente, double saldo, TipoConta tipo) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    @Override
    public void depositar(double valor) {

        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do deposito invalido.");
        }

        saldo += valor;
    }

    @Override
    public void sacar(double valor) {

        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do saque invalido.");
        }

        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }

        saldo -= valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {

        sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta: " + numero
                + " | Cliente: " + cliente.getNome()
                + " | Tipo: " + tipo
                + " | Saldo: R$ " + saldo;
    }
}