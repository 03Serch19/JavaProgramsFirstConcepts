/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ats;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class Ats extends Thread{
    
     @Override
     public void run(){
          
         String[] nombres ={"GOLDEN ","DASHI ","TERESA ","YANIRA","FLORES","WALMER","ITALU"};
            for (String nombre : nombres) {
            System.out.print(nombre);
           
                try {
                    sleep(500);
                   System.out.println("");
                } catch (Exception e) {
                }
            
        }  
         
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
       /* for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }*/

        Ats at = new Ats();
        Ats at1 = new Ats();
        at.start(); 
         
         at1.start();
         
         try {
             at.sleep(1000);
          
         } catch (InterruptedException ex) {
             Logger.getLogger(Ats.class.getName()).log(Level.SEVERE, null, ex);
         }
        
           try {
             at1.sleep(2000);
               System.out.println("1");
         } catch (InterruptedException ex) {
             Logger.getLogger(Ats.class.getName()).log(Level.SEVERE, null, ex);
         }
        
             
    }
    
}
