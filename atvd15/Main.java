package atvd15;

public class Main {

    public static void main(String[] args) {

        ContaRepository repository = new ContaRepository();

        ContaService service = new ContaService(repository);

        ContaController controller = new ContaController(service);

        Cliente cliente1 = new Cliente(
                1,
                "Edmilson",
                "11111111111"
        );

        Cliente cliente2 = new Cliente(
                2,
                "Carlos",
                "22222222222"
        );

        Conta conta1 = new Conta(
                1001,
                cliente1,
                1000.00,
                TipoConta.CONTA_CORRENTE
        );

        Conta conta2 = new Conta(
                1002,
                cliente2,
                500.00,
                TipoConta.CONTA_POUPANCA
        );

        controller.criarConta(conta1);
        controller.criarConta(conta2);

        controller.listarContas();

        System.out.println("\nRealizando deposito:");

        controller.depositar(1001, 500.00);

        controller.mostrarSaldo(1001);

        System.out.println("\nRealizando saque:");

        controller.sacar(1001, 200.00);

        controller.mostrarSaldo(1001);

        System.out.println("\nRealizando transferencia:");

        controller.transferir(1001, 1002, 300.00);

        controller.mostrarSaldo(1001);
        controller.mostrarSaldo(1002);

        controller.listarContasPorSaldo();

        System.out.println("\nContas do cliente Edmilson:");

        service.listarContasDoCliente(cliente1.getId())
                .forEach(conta -> System.out.println(conta));

        System.out.println("\nTentando acessar uma conta inexistente:");

        try {
            controller.mostrarSaldo(9999);
        } catch (ContaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTentando sacar acima do saldo:");

        try {
            controller.sacar(1002, 5000.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Agora eu to testado, quero ver não aprender.