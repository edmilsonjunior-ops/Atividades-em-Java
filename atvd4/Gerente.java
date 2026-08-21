package atvd4;

public class Gerente extends Funcionario {
    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + super.calcularSalario() * 0.20;
    }
}
