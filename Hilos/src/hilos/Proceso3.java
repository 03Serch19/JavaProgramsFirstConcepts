/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

/**
 *
 * @author ADMIN
 */
public class Proceso3 extends Thread {
      @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Proceso3");
        }
    }
}
