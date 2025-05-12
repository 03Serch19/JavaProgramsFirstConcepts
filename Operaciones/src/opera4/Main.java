/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opera4;


import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUCYT
 */
public class Main {
    public static void main(String[] args) {
       float l1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el lado 1"));
       float l2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el lado 2"));
       PYA ob1;
        if (l1 ==l2) {
            ob1 = new PYA(l1);
        } else {
            ob1 = new PYA(l1,l2);
        }
       
       JOptionPane.showMessageDialog(null, "El perimetro es "+/*String.format("%.2f",*/ ob1.getPerimetro()/*)*/
                       + "\n El Area es "+/*String.format("%.2f", */ob1.getArea()/*)*/);
        
    }
}
