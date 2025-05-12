package clases;

import java.util.Scanner;

public abstract class CPadreAbstroper {

    protected int Transaccion, Deposito, Retiro;
    private static int saldo = 0;
    Scanner in = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0;
        int seleccion = 0;
        System.out.println("*****************************");
        System.out.println("******Bienvenido a BBVA******");
        System.out.println("*****************************");
        try {
            do {
                do {
                    System.out.println("-----------------------------");
                    System.out.println("------Elija una opcion-------");
                    System.out.println("------------------------------");
                    System.out.println("  1.Consulta de saldo ");
                    System.out.println("  2.Retiro de saldo   ");
                    System.out.println("  3.Depositar de saldo");
                    System.out.println("  4.Salir");
                    seleccion = in.nextInt();

                    if (seleccion >= 1 && seleccion <= 4) {
                        bandera = 1;
                    } else {
                        System.out.println("--------------------------------------------------");
                        System.out.println("La opcion no esta disponible, vuelva a intentarlo.");
                        System.out.println("--------------------------------------------------");
                    }

                    if (seleccion == 1) {
                      //CHijaConsulta m = new CHijaConsulta();    tambien se puede
                        CPadreAbstroper m = new CHijaConsulta();
                        m.Transacciones();
                    } else if (seleccion == 2) {
                       //CHijaRetiro m = new CHijaRetiro(); 
                        CPadreAbstroper m = new CHijaRetiro();                     
                        m.Transacciones();
                    } else if (seleccion == 3) {
                        //CHijaDeposito m = new CHijaDeposito();
                        CPadreAbstroper m = new CHijaDeposito();
                        m.Transacciones();
                    } else if (seleccion == 4) {
                        System.out.println("--------------------------------------");
                        System.out.println("Gracias por preferirnos, vuelva pronto");
                        System.out.println("--------------------------------------");
                        bandera = 2;
                    }
                } while (bandera != 2);
            } while (bandera == 0);
        } catch (Exception e) {
            System.out.println("Error..............." + e);
        }
    }
    //solicitar cantidad de retiro

    public void Retiro() {
        Retiro = in.nextInt();
    }

    //solicitar cantidad de deposito
    public void Deposito() {
     
         Deposito = in.nextInt();              
    }

    //metodo abtracto
    public abstract void Transacciones();

    //metodos setter y getter
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
