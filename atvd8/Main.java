package atvd8;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Contato> contatos = new HashMap<>();

        Contato contato1 = new Contato("Edmilson", "99999-1111", "edmilson@email.com");
        Contato contato2 = new Contato("Carlos", "98888-2222", "carlos@email.com");
        Contato contato3 = new Contato("Maria", "97777-3333", "maria@email.com");

        // Adicionar contatos
        contatos.put(contato1.getNome(), contato1);
        contatos.put(contato2.getNome(), contato2);
        contatos.put(contato3.getNome(), contato3);

        // Buscar pelo nome
        System.out.println("Contato encontrado:");
        System.out.println(contatos.get("Carlos"));

        // Verificar se existe
        if (contatos.containsKey("Maria")) {
            System.out.println("\nMaria está na agenda.");
        }

        // Listar todos os contatos
        System.out.println("\nTodos os contatos:");
        for (Contato contato : contatos.values()) {
            System.out.println(contato);
        }

        // aqui e para buscar pelo telefone
        String telefoneBusca = "99999-1111";

        for (Contato contato : contatos.values()) {
            if (contato.getTelefone().equals(telefoneBusca)) {
                System.out.println("\nContato encontrado pelo telefone:");
                System.out.println(contato);
            }
        }

        // Para remover contato
        contatos.remove("Carlos");

        System.out.println("\nAgenda depois de remover Carlos:");
        for (Contato contato : contatos.values()) {
            System.out.println(contato);
        }
    }
}