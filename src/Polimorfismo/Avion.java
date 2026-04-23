package Polimorfismo;

/*
 * Clase hija
 * Avion hereda de Transporte.
 * Se sobrescribe el método moverse().
 */
public class Avion extends Transporte {

    @Override
    public void moverse() {
        System.out.println("El avión vuela por el cielo.");
    }
}