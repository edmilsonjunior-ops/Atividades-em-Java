package atvd14;

import java.time.LocalDate;

public class Emprestimo {

    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = LocalDate.now();
    }

    public void devolver() {
        dataDevolucao = LocalDate.now();
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public boolean estaEmprestado() {
        return dataDevolucao == null;
    }

    @Override
    public String toString() {
        return livro.getTitulo() + " - Usuario: " + usuario.getNome()
                + " - Emprestado em: " + dataEmprestimo;
    }
}