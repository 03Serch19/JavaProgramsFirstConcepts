/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package memoriaestatica;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class MemoriaEstatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arrayNumeros[]=new int[10];
        Scanner sc = new Scanner(System.in);
        int num;
        int i=0;
        int tam=0;
        do {
            System.out.println("Ingrese un numero: ");
            num= sc.nextInt();
            if(num>0){
                arrayNumeros[i]=num;         
            }
            i++;
            tam++;
            if(i==10)break;
        } while (num>0);
        System.out.println("Mostrar numeros");
        for (int j = 0; j < tam-1; j++) {
            System.out.println(arrayNumeros[j]);
        }
    }
    
}
