package clasess;

public class MainClassss {
    public MainClassss(){
//public void prohilos(){
    //public static void main(String[] args) {
        //primer estado 
        Proceso hilo1 = new Proceso(" Hilo 1");
        Proceso hilo2 = new Proceso(" Hilo 2");
        
        //segundo estado
        hilo1.start();
         
        try {
           
            hilo1.sleep(2000);
            System.out.println("el hilo1 para despues sleep");
        } catch (InterruptedException e) {
            System.out.println("Error.rrrrrrrr...en el hilo 1.");
        }
      //  hilo1.stop();
      
        hilo2.start();
        hilo1.stop();
        try {
       
            hilo2.sleep(2000);
            System.out.println("el hilo2 para despues sleep");
        } catch (InterruptedException e) {
            System.out.println("Error.rrrrrrrr...en el hilo 2.");
        }
    //}
//}
}
}
