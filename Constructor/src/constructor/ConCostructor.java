package constructor;

import java.util.Scanner;

public class ConCostructor {

    public ConCostructor() {
        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        System.out.print("Dame tu nombre : ");
        nombre = entrada.nextLine();
        System.out.println("Tu nombre es " + nombre);
    }
}
