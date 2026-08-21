package atvd15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ContaRepository {

    private Map<Integer, Conta> contas = new HashMap<>();

    public void salvar(Conta conta) {
        contas.put(conta.getNumero(), conta);
    }

    public Optional<Conta> buscarPorNumero(int numero) {
        return Optional.ofNullable(contas.get(numero));
    }

    public List<Conta> listarTodas() {
        return new ArrayList<>(contas.values());
    }

    public void remover(int numero) {
        contas.remove(numero);
    }
}