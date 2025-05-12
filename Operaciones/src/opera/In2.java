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
public class In2 {

    private int n1, n2;

    public void PedirDatos() {
       n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
       n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero"));
    
    }

    private int Suma() {
        int suma = n1 + n2;
        return suma;
    }

    private int Resta() {
        int resta = n1 - n2;
        return resta;
    }

    private int Producto() {
        int producto = n1 * n2;
        return producto;
    }

    private int Division() {

        try {
            int division = n1 / n2;
            return division;
        } catch (Exception e) {
            System.out.print("Error division ");

        }
        return 1;
        

    }

    public void imprimir() {
        Suma();
        Resta();
        Producto();
        System.out.print("Ingrese el primer numero: "
                          +  n1 + "\n");
        
        System.out.print("Ingrese el segundo numero: "
                           + n2 + "\n");
        
        System.out.println("El resultado de la suma es: " + Suma());
        System.out.println("El resultado de la resta es: " + Resta());
        System.out.println("El resultado de la multiplicacion es: " + Producto());
        if(n2 != 0){
            System.out.println("El resultado de la division es: " + Division());
               JOptionPane.showMessageDialog(null, "Ingrese el primer numero: "
                          +  n1 + "\n"
                        + "Ingrese el segundo numero: "
                           + n2 + "\n" 
                        + "El resultado de la suma es: " + Suma() +"\n"
                        +  "El resultado de la resta es: " + Resta()+"\n"
                          + "El resultado de la multiplicacion es: " + Producto()+"\n"
                        + "El resultado de la division es: " + Division()); 
            
        }
        else if(n1==0 && n2 == 0){
              System.out.println("Resultado indefinido ");
               JOptionPane.showMessageDialog(null, "Ingrese el primer numero: "
                          +  n1 + "\n"
                        + "Ingrese el segundo numero: "
                           + n2 + "\n" 
                        + "El resultado de la suma es: " + Suma() +"\n"
                        +  "El resultado de la resta es: " + Resta()+"\n"
                          + "El resultado de la multiplicacion es: " + Producto()+"\n"
                        + "Resultado indefinido " ); 
              
                }
        else {
            System.out.println("No es posible dividir entre cero");
        JOptionPane.showMessageDialog(null, "Ingrese el primer numero: "
                          +  n1 + "\n"
                        + "Ingrese el segundo numero: "
                           + n2 + "\n" 
                        + "El resultado de la suma es: " + Suma() +"\n"
                        +  "El resultado de la resta es: " + Resta()+"\n"
                          + "El resultado de la multiplicacion es: " + Producto()+"\n"
                        + "No es posible dividir entre cero");
        }
    }
    

    }
    
  

