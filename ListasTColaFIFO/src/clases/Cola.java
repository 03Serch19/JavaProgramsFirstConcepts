/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Cola {
    private Nodo inicioCola,finalCola;
    String cola="";
    
   public   Cola(){
      inicioCola=null;
      finalCola=null;
   }
   public boolean ColaVacia(){
       if (inicioCola==null) 
           return true;
       else
           return false;
   }
   public void Insertar(int inform){
       Nodo nuevoNodo = new Nodo();
       nuevoNodo.informacion=inform;
       nuevoNodo.siguiente=null;
       if (ColaVacia()) {
           inicioCola=nuevoNodo;
           finalCola=nuevoNodo;
       }else{
           finalCola.siguiente=nuevoNodo;
           finalCola=nuevoNodo;
       }      
   }
          public int Extraer(){
           if(!ColaVacia()){
               int informacion= inicioCola.informacion;
               if (inicioCola==finalCola) {
                   inicioCola=null;
                   finalCola=null;
               }else{
                   inicioCola=inicioCola.siguiente;
               }
               return informacion;
           }else{
              return Integer.MAX_VALUE;
           }
       }
          public void MostrarContenido(){
              Nodo recorrido = inicioCola;
              String ColaInvertida="";
              while (recorrido!=null) {
                 cola+= recorrido.informacion+" ";
                 recorrido=recorrido.siguiente;
              }
              String cadena[]=cola.split(" ");
              for (int i = cadena.length-1; i >=0; i--) {
                  ColaInvertida+=cadena[i]+" ";
                    // ColaInvertida+=" "+cadena[i];
              }
              JOptionPane.showMessageDialog(null, ColaInvertida);
              cola="";
          }
}
