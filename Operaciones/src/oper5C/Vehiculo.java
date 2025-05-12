/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oper5C;

//import java.util.Arrays;
import java.util.Arrays;

/**
 *
 * @author MINEDUCYT
 */
public class Vehiculo {

    private String modelo, color;
    private Float precio;
   /* int cantca;
    String veccarr[] = new String[cantca];
    String veccolo[] = new String[cantca];
    String vecprec[] = new String[cantca];

    public Vehiculo(int cantcav) {
        this.cantca = cantcav;

    }*/

    public Vehiculo(String modelo, String color, Float precio) {
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        
    }

    public static int indicepremasbara(Vehiculo carro[]){
      float precio ;
      int indi =0;
  
      precio = carro[0].getPrecio();
          for (int i = 1; i < carro.length; i++) {
              if (carro[i].getPrecio() < precio) {
                  precio = carro[i].getPrecio();
                  indi = i;
              } 
          }
          return indi;
       }
    public String mostrardatos() {
     return "Marca "+modelo +" Color "+color+" Precio "+precio;
    }

    public Float getPrecio() {
        return precio;
    }
}
