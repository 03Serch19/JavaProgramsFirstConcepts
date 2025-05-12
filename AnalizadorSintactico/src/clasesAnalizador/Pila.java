/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesAnalizador;

/**
 *
 * @author MINEDUCYT
 */
public class Pila {
    Nodo ultimoValorIngresado;
    public Pila(){
        ultimoValorIngresado = null;
    }
    public void InsertarNodo(char valor){
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion = valor;
        if(ultimoValorIngresado==null){
            
            nuevo_nodo.siguiente=null;
            ultimoValorIngresado =nuevo_nodo;
            
        }else{
            nuevo_nodo.siguiente= ultimoValorIngresado;
            ultimoValorIngresado = nuevo_nodo;
        }
    }
    public char ExtraerValor(){
        if(ultimoValorIngresado!=null){
          char infor = ultimoValorIngresado.informacion;  
          ultimoValorIngresado=ultimoValorIngresado.siguiente;
          return infor;
        }else{
            return Character.MAX_VALUE;
        }
    }
    public boolean PilaVacia(){
        return  ultimoValorIngresado==null;
    }
}
