package Polimorfismo;

/*
 * Clase padre
 * Contiene nombre y un método resumen().
 */
public class Empleado {

    String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void resumen() {
        System.out.println("Empleado: " + nombre);
    }
}