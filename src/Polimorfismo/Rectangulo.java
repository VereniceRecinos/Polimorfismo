package Polimorfismo;

/*
 * Clase hija
 * Rectangulo hereda de Figura.
 * Sobrescribe el método area().
 */
public class Rectangulo extends Figura {

    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void area() {
        double resultado = base * altura;
        System.out.println("Área del rectángulo: " + resultado);
    }
}
