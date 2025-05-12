/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arearectangulo;

/**
 *
 * @author ADMIN
 */
public class Area {
    private int  base, altura, area;
    public Area(int base, int altura){
    this.base = base;
    this.altura = altura;
    }
    public void Calculo(){
    area = base * altura;
    }
    public void Imprimir(){
    Calculo();
    System.out.println("El area es: " + area + "   ");
    }
}
