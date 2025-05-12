package clases;

/**
 *
 * @author ADMIN
 */
public class CHijaDeposito extends CPadreAbstroper {

    @Override
    public void Transacciones() {
        try {
            do {
            System.out.println("¿Cual es la cantidad que deseas depositar?: ");
            Deposito();
            } while (Deposito<0);                     
            Transaccion = getSaldo();
            setSaldo(Transaccion + Deposito);
            System.out.println("----------------------------------------------");
            System.out.println("La cantidad que deposistaste es: " + Deposito);
            System.out.println("Tu saldo actual es de: " + getSaldo());
            System.out.println("----------------------------------------------");
        } catch (Exception e) {
            System.out.println("Error de datos ingresados..." + e);
        }
    }
}
