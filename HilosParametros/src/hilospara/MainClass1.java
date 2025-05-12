
package hilospara;


public class MainClass1 {
    public static void main(String[] args) {
        Proceso1 hilo1 = new Proceso1(" Hilo 1");
        Proceso1 hilo2 = new Proceso1(" Hilo 2");
        hilo1.Valordelacondicion(5);
        hilo2.Valordelacondicion(8);
        
        hilo1.start();
        hilo2.start();
    }
}
