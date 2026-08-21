package atvd6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ==========================================
        // PARTE 1 - LIST
        // ==========================================

        List<String> nomes = new ArrayList<>();

        nomes.add("Gojo");
        nomes.add("Tsunade");
        nomes.add("Zeca");
        nomes.add("Tiringa");
        nomes.add("Alfa");

        Main main = new Main();

        // Adicionar
        System.out.print("Digite um nome para adicionar: ");
        String nome = scanner.nextLine();

        main.adicionar(nomes, nome);

        // Listar
        System.out.println("\nLista de nomes:");
        main.listar(nomes);

        // Pesquisar
        System.out.print("\nDigite um nome para pesquisar: ");
        String nomePesquisa = scanner.nextLine();

        main.pesquisar(nomes, nomePesquisa);

        // Remover
        System.out.print("\nDigite um nome para remover: ");
        String nomeRemover = scanner.nextLine();

        main.remover(nomes, nomeRemover);

        // Ordenar
        main.ordenar(nomes);

        // Listar novamente
        System.out.println("\nLista após as operações:");
        main.listar(nomes);

        // Verificar existência
        System.out.print("\nDigite um nome para verificar se existe: ");
        String nomeVerificar = scanner.nextLine();

        boolean existe = main.verificarExistencia(nomes, nomeVerificar);

        System.out.println("Existe na lista? " + existe);


        // ==========================================
        // PARTE 2 - SET
        // ==========================================

        System.out.println("\n===== SET =====");

        Set<String> nomesSet = new HashSet<>();

        nomesSet.add("Gojo");
        nomesSet.add("Tsunade");
        nomesSet.add("Zeca");

        // Tentando adicionar duplicado
        nomesSet.add("Gojo");

        System.out.println("Set: " + nomesSet);

        System.out.println("Quantidade de nomes no Set: " + nomesSet.size());

        scanner.close();
    }


    // ==========================================
    // MÉTODOS DA LIST
    // ==========================================

    public void adicionar(List<String> nomes, String nome) {

        if (nomes.contains(nome)) {
            System.out.println("Nome ja existe na lista.");
        } else {
            nomes.add(nome);
            System.out.println("Nome adicionado com sucesso.");
        }
    }


    public void remover(List<String> nomes, String nome) {

        if (nomes.remove(nome)) {
            System.out.println("Nome removido com sucesso.");
        } else {
            System.out.println("Nome não encontrado.");
        }
    }


    public void pesquisar(List<String> nomes, String nome) {

        if (nomes.contains(nome)) {
            System.out.println("Nome encontrado.");
        } else {
            System.out.println("Nome não encontrado.");
        }
    }


    public void listar(List<String> nomes) {

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }


    public void ordenar(List<String> nomes) {

        Collections.sort(nomes);

        System.out.println("Lista ordenada alfabeticamente");
    }


    public boolean verificarExistencia(List<String> nomes, String nome) {

        return nomes.contains(nome);
    }
}