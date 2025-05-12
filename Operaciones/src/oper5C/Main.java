/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oper5C;

import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUCYT
 */
public class Main {
     
    public static void main(String[] args) {
     
      /* int band = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de vehiculos a ingresar"));
       
       Vehiculo ob;
       ob = new Vehiculo(band);
        do {            
       String modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo");
       String color = JOptionPane.showInputDialog(null, "Ingrese el  color");
       Float precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el precio"));
       band--;
       ob = new Vehiculo(modelo, color, precio);
        } while (band >0);
      */
      int band;
       
        do {
             band = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de vehiculos a ingresar"));
        } while (band<1);
        
       Vehiculo carros[] = new Vehiculo[band];
      int indibara;

      
       for (int i = 0; i < carros.length; i++) {
        String modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo");
       String color = JOptionPane.showInputDialog(null, "Ingrese el  color");
       Float precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el precio"));
       carros[i] = new Vehiculo(modelo,color,precio);
           System.out.println(carros[i].mostrardatos());
        }
       /* for (Vehiculo carro : carros) {
            System.out.println(carro.mostrardatos());
        }*/
        
       
        indibara= Vehiculo.indicepremasbara(carros);
        JOptionPane.showMessageDialog(null, "El carro mas barato es :" +carros[indibara].mostrardatos());
        System.out.println("El carro mas barato es :" +carros[indibara].mostrardatos());
        
        //System.out.println("el cual es "+carros[indibara].getPrecio());
    }
   
}
