/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classymain;

import javax.swing.JOptionPane;
import java.util.Arrays;
/**
 *
 * @author ADMIN
 */
public class UsoArray {
        public void rellenarArreglo(int arr[]){
             //rellenar arreglos con numeros del 0 al 10
          int n,i=0;
        do {
            n=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor "+(i+1)));
            if(n>=0 && n<=10){//que el numero se encuentre entre 0 y 10
                arr[i]=n;
                i++;
            }
        } while (i<5);
        
    }
        public void mostrarArreglo(int arr[]){
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Calificacion "+(i+1)+" = "+arr[i]);
            }
        }
        public void ordenarAreegloo(int arr[]){
            System.out.println("Calificaciones ordenadas");
            Arrays.sort(arr);
            mostrarArreglo(arr);
        }
}
