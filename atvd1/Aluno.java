package atvd1;

public class Aluno {
    private String nome;
    private String matricula;
    private int idade;
    private double nota1;
    private double nota2;

    public Aluno(String nome, String matricula, int idade, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Idade: " + this.idade);
        System.out.println("Nota1: " + this.nota1);
        System.out.println("Nota2: " + this.nota2);
        System.out.println("Media: " + calcularMedia());
        System.out.println("Situaçao: " + verficaSt());
    }


    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public String verficaSt() {

        if (calcularMedia() >= 7) {
            return "Aluno aprovado";

        } else if (calcularMedia() >= 5 && calcularMedia() <= 6.9) {
            return "Aluno em recuperação";
        } else {
            return "Reprovado";
        }
    }
}
