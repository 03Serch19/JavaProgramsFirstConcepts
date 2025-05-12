/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ltipocola;

import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUCYT
 */
public class MainC {

    public static void main(String[] args) {
        PilaS pila = new PilaS();
        int opcion = 0, nodo = 0;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, " LISTA TIPO COLA \n"
                        + "1. Insertar un nodo \n"
                        + "2. Eliminar un nodo \n"
                        + "3. ¿La pila esta vacia? \n"
                        + "4. ¿Cual es el ultimo valor ingresado en la pila? \n"
                        + "5. ¿Cuantos nodos tiene la pila? \n"
                        + "6. Vaciar pila \n"
                        + "7. Mostrar pila \n"
                        + "8. Salir"));
                switch (opcion) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte un nodo"));
                        pila.insertarNodo(nodo);
                        break;
                    case 2:
                        if (!pila.pilaVacia()) {
                            pila.eliminarNodo();
                            JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia, no hay nada que eliminar");
                        }
                        break;
                    case 3:
                        if (pila.pilaVacia()) {

                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila no esta vacia");
                        }
                        break;
                    case 4:
                        if (!pila.pilaVacia()) {
                            JOptionPane.showMessageDialog(null, "El ultimo valor ingresado es: " + pila.ultimoValorIngresado());
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay ultimo valor, La pila esta vacia");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila tiene " + pila.tamañonodosDeLaPila() + " nodos");
                        break;
                    case 6:
                        if (!pila.pilaVacia()) {
                            pila.vaciarPila();
                       
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia, no hay nada que vaciar");
                        }
                        break;
                    case 7:
                       pila.mostrarLista();
                       break;
                    case 8:
                        opcion = 8;
                        break;
                        default:
                            JOptionPane.showMessageDialog(null, "La opcion no esta disponible, vuelva a intentarlo");
                            break;
                }
            } catch (Exception e) {
                System.out.println("errrr");
            }
        } while (opcion != 8);
    }
}
