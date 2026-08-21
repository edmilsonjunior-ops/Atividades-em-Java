package atvd12;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsuarioRepository {

    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionar(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Optional<Usuario> buscarPorId(Long id) {

        for (Usuario usuario : usuarios) {

            if (usuario.getId().equals(id)) {
                return Optional.of(usuario);
            }
        }

        return Optional.empty();
    }
}