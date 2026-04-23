package Polimorfismo;

/*
 * Clase hija
 * TrabajadorPorHora hereda de Trabajador.
 * Se sobrescribe el método calcularPago().
 */
public class TrabajadorPorHora extends Trabajador {

    int horas;
    double pagoHora;

    public TrabajadorPorHora(int horas, double pagoHora) {
        this.horas = horas;
        this.pagoHora = pagoHora;
    }

    @Override
    public void calcularPago() {
        double total = horas * pagoHora;
        System.out.println("Pago total: " + total);
    }
}
