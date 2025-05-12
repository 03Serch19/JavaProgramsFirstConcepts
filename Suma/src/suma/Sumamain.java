
package suma;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Sumamain {
    
    public static void main(String args[]){
        try{
        Scanner entr = new Scanner(System.in);
        System.out.print("Ingrese el primer valor: ");
        int vl1 = entr.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        int vl2 = entr.nextInt();
        Suma valores = new Suma(vl1, vl2);
        valores.imprimir();
        }catch(Exception e){
            System.out.println("Error....." + e);
        } finally{
            System.out.println("Fin del proceso");
        }
    }
}
