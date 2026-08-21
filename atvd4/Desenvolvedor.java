package atvd4;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + super.calcularSalario() * 0.10;
    }
}
