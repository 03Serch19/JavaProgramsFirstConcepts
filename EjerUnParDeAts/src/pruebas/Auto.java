/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

/**
 *
 * @author MINEDUCYT
 */
public class Auto extends Vehiculos{
    protected int caPasajeros;

    @Override
    public String getDatos() {
        datos=serieM+" "+año+" "+precio+" "+caPasajeros;
     return datos;
   }
    
}
