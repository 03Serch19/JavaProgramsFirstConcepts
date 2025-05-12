package clases;

/**
 *
 * @author Sergio
 */
public class CHijaRetiro extends CPadreAbstroper {

    @Override
    public void Transacciones() {
        try {         
            do {
                 System.out.println("¿Cual es la cantidad deseas retirar?: ");
                  Retiro();
            } while (Retiro<0);           
           
            if (Retiro <= getSaldo()) {
                Transaccion = getSaldo();
                setSaldo(Transaccion - Retiro);
                System.out.println("--------------------------------------");
                System.out.println("Has retirado la cantidad de: " + Retiro);
                System.out.println("Tu saldo actual es de: " + getSaldo());
                System.out.println("--------------------------------------");
            } else {
                System.out.println("------------------------");
                System.out.println("Tu saldo es insuficiente");
                System.out.println("------------------------");
            }
        } catch (Exception e) {
            System.out.println("Error de datos ingresados..." + e);
        }
    }
}
