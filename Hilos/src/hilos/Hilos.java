
package hilos;



public class Hilos {
    public static void main(String[] args) {
        Proceso1 hilo1 = new Proceso1();
        Proceso1 hilo3 = new Proceso1();
         // Proceso3 hilo11 = new Proceso3();
       // Proceso3 hilo33 = new Proceso3();
        Thread hilo2 = new Thread(new Proceso2());
        Thread hilo4 = new Thread(new Proceso2());
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        //hilo11.start();
        //hilo33.start();
    }
    
}
