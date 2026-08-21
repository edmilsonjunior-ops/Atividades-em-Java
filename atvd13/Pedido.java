package atvd13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int id;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private LocalDate data;
    private StatusPedido status;

    public Pedido(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.data = LocalDate.now();
        this.status = StatusPedido.PENDENTE;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }

    public double calcularTotalComStream() {
        return itens.stream()
                .mapToDouble(item -> item.calcularSubtotal())
                .sum();
    }

    public void mostrarPedido() {
        System.out.println("Pedido: " + id);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Data: " + data);
        System.out.println("Status: " + status);

        System.out.println("\nItens:");

        for (ItemPedido item : itens) {
            System.out.println(item);
        }

        System.out.println("\nTotal: R$ " + calcularTotal());
    }
}