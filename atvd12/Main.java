package atvd12;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        UsuarioRepository repository = new UsuarioRepository();

        Usuario usuario1 = new Usuario(1L, "Edmilson", "edmilson@email.com");
        Usuario usuario2 = new Usuario(2L, "Carlos", "carlos@email.com");
        Usuario usuario3 = new Usuario(3L, "Maria", "maria@email.com");

        repository.adicionar(usuario1);
        repository.adicionar(usuario2);
        repository.adicionar(usuario3);

        Optional<Usuario> usuario = repository.buscarPorId(2L);

        usuario.ifPresentOrElse(
                dados -> System.out.println("Usuario encontrado: " + dados),
                () -> System.out.println("Usuario nao encontrado.")
        );

        Optional<Usuario> usuarioNaoEncontrado = repository.buscarPorId(10L);

        usuarioNaoEncontrado.ifPresentOrElse(
                dados -> System.out.println("Usuario encontrado: " + dados),
                () -> System.out.println("Usuario nao encontrado.")
        );
    }
}