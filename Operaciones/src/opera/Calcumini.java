/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opera;

//import java.util.Scanner;

/**
 *
 * @author MINEDUCYT
 */
public class Calcumini {
    
    public static void main(String[] args) {
        try{
       /*Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int v1 = in.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int v2 = in.nextInt();*/
        In2 id1 = new In2();
        id1.PedirDatos();
        id1.imprimir();
        }catch(Exception e){
            System.out.println("Error en datos");
        }
    }
}
