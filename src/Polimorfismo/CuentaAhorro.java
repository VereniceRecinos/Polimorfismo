package Polimorfismo;

/*
 * Clase hija
 * CuentaAhorro hereda de Cuenta.
 * Sobrescribe depositar() agregando interés.
 */
public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double monto) {
        double interes = monto * 0.05;
        saldo += monto + interes;
        System.out.println("Saldo con interés: " + saldo);
    }
}