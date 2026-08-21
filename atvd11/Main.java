package atvd11;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(1, "Edmilson");

        pedido.mostrarPedido();

        System.out.println("\nAlterando status:");

        pedido.alterarStatus(StatusPedido.PAGAMENTO_PENDENTE);
        pedido.alterarStatus(StatusPedido.PAGO);
        pedido.alterarStatus(StatusPedido.EM_PREPARACAO);
        pedido.alterarStatus(StatusPedido.ENVIADO);
        pedido.alterarStatus(StatusPedido.ENTREGUE);

        System.out.println("\nTentando uma transicao invalida:");

        pedido.alterarStatus(StatusPedido.PAGO);
    }
}