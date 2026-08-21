package atvd3;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(1, "Jose", 3000.00);

        ContaBancaria conta2 = new ContaBancaria(2, "Carla", 5000.00);

        conta1.depositar(500);

        System.out.println(conta1.consultarSaldo());

        try {
            conta1.transferir(conta2, 500);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(conta1.consultarSaldo());
        System.out.println(conta2.consultarSaldo());
    }
}
