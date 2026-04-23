package Polimorfismo;

/*
 * Clase principal
 * Aquí se prueba el polimorfismo en todos los ejercicios.
 * 
 * Casos de prueba utilizados:
 * 1. Se creó un objeto de la clase hija
 * 2. Se guardó en una referencia del padre
 * 3. Se llamó al método para demostrar polimorfismo
 */

public class Main {

	public static void main(String[] args) {
		
		
		Animal animal = new Perro();
        animal.hacerSonido();
        

        Figura figura = new Rectangulo(5, 4);
        figura.area();
        

        Empleado empleado = new Vendedor("Carlos", 250);
        empleado.resumen();
        

        Cuenta cuenta = new CuentaAhorro(1000);
        cuenta.depositar(500);
        

        Transporte transporte = new Avion();
        transporte.moverse();
        

        Persona persona = new Estudiante("Ana", "2024", "Ingeniería");
        persona.presentarse();
        
       
        Vehiculo vehiculo = new Motocicleta();
        vehiculo.encender();
        

        Producto producto = new ProductoDigital("Curso Java", 150, "Descarga inmediata");
        producto.mostrarDescripcion();
        
        
        Instrumento instrumento = new Guitarra();
        instrumento.tocar();
        

        Trabajador trabajador = new TrabajadorPorHora(8, 50);
        trabajador.calcularPago();

	}

}
