package atvd4;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Estagiario estagiario1 = new Estagiario("Carlos", "04432", 1200.00);

        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Adão", "13409", 1200.00);

        Gerente gerente1 = new Gerente("Bulma", "01489", 1200.00);

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(estagiario1);
        funcionarios.add(desenvolvedor1);
        funcionarios.add(gerente1);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.calcularSalario());
        }

    }
}
