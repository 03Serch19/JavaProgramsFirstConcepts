/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

/**
 *
 * @author MINEDUCYT
 */
public class Camion extends Vehiculos{
    protected double carga;
    protected int ejes,rodadas;

    @Override
    public String getDatos() {
     datos=serieM+" "+año+" "+precio+" "+carga+" "+ejes+" "+rodadas;
     return datos;
    }
    
}
