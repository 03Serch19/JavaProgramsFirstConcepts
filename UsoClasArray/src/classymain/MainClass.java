/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classymain;



/**
 *
 * @author ADMIN
 */
public class MainClass {

    public static void main(String[] args) {
       int arrayNumero[]=new int[5];
       UsoArray usArr = new UsoArray();
       usArr.rellenarArreglo(arrayNumero);
        System.out.println("Calificaciones sin ordenar");
       usArr.mostrarArreglo(arrayNumero);
       usArr.ordenarAreegloo(arrayNumero);
       
    }
}
