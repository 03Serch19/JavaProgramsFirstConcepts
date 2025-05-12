package hilos;

public class Proceso2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Proceso2");
        for (int i = 0; i < 6; i++) {
            System.out.println("Proceso2");
        }
    }

}
