/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arearectangulo;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Areamain {
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);
        System.out.print("Dame el valor de la base: ");
        int bs = entra.nextInt();
        System.out.print("Dame el valor de la altura: ");
        int al = entra.nextInt();
        Area menn = new Area(bs, al);
        menn.Imprimir();
    }
    
}
