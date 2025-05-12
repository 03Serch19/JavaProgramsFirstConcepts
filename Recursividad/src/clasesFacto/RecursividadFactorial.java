/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesFacto;

/**
 *
 * @author ADMIN
 */
public class RecursividadFactorial {
    public int Factorial(int parametro){
        if(parametro>0){
            int valor_Calculado =parametro*Factorial(parametro-1);
            return valor_Calculado;
        }
        return 1;
       // return Integer.MAX_VALUE;
    }
}
