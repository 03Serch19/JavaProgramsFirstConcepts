/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mu10ycomp;

import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUCYT
 */
public class MUlti10 {
    public static void main(String[] args) {
       
        long ni = Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese el numero"));
       long resi = ni%10;
        if (resi==0) {
            JOptionPane.showMessageDialog(null, "El numero "+ ni+ " es multiplo de 10");
        } else {
            JOptionPane.showMessageDialog(null, "El numero "+ ni+ " no es multiplo de 10");
        }
        int ni1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero1"));
        int ni2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero2"));
       if(ni1==ni2){
      JOptionPane.showMessageDialog(null, "Ambos numeros son iguales");
       }else if(ni1>ni2){
           JOptionPane.showMessageDialog(null, "El numero "+ ni1+ " es mayor que "+ni2);
       }else{
               JOptionPane.showMessageDialog(null, "El numero "+ ni2+ " es mayor que "+ni1);
       }
        
    }
}
