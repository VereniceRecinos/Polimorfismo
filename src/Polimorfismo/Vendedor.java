package Polimorfismo;

/*
 * Clase hija
 * Vendedor hereda de Empleado.
 * Agrega comisión y sobrescribe resumen().
 */
public class Vendedor extends Empleado {

    double comision;

    public Vendedor(String nombre, double comision) {
        super(nombre);
        this.comision = comision;
    }

    @Override
    public void resumen() {
        System.out.println("Vendedor: " + nombre + " | Comisión: " + comision);
    }
}
