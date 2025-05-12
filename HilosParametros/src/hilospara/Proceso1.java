package hilospara;

public class Proceso1 extends Thread {
    int num_int;
    public Proceso1(String nombrehilo){
        super(nombrehilo);
    }

    @Override
    public void run() {
        for (int i = 0; i <= num_int; i++) {
            System.out.println(i + " " + this.getName());
        }
        System.out.println("");
    }
    public void Valordelacondicion(int valor){
        this.num_int = valor;
    }
}
