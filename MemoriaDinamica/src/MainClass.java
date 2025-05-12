
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author ADMIN
 */

public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> listaNumerica = new ArrayList<Integer>();
        int n, i = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero " + (i + 1)));

            if (n >= 0) {
                listaNumerica.add(n);
                i++;
            }
        } while (n >= 0);

        for (int j = 0; j < listaNumerica.size(); j++) {
            System.out.println("Elemento " + (j + 1) + ": " + listaNumerica.get(j));
        }
        if(listaNumerica.isEmpty())System.out.println("La lista esta vacia");
        else System.out.println("La lista no esta vacia");     
    }

}
