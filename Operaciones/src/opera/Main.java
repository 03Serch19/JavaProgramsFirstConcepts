/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opera;

import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUCYT
 */
public class Main {
    public static void main(String[] args) {
               /* String na = JOptionPane.showInputDialog(null, " Ingrese el nombre");
        int edaddd = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad"));
        String duii = JOptionPane.showInputDialog(null, " Ingrese el DUI");*/
        Persona p1; //= new Persona(76, "WALMER");

        p1 = new Persona(45, "walmer");
         p1.correr();
         
         p1 = new Persona("8688899");
         p1.correr();
         Persona p2 = new Persona(98,"naniii");
         p2.correr(78);
         p2.correr();
         p2.llorar();
         Persona p3 = new Persona("3445566");
         
         p3.correr(56);
         p3.correr();
         p3.llorar();
         p3 = new Persona(32,"ross");
          p3.correr(56);
         p3.correr();
         p3.llorar();
    }
}
