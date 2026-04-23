package Polimorfismo;

/*
 * Clase hija
 * Estudiante hereda de Persona.
 * Se sobrescribe el método presentarse().
 */
public class Estudiante extends Persona {

    String carnet;
    String carrera;

    public Estudiante(String nombre, String carnet, String carrera) {
        super(nombre);
        this.carnet = carnet;
        this.carrera = carrera;
    }

    @Override
    public void presentarse() {
        System.out.println("Soy " + nombre + ", carnet " + carnet +
                ", estudio " + carrera);
    }
}
