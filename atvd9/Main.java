package atvd9;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto(1, "Teclado", 120.00, 8));
        produtos.add(new Produto(2, "Mouse", 80.00, 15));
        produtos.add(new Produto(3, "Monitor", 750.00, 5));
        produtos.add(new Produto(4, "Headset", 150.00, 7));
        produtos.add(new Produto(5, "Webcam", 200.00, 12));
        produtos.add(new Produto(6, "Pendrive", 50.00, 20));
        produtos.add(new Produto(7, "Cadeira", 900.00, 4));
        produtos.add(new Produto(8, "Microfone", 180.00, 6));
        produtos.add(new Produto(9, "Cabo HDMI", 35.00, 25));
        produtos.add(new Produto(10, "Notebook", 2500.00, 3));

        System.out.println("Produtos acima de R$ 100:");
        produtos.stream()
                .filter(produto -> produto.getPreco() > 100)
                .forEach(produto -> System.out.println(produto.getNome()));

        System.out.println("\nProdutos com estoque inferior a 10:");
        produtos.stream()
                .filter(produto -> produto.getQuantidade() < 10)
                .forEach(produto -> System.out.println(produto.getNome()));

        double valorTotal = produtos.stream()
                .mapToDouble(produto -> produto.calcularValorEstoque())
                .sum();

        System.out.println("\nValor total do estoque: R$ " + valorTotal);

        Produto maisCaro = produtos.stream()
                .max((produto1, produto2) ->
                        Double.compare(produto1.getPreco(), produto2.getPreco()))
                .get();

        System.out.println("\nProduto mais caro: " + maisCaro.getNome());

        double precoMedio = produtos.stream()
                .mapToDouble(produto -> produto.getPreco())
                .average()
                .getAsDouble();

        System.out.println("Preço médio: R$ " + precoMedio);

        System.out.println("\nNomes dos produtos:");
        produtos.stream()
                .map(produto -> produto.getNome())
                .forEach(nome -> System.out.println(nome));
    }
}