
package numeros;
import java.util.Random;

public class ClassTwo {
    public static void main(String[] args) {
        int Aleatorio = 0;
        Random r = new Random();
        Aleatorio = (int) (r.nextDouble() * 10);
        System.out.println(Aleatorio);
    }
}
