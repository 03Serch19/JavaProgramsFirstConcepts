
package maindos;

import polimorfismo.CHijaresta;
import polimorfismo.CHijasuma;
import polimorfismo.CPadreOpera;

public class OPdos {
    public static void main(String[] args) {
        CPadreOpera sm = new CHijasuma();
        sm.pedirDatos();
        sm.Operaciones();
        sm.MostrarResultado();
        CPadreOpera re = new CHijaresta();
        re.pedirDatos();
        re.Operaciones();
        re.MostrarResultado();     
        //tambien se puede sin nececidad de importar a la clase padre
       /*CHijasuma opsuma = new CHijasuma();
        opsuma.pedirDatos();
        opsuma.Operaciones();
        opsuma.MostrarResultado();
        CHijaresta opresta = new CHijaresta();
        opresta.pedirDatos();
        opresta.Operaciones();
        opresta.MostrarResultado();*/
    }
}
