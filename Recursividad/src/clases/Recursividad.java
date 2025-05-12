/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ADMIN
 */
public class Recursividad {
    public void Imprimir(int x){
        if(x<=5){
            System.out.print(x+" ");
            Imprimir(x+1);               
        }
      
    }
}
