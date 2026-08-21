package atvd5;

public class Circulo implements FormaGeometrica {
    private double raio;
    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.pow(raio, 2) * Math.PI;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * (raio);

    }
}
