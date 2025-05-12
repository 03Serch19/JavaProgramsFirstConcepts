
package polimorfismo;


public class MainClassOperaciones {
    public static void main(String[] args) {
        CPadreOpera opsuma = new CHijasuma();
        opsuma.pedirDatos();
        opsuma.Operaciones();
        opsuma.MostrarResultado();
        CPadreOpera opresta = new CHijaresta();
        opresta.pedirDatos();
        opresta.Operaciones();
        opresta.MostrarResultado(); 
        
            // tambien se puede
       /* CHijasuma opsuma = new CHijasuma();
        opsuma.pedirDatos();
        opsuma.Operaciones();
        opsuma.MostrarResultado();
        CHijaresta opresta = new CHijaresta();
        opresta.pedirDatos();
        opresta.Operaciones();
        opresta.MostrarResultado();*/
       
    }
}
