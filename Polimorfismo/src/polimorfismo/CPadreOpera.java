
package polimorfismo;

import java.util.Scanner;
public abstract class CPadreOpera {
    protected int v1, v2, r;
    private Scanner in = new Scanner(System.in);
    public void pedirDatos(){ //pedir valores
        System.out.print("Dame el primer valor: ");
        v1 = in.nextInt();
        System.out.print("Dame el segundo valor: ");
        v2 = in.nextInt();
    }                                     //hara la operacion segun sea lo que se le ordene en la clase heredada
    public abstract void Operaciones(); // el metodo se podra comportar de manera diferente segun se programe en la clase heredada
    public void MostrarResultado(){ //mostrara el resultado de la operacion
        System.out.println("El resultado es: " + r);
    }
}
