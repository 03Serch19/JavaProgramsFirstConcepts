/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masStack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Producto>p=new Stack<Producto>();
        Producto pro;
        System.out.println("Ingrese la cantidad de productos: ");
        int cant=sc.nextInt();
            //int k=0;
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el nombre,codigo y cantidad en stock: Producto"+(i+1));
            pro=new Producto(sc.next(),sc.nextInt(),sc.nextInt());
            p.push(pro);
        }
        System.out.println("Stock Menor a 10");
        while (!p.isEmpty()) {            
            pro=p.pop();
            int ab=pro.getStock();
            if(ab<10){
                pro.Mostrar();
            }
        }
    }
 
}
