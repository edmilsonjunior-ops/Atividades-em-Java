package atvd15;

import java.util.Comparator;
import java.util.List;

public class ContaService {

    private ContaRepository repository;

    public ContaService(ContaRepository repository) {
        this.repository = repository;
    }

    public void criarConta(Conta conta) {
        repository.salvar(conta);
    }

    public Conta buscarConta(int numero) {

        return repository.buscarPorNumero(numero)
                .orElseThrow(() ->
                        new ContaNaoEncontradaException(
                                "Conta nao encontrada."));
    }

    public void depositar(int numero, double valor) {

        Conta conta = buscarConta(numero);
        conta.depositar(valor);
    }

    public void sacar(int numero, double valor) {

        Conta conta = buscarConta(numero);
        conta.sacar(valor);
    }

    public void transferir(int numeroOrigem, int numeroDestino, double valor) {

        Conta contaOrigem = buscarConta(numeroOrigem);
        Conta contaDestino = buscarConta(numeroDestino);

        contaOrigem.transferir(contaDestino, valor);
    }

    public double consultarSaldo(int numero) {

        Conta conta = buscarConta(numero);

        return conta.consultarSaldo();
    }

    public List<Conta> listarContas() {

        return repository.listarTodas();
    }

    public List<Conta> listarContasPorSaldo() {

        return repository.listarTodas()
                .stream()
                .sorted(Comparator.comparingDouble(Conta::getSaldo).reversed())
                .toList();
    }

    public List<Conta> listarContasDoCliente(int clienteId) {

        return repository.listarTodas()
                .stream()
                .filter(conta -> conta.getCliente().getId() == clienteId)
                .toList();
    }
}