package atvd11;

public class Pedido {

    private int numero;
    private String cliente;
    private StatusPedido status;

    public Pedido(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.status = StatusPedido.CRIADO;
    }

    public void alterarStatus(StatusPedido novoStatus) {

        boolean podeAlterar = false;

        if (status == StatusPedido.CRIADO &&
                (novoStatus == StatusPedido.PAGAMENTO_PENDENTE ||
                        novoStatus == StatusPedido.CANCELADO)) {

            podeAlterar = true;

        } else if (status == StatusPedido.PAGAMENTO_PENDENTE &&
                (novoStatus == StatusPedido.PAGO ||
                        novoStatus == StatusPedido.CANCELADO)) {

            podeAlterar = true;

        } else if (status == StatusPedido.PAGO &&
                (novoStatus == StatusPedido.EM_PREPARACAO ||
                        novoStatus == StatusPedido.CANCELADO)) {

            podeAlterar = true;

        } else if (status == StatusPedido.EM_PREPARACAO &&
                novoStatus == StatusPedido.ENVIADO) {

            podeAlterar = true;

        } else if (status == StatusPedido.ENVIADO &&
                novoStatus == StatusPedido.ENTREGUE) {

            podeAlterar = true;
        }

        if (podeAlterar) {
            status = novoStatus;
            System.out.println("Status alterado para: " + status);
        } else {
            System.out.println("Transicao invalida: "
                    + status + " -> " + novoStatus);
        }
    }

    public void mostrarPedido() {
        System.out.println("Pedido: " + numero);
        System.out.println("Cliente: " + cliente);
        System.out.println("Status: " + status);
    }
}