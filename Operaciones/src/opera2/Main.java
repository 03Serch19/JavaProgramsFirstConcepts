/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opera2;

import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUCYT
 */
public class Main {
    public static void main(String[] args) {
       String na = JOptionPane.showInputDialog(null, "Ingrese su nombre");
       int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad"));
       String na1 = JOptionPane.showInputDialog(null, "Ingrese su nombre");
       int edad1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad"));
        getset gs = new getset(na, edad);
        gs.setEdad(19);
         getset gs1 = new getset(na1, edad1);
        //gs.name="moldejajaja";  aunque sea publica no funciona
        //gs.setNombre("luuk");
        
        System.out.println("La edad es "+gs.getEdad());
        System.out.println("El nombre es "+ gs.getNombre());
         System.out.println("La edad es "+gs.getEdad());
        System.out.println("El nombre es "+ gs1.getNombre());
      /*  System.out.println("El nombre es "+ getset.getNombre());  para llamar metodos estaticos no se neceita objetos
        System.out.println("El nombre es "+ getset.getNombre());  */   //basta con la el nombre de clase
    }
}
