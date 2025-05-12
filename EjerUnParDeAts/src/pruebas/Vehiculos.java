/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

/**
 *
 * @author MINEDUCYT
 */

public abstract class Vehiculos {
       protected String serieM,datos;
   protected int año;
   protected double precio;
//   public String [] getDatos(){
//       String datos[]=new String[3]; 
//       datos[0]=serieM;
//       datos[1]=""+año;
//       datos[2]=""+precio;
//      return datos;
//   }
    
   public abstract String getDatos();
}
