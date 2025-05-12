package clases;

/**
 *
 * @author Sergio
 */
public class CHijaConsulta extends CPadreAbstroper {

    @Override
    public void Transacciones() {
        System.out.println("----------------------------");
        System.out.println("Tu saldo es de: " + getSaldo());
        System.out.println("----------------------------");
    }
}
