package Polimorfismo;

/*
 * Clase padre
 * Método presentarse().
 */
public class Persona {

    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre);
    }
}
