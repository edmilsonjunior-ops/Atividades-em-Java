package atvd5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FormaGeometrica> formas = new ArrayList<FormaGeometrica>();
        formas.add(new Circulo(5));
        formas.add(new Triangulo(3, 4, 5, 2));
        formas.add(new Retangulo(5, 6));

        for (FormaGeometrica forma : formas) {
            System.out.println(forma.calcularArea());
            System.out.println(forma.calcularPerimetro());

        }
    }
}
