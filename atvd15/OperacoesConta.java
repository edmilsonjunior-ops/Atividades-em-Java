package atvd15;

public interface OperacoesConta {

    void depositar(double valor);

    void sacar(double valor);

    void transferir(Conta contaDestino, double valor);

    double consultarSaldo();
}