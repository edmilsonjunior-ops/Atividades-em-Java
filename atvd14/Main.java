package atvd14;

public class Main {

    public static void main(String[] args) {

        Autor autor1 = new Autor("Machado de Assis");
        Autor autor2 = new Autor("Jorge Amado");

        Livro livro1 = new Livro(1, "Dom Casmurro", autor1);
        Livro livro2 = new Livro(2, "Memorias Postumas de Bras Cubas", autor1);
        Livro livro3 = new Livro(3, "Capitaes da Areia", autor2);

        Usuario usuario1 = new Usuario(1, "Edmilson");
        Usuario usuario2 = new Usuario(2, "Carlos");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.listarDisponiveis();

        System.out.println("\nRealizando emprestimos:");

        biblioteca.emprestarLivro(livro1, usuario1);
        biblioteca.emprestarLivro(livro3, usuario2);

        System.out.println("\nTentando emprestar novamente o mesmo livro:");

        biblioteca.emprestarLivro(livro1, usuario2);

        biblioteca.listarEmprestados();

        biblioteca.listarDisponiveis();

        System.out.println("\nDevolvendo Dom Casmurro:");

        biblioteca.devolverLivro(livro1);

        biblioteca.listarDisponiveis();
    }
}