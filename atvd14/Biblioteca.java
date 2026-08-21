package atvd14;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        livros = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void emprestarLivro(Livro livro, Usuario usuario) {

        if (verificarDisponibilidade(livro)) {

            Emprestimo emprestimo = new Emprestimo(livro, usuario);
            emprestimos.add(emprestimo);

            System.out.println("Livro emprestado com sucesso.");

        } else {
            System.out.println("Esse livro ja esta emprestado.");
        }
    }

    public void devolverLivro(Livro livro) {

        for (Emprestimo emprestimo : emprestimos) {

            if (emprestimo.getLivro() == livro
                    && emprestimo.estaEmprestado()) {

                emprestimo.devolver();

                System.out.println("Livro devolvido com sucesso.");
                return;
            }
        }

        System.out.println("Esse livro nao esta emprestado.");
    }

    public boolean verificarDisponibilidade(Livro livro) {

        for (Emprestimo emprestimo : emprestimos) {

            if (emprestimo.getLivro() == livro
                    && emprestimo.estaEmprestado()) {

                return false;
            }
        }

        return true;
    }

    public void listarEmprestados() {

        System.out.println("\nLivros emprestados:");

        for (Emprestimo emprestimo : emprestimos) {

            if (emprestimo.estaEmprestado()) {
                System.out.println(emprestimo);
            }
        }
    }

    public void listarDisponiveis() {

        System.out.println("\nLivros disponiveis:");

        for (Livro livro : livros) {

            if (verificarDisponibilidade(livro)) {
                System.out.println(livro);
            }
        }
    }
}