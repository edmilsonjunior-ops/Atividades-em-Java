package atvd10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Carlos", "Desenvolvedor", 6500.00, 28));
        funcionarios.add(new Funcionario("Maria", "Gerente", 8500.00, 35));
        funcionarios.add(new Funcionario("Joao", "Desenvolvedor", 5200.00, 25));
        funcionarios.add(new Funcionario("Ana", "Analista", 4500.00, 29));
        funcionarios.add(new Funcionario("Pedro", "Desenvolvedor", 7000.00, 32));
        funcionarios.add(new Funcionario("Julia", "Analista", 4800.00, 27));
        funcionarios.add(new Funcionario("Lucas", "Gerente", 9000.00, 40));
        funcionarios.add(new Funcionario("Marcos", "Suporte", 3500.00, 24));
        funcionarios.add(new Funcionario("Fernanda", "Desenvolvedor", 6000.00, 26));
        funcionarios.add(new Funcionario("Rafael", "Suporte", 3800.00, 31));

        // Salários acima de R$ 5.000
        System.out.println("Funcionarios com salario acima de R$ 5.000:");
        funcionarios.stream()
                .filter(funcionario -> funcionario.getSalario() > 5000)
                .forEach(funcionario -> System.out.println(funcionario));

        // Funcionários com menos de 30 anos
        System.out.println("\nFuncionarios com menos de 30 anos:");
        funcionarios.stream()
                .filter(funcionario -> funcionario.getIdade() < 30)
                .forEach(funcionario -> System.out.println(funcionario));

        // Média salarial
        double mediaSalarial = funcionarios.stream()
                .mapToDouble(funcionario -> funcionario.getSalario())
                .average()
                .getAsDouble();

        System.out.println("\nMedia salarial: R$ " + mediaSalarial);

        // Maior salário
        Funcionario maiorSalario = funcionarios.stream()
                .max((funcionario1, funcionario2) ->
                        Double.compare(
                                funcionario1.getSalario(),
                                funcionario2.getSalario()))
                .get();

        System.out.println("\nFuncionario com maior salario:");
        System.out.println(maiorSalario);

        // Nomes dos desenvolvedores
        System.out.println("\nNomes dos desenvolvedores:");
        funcionarios.stream()
                .filter(funcionario -> funcionario.getCargo().equals("Desenvolvedor"))
                .map(funcionario -> funcionario.getNome())
                .forEach(nome -> System.out.println(nome));

        // Agrupamento por cargo
        Map<String, List<Funcionario>> funcionariosPorCargo = funcionarios.stream()
                .collect(Collectors.groupingBy(funcionario -> funcionario.getCargo()));

        System.out.println("\nFuncionarios agrupados por cargo:");

        funcionariosPorCargo.forEach((cargo, lista) -> {
            System.out.println("\n" + cargo + ":");

            lista.forEach(funcionario -> System.out.println(funcionario.getNome()));
        });
    }
}