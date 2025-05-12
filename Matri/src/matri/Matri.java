package matri;

import java.util.Scanner;

public class Matri {

    public static void main(String[] args) {
        int fl = 0, cl = 0,/*, cn = 1*/numin = 0, conn = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de filas que desea: ");
        fl = in.nextInt();
        System.out.print("Ingrese la cantidad de columnas que desea: ");
        cl = in.nextInt();
        int nm[][] = new int[fl][cl];
        System.out.println("");
        for (int j = 0; j < fl; j++) {
            for (int i = 0; i < cl; i++) {
                System.out.println("Ingresa el numero " +conn);
                numin = in.nextInt();
                conn++;
                /*nm[j][i] = cn;*/
                /*cn++;*/
                nm[j][i] = numin;
                /*System.out.print("[" + nm[j][i] + "]");*/
            }
           /* System.out.println("");*/
        }
        for(int j = 0; j <fl; j++){
            for (int i = 0; i < cl; i++) {
                System.out.print("[" + nm[j][i] + "]");
            }
            System.out.println("");
        }
    }

}
