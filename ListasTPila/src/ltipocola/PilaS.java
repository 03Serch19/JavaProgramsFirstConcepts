/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ltipocola;

import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUCYT
 */
public class PilaS {
    String Cpila = "";
    int tamaño;                     
    NodoDeLista ultiNodoDeLista;
    int bban =0;
      
    public PilaS(){
        ultiNodoDeLista = null;
        tamaño = 0;
    }
  //saber cuando la pil esta vacia
    public boolean pilaVacia(){
        return ultiNodoDeLista == null;
    }
      //metodo para ingresar un nuevo nodo
    public void insertarNodo(int nnodo){
        NodoDeLista nuevonodo = new NodoDeLista(nnodo);
       nuevonodo.siguienteC= ultiNodoDeLista;
       ultiNodoDeLista = nuevonodo;
       tamaño++;
    }
    //eliminar un nodo
    public int eliminarNodo(){
        int auxiliar = ultiNodoDeLista.informacionN;
         ultiNodoDeLista = ultiNodoDeLista.siguienteC;
        tamaño--;
        return auxiliar;
    }
    //metodo para saber cual es el ultimo valor ingresado
    public int ultimoValorIngresado(){
        return ultiNodoDeLista.informacionN;
        
    }
    //metodo para saber la cantidad de nodos
    public int tamañonodosDeLaPila(){
        return tamaño;
      
    }
    //metodo para eliminar todos nodos
    public void vaciarPila(){
        while (!pilaVacia()) {            
          
        eliminarNodo();
        bban++;
        }
        if(bban!=0){
            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila");
        }
    }
    //metodo para mostrar todos los nodos
    public void mostrarLista(){
        NodoDeLista recorrido = ultiNodoDeLista;
        while (recorrido != null) {
         Cpila += recorrido.informacionN + "\n";         //El numero d nodo es solo como una guia para saber que elemento va saliendo
         recorrido = recorrido.siguienteC;  
        
        }
        JOptionPane.showMessageDialog(null, Cpila);
        Cpila ="";
       
    }
}
