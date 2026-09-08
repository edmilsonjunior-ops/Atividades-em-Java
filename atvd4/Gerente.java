package atvd4;

public class Gerente extends Funcionario {
    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double calcularSalario() {
        double salario = super.calcularSalario();
        return salario + (salario * 0.2) ;

    }
}
