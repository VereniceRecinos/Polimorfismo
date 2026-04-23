package Polimorfismo;

/*
 * Clase hija
 * Guitarra hereda de Instrumento.
 * Se sobrescribe el método tocar().
 */
public class Guitarra extends Instrumento {

    @Override
    public void tocar() {
        System.out.println("La guitarra toca melodías.");
    }
}
