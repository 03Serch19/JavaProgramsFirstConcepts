/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inverspalabr;

import java.util.Scanner;

public class InversPalabr {

    public static void main(String[] args) {

        String palabra = "", palainv = "";
        int lpa = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase:");
        palabra = entrada.nextLine();
        lpa = palabra.length();
        while (lpa != 0) {
            palainv += palabra.substring(lpa - 1, lpa);
            lpa--;

        }
        System.out.print("La nuebva palabra es: " + palainv);
    }

}
