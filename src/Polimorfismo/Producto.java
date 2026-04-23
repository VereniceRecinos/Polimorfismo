package Polimorfismo;

/*
 * Clase padre
 * Contiene nombre y precio.
 */
public class Producto {

    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarDescripcion() {
        System.out.println("Producto: " + nombre + " Precio: " + precio);
    }
}