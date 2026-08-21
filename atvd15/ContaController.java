package atvd15;

public class ContaController {

    private ContaService service;

    public ContaController(ContaService service) {
        this.service = service;
    }

    public void criarConta(Conta conta) {
        service.criarConta(conta);
    }

    public void depositar(int numero, double valor) {
        service.depositar(numero, valor);
    }

    public void sacar(int numero, double valor) {
        service.sacar(numero, valor);
    }

    public void transferir(int origem, int destino, double valor) {
        service.transferir(origem, destino, valor);
    }

    public void mostrarSaldo(int numero) {

        double saldo = service.consultarSaldo(numero);

        System.out.println(
                "Saldo da conta " + numero + ": R$ " + saldo
        );
    }

    public void listarContas() {

        System.out.println("\nContas cadastradas:");

        service.listarContas()
                .forEach(conta -> System.out.println(conta));
    }

    public void listarContasPorSaldo() {

        System.out.println("\nContas ordenadas por saldo:");

        service.listarContasPorSaldo()
                .forEach(conta -> System.out.println(conta));
    }
}