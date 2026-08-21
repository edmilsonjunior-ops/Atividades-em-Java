package atvd1;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Josuke", "0721", 16, 7, 8);

        aluno1.exibirDados();

        System.out.println();
        Aluno aluno2 = new Aluno("Goku", "0842", 17, 5, 10);
        aluno2.exibirDados();

        System.out.println();
        Aluno aluno3 = new Aluno("Ichigo", "0417", 15, 7.8, 3.1);
        aluno3.exibirDados();
        System.out.println();

        Aluno aluno4 = new Aluno("naruto", "1020", 18, 8, 4);
        aluno4.exibirDados();
        System.out.println();

        Aluno aluno5 = new Aluno("Seya", "0029", 14, 8, 7.7);
        aluno5.exibirDados();
        System.out.println();

        Aluno aluno6 = new Aluno("Yugi", "1709", 12, 3.7, 8.4);
        aluno6.exibirDados();
        System.out.println();

        Aluno aluno7 = new Aluno("Dorama", "000", 70, 3.0, 2.4);
        aluno7.exibirDados();
    }
}
