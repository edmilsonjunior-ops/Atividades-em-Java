package atvd2;

public class Main {
    public static void main(String[] args) {
        Produto Produto1 = new Produto(1, "Trigo", 3.20, 2);
        System.out.println(Produto1.calcularValorEstoque());

        Produto1.adicionarEstoque(6);

        Produto1.removerEstoque(2);
    }
}
