
package operaciones;

import java.util.Scanner;

/**
 *
 * @author ssss
 */
public class CPINdatos { //clasePadre
    protected int vl1, vl2 , re;
    public void PedirDatos(){ //pide los datos al usuario
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese los valores: ");
        vl1 = in.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        vl2 = in.nextInt();
        /* System.out.print("Ingrese los valores: ");
        vl1 = in.nextInt();                esto es valido en java
        vl2 = in.nextInt();*/
    }
    public void MostrarResultado(){ //muestra el resultado
        System.out.println(re);
    }
}
