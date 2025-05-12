/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesFacto;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Clase_Principa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero para calcular su factorial: ");
        int numero = sc.nextInt();
        RecursividadFactorial msre = new RecursividadFactorial();
        
        int factorial=msre.Factorial(numero);
        System.out.println("El factorial de "+numero+" es "+factorial);
       //metoPreubaa();
    }
//    public void metoPreubaa(){
//        System.out.println("este es 1");
//        System.out.println("este es 2");
//     
//        return;
//    }
}
