/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathclass;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class potymas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double potencia = Math.pow(5, 2);
        System.out.println("La potencia es "+ potencia);
        double raiz = Math.sqrt(25);
        System.out.println("La raiz es "+raiz);
        float redondea = 4.56f;
       int rr = Math.round(redondea);
        System.out.println("el redondeo es "+rr);
       double redonda =6.23;
       long rrr = Math.round(redonda);
       
           System.out.println("el redondeo es "+rrr);
       System.out.println("Dijite tres numeros");
           float nota1=in.nextFloat();
          float  nota2=in.nextFloat();
           float  nota3=in.nextFloat();
              float suma = (nota1+nota2+nota3)/3;   
              System.out.println("LA NOTA ES "+suma);
              int horastr =65;
              float slariphor = 1.50f;
              float pago= horastr*slariphor;
            System.out.println("el pago del trbajador es "+pago);
    }
}
