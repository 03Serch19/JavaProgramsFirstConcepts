
package principal;

import operaciones.CHijaResta;
import operaciones.CHijaSuma;

/**
 *
 * @author Sergio
 */
public class SumaRestaMain {
    public static void main(String[] args) {
        CHijaSuma ms = new CHijaSuma();
        ms.PedirDatos();      //mandar a llamar el metodo para pedir datos
        ms.Suma();            //mandar a llamr metodo para realizar la ooperacion
        System.out.print("El resultado de la suma es: ");
        ms.MostrarResultado();            //mandar a llamar el metodo que aloja el resultado
        
        CHijaResta mr = new CHijaResta();
        mr.PedirDatos();        //mandar a llamar el metodo para pedir datos
        mr.Resta();             //mandar a llamr metodo para realizar la ooperacion
        System.out.print("El resultado de la resta es: "); 
        mr.MostrarResultado();        //mandar a llamar el metodo que aloja el resultado
      
    }
}
