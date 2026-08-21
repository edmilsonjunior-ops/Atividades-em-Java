package atvd3;

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException();
        }
        this.saldo -= valor;
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public void transferir(ContaBancaria contaDestino, double valor) throws SaldoInsuficienteException {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}

