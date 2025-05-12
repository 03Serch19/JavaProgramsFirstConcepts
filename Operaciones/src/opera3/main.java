/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opera3;

import javax.swing.JOptionPane;
import opera2.getset;

/**
 *
 * @author MINEDUCYT
 */
public class main {
      /*public static void main(String[] args) {
       getset gs = new getset();
        gs.setEdad(28);
        System.out.println("La edad es "+gs.getEdad());
       
    }*/
        public static void main(String[] args) {
       String na = JOptionPane.showInputDialog(null, "Ingrese su nombre");
       int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad"));
        getset gs = new getset(na, edad);
        gs.setEdad(19);
        //gs.name="moldejajaja";  aunque sea publica no funciona
        //gs.setNombre("luuk");
        System.out.println("La edad es "+gs.getEdad());
        System.out.println("El nombre es "+ gs.getNombre());
    }
}
