/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opera;

//import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUCYT
 */
public class Persona {

    int edad;
    String nombre;
    String Dui;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public Persona(String Dui) {
        this.Dui = Dui;
    }

    public void correr() {
         
        System.out.println("Yo corro y soy " +edad+nombre+Dui);
    }

    public void correr(int km) {

        System.out.println("Yo "  +nombre+ "con "+ edad+ "corro mucho con dui"+ Dui +" "+km);
    }

    public void llorar() {
        System.out.println("Yo lloro");
    }
}
