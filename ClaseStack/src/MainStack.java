
import java.util.Scanner;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class MainStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<String>pila=new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa 5 palabras: ");
        for (int i = 0; i < 5; i++) {
            pila.push(sc.next());
        }
        System.out.println("Elementos de la pila: ");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }
    
}
