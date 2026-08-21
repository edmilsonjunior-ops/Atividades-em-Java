package atvd13;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                1,
                "Edmilson",
                "edmilson@email.com"
        );

        Produto produto1 = new Produto(1, "Teclado", 120.00);
        Produto produto2 = new Produto(2, "Mouse", 80.00);
        Produto produto3 = new Produto(3, "Headset", 150.00);

        Pedido pedido = new Pedido(1, cliente);

        ItemPedido item1 = new ItemPedido(produto1, 2);
        ItemPedido item2 = new ItemPedido(produto2, 1);
        ItemPedido item3 = new ItemPedido(produto3, 1);

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);
        pedido.adicionarItem(item3);

        pedido.mostrarPedido();

        System.out.println("\nTotal usando Stream: R$ "
                + pedido.calcularTotalComStream());

        pedido.removerItem(item2);

        System.out.println("\nDepois de remover o mouse:");
        System.out.println("Novo total: R$ " + pedido.calcularTotal());
    }
}