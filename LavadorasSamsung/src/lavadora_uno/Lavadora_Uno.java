
package lavadora_uno;
import java.util.Scanner;
import biblioteca.LLFunciones;
/**
 *
 * @author Sergio
 */
public class Lavadora_Uno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("¿El tipo de ropa es blanca o de color? ");
        System.out.println("Presione 1 si es blanca / presione 2 si es de color");
        int TipoDeRopa = in.nextInt();
        System.out.println("¿Cuantos Kilos de ropa? ");
        int Kilos = in.nextInt();
        LLFunciones mss = new LLFunciones(Kilos, TipoDeRopa);
       mss.setTipodeRopa(2);
       System.out.println("El tipo de ropa es: " + mss.getTipodeRopa());
        mss.CicloFinalizado();
    }
}
