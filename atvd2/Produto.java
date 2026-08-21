package atvd2;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(int id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

        if (preco < 0) {
            throw new IllegalArgumentException("Preço Invalida");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade Invalida");
        }
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade Invalida");
        }
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade Invalida");

        }
        if (quantidade > this.quantidade) {
            throw new IllegalArgumentException("Quantidade Invalida");
        }
        this.quantidade -= quantidade;
    }

    public double calcularValorEstoque() {
        return this.preco * this.quantidade;

    }
}
