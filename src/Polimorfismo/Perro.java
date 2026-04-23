package Polimorfismo;

/*
 * Clase hija
 * Perro hereda de Animal usando extends.
 * Se sobreescribe el método hacerSonido();
 */

public class Perro extends Animal {
	
	@Override
	public void hacerSonido() {
		System.out.println("El perro ladra: Guau guau");
	}

}
