/*
 * Funcionamiento logico de una lavadora
 *
 */
package llfunciones;

/**
 *
 * @author SERGIO
 */
public class LLFunciones { 
    //Declaracion de variables
    private int kilos = 0, tipoRopa = 0, llenadoComple = 0, lavadoComple = 0, secadoComple = 0;
    
    public LLFunciones(int kls, int tiRo){
        //Aqui se recibiran los datos desde la clase principal
        this.kilos = kls;
        this.tipoRopa = tiRo;
    }
    private void Llenado(){
        //Aqui esta l proceso de llenar la lavadora
        if(kilos <= 15){
            llenadoComple = 1;
            System.out.println("Llenando..");
            System.out.println("Llenado completado.");
        } else {
            System.out.println("La cantidad es mayor a lo permitido, vuelva a intentarlo.");
        }
    }
    private void Lavado(){
        //Aqui se lava la ropa 
        Llenado();
        if(llenadoComple == 1){
            if(tipoRopa == 1){
                System.out.println("El tipo de ropa es blanca.");
                System.out.println("Se realizara un lavado suave.");
                System.out.println("Lavando...");
                lavadoComple = 1;
            } else if(tipoRopa == 2){
                System.out.println("El tipo de ropa es de color.");
                System.out.println("Se realizara un lavado intenso.");
                System.out.println("Lavando...");
                lavadoComple = 1;                
            } else {
                System.out.println("El tipo de ropa no esta disponible");
                System.out.println("Se realizara un lavado intenso como ropa de color.");
                System.out.println("Lavando...");
                lavadoComple = 1;
            }    
        }
    }
    private void Secado(){
        //Aqui es el proceso de secado 
        Lavado();
        if(lavadoComple == 1){
            System.out.println("Iniciar proceso de secado.");
            System.out.println("Secando...");
            secadoComple = 1;
        }
    }
    public void CicloFinalizado(){
        //ESTE metodo es el cual contendra el proceso completo de lavado que se usara en la empresa
        Secado();
        if(secadoComple == 1){
            System.out.println("Tu ropa esta lista.");
        }
    }
    public int getTipodeRopa(){ //metodo para permitir que la empresa obtenga el dato de la variable
        return  tipoRopa;
    }
    public void setTipodeRopa(int TipoDeRopa){ //metodo para que la emprersa pueda modificar el valor de la variable
        this.tipoRopa = TipoDeRopa;
    }
}
