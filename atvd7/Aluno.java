package atvd7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Aluno {

    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return nome + " - Nota: " + nota;
    }

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Kurenai", 8.3);
        Aluno aluno2 = new Aluno("Kira", 10);
        Aluno aluno3 = new Aluno("Carlos", 7.5);
        Aluno aluno4 = new Aluno("Maria", 9.2);

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);

        Comparator<Aluno> comparador = (a1, a2) ->
                Double.compare(a2.getNota(), a1.getNota());

        alunos.sort(comparador);

        System.out.println("Ranking dos alunos:");

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}