package atvd10;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;
    private int idade;

    public Funcionario(String nome, String cargo, double salario, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + " - " + cargo + " - R$ " + salario + " - " + idade + " anos";
    }
}