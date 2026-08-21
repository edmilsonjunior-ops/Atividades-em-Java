package atvd14;

public class Livro {

    private int id;
    private String titulo;
    private Autor autor;

    public Livro(int id, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor.getNome();
    }
}