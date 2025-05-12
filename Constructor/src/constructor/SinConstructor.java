
package constructor;
import java.util.Scanner;
public class SinConstructor {
    private Scanner entrada = new Scanner(System.in);
    String nombre = "";
    public void PedirDatos(){
        System.out.print("Dame tu nombre : ");
        nombre = entrada.nextLine();
        
    }
    public void Imprimir(){
        System.out.println("Tu nombre es " + nombre);
        
    }
}
