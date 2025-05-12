
import java.util.Scanner;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class MainStackOtro2 {
    public static void main(String[] args) {
        Stack<Integer>pila=new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cuantos elementos agregara: ");
        int tam = sc.nextInt();
        System.out.println("Agregar los numeros a la pila");
        for (int i = 0; i < tam; i++) {
            pila.push(sc.nextInt());
        }
    System.out.println("--->"+(int)pila.get(2));
        System.out.println("Elementos de la pila");
        //int j=0;
        while (!pila.isEmpty()/*&&j<pila.size()*/) {            
            System.out.println((int)pila.pop());
              // System.out.println((int)pila.get(j));
              // j++;
                       
        }
     //  System.out.println("--->"+(int)pila.get(2));
         System.out.println("Agregar los numeros a la pila");
        for (int i = 0; i < 6; i++) {
            pila.push(sc.nextInt());
        }
           System.out.println("--->"+(int)pila.get(2));
    }
}
