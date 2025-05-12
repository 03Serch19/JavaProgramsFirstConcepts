/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suma;

/**
 *
 * @author ADMIN
 */
public class Suma {
    private int v1, v2, re;
    public Suma(int vl11, int vl22){ //el nombre de estas variables no afecta pueden ser iguales o distintas que de donde vengan
    this.v1 = vl11;
    this.v2 = vl22;
    }
    public void Operacion(){
    re = v1 + v2;
    }
    public void imprimir(){
        Operacion();
        System.out.println("El resultado es: " + re);
    }
}
