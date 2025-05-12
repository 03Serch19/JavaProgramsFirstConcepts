
package sincronizacion;


public class Hilo3 extends Thread{
     @Override
    public void run(){
        for (int i = 0; i <=8; i++) {
            System.out.print("O");
            try {
                Hilo3.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error... en la clase Hilo3..");
            }
        }
    }
}
