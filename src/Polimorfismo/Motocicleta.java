package Polimorfismo;

/*
 * Clase hija
 * Motocicleta hereda de Vehiculo.
 * Se sobrescribe el método encender().
 */
public class Motocicleta extends Vehiculo {

    @Override
    public void encender() {
        System.out.println("La motocicleta enciende con botón.");
    }
}