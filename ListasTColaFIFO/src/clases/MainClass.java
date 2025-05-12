/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import javax.swing.JOptionPane;

/**
 * @author ADMIN
 */
public class MainClass {

    public static void main(String[] args) {
        int opcion = 0, nodo_Informacion = 0;
        Cola cola = new Cola();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu Opciones\n\n"
                        + "1. Insertar un nodo\n"
                        + "2. Extraer un nodo\n"
                        + "3. Mostrar contenido de la cola\n"
                        + "4. Salir.\n\n"));
                switch (opcion) {
                    case 1:
                        nodo_Informacion=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Por favor ingresa el valor a guardar en el nodo."));
                        cola.Insertar(nodo_Informacion);
                        break;
                    case 2:
                        if (!cola.ColaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: "
                                    +cola.Extraer());
                        }else{
                             JOptionPane.showMessageDialog(null, "La cola esta vacia ");
                        }
                        break;
                    case 3:
                        cola.MostrarContenido();
                        break;
                    case 4:
                        opcion=4;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no disponible");
                        break;
                }
            } catch (NumberFormatException e) {
            }
        } while (opcion != 4);

    }
}
