package clasess;

public class Proceso extends Thread {

    public Proceso(String namee) {
        super(namee);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 8; i++) {
            System.out.println(i + " " + this.getName());
             try {
                Proceso.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Error....rr en la clase procesoo..");
            }

        }
    }
}
