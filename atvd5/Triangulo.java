package atvd5;

public class Triangulo implements FormaGeometrica {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double altura;

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    public Triangulo(double ladoA, double ladoB, double ladoC,  double altura) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ladoA * altura / 2;
    }

}




