package App;

import Entities.Triangulo;

public class App {
    public static void main(String[] args) {

        Triangulo tri = new Triangulo(3.0, 4.0, 5.0);
        System.out.println("O valor de P: " + tri.CalcularP());
        System.out.println("O valor da área: " + tri.calcularArea());

        Triangulo tri2 = new Triangulo(7.5, 4.5, 4.02);
        System.out.println(tri2.CalcularP());
        System.out.println(tri2.calcularArea());

    }
}
