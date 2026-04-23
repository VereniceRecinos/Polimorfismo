package Polimorfismo;

/*
 * Clase hija
 * ProductoDigital hereda de Producto.
 * Se sobrescribe el método mostrarDescripcion().
 */
public class ProductoDigital extends Producto {

    String informacion;

    public ProductoDigital(String nombre, double precio, String informacion) {
        super(nombre, precio);
        this.informacion = informacion;
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("Producto digital: " + nombre +
                " Precio: " + precio +
                " Información: " + informacion);
    }
}