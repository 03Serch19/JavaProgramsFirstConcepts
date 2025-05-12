/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masStack;

/**
 *
 * @author ADMIN
 */
public class Producto {
    private String nombre;
    private int codigo,stock;
    public Producto(String nom,int cod,int s){
       nombre=nom;
       codigo= cod;
       stock=s;
    }
    public int getStock(){
        return  stock;
    }
    public void Mostrar(){
        System.out.println("Nombre: "+nombre+"\nCodigo: "+codigo+"\nStock: "+stock);
    }
}
