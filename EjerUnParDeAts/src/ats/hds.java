/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ats;

import javax.swing.JOptionPane;



/**
 *
 * @author ADMIN
 */
public class hds {
    public static void main(String[] args) {
       int horastotales = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el total de horas"));
       int semanas = horastotales/168;
       int dias = horastotales%168/24;
       int horas =horastotales%24;
       JOptionPane.showMessageDialog(null, "El equivalente es \n numero de semanas es " +semanas+" \n"
                           +"numero de dias es " +dias+" \n"
                           +"numero de horas es "+horas);
    }
    
}
