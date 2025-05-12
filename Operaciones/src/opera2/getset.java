/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opera2;

/**
 *
 * @author MINEDUCYT
 */
public class getset {
   public final String name;
   
   private static int edad;
   
    public getset(String name, int edad){
    this.name =name;
    getset.edad=edad;
    }
    public void setEdad(int edad){
     getset.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    /*
        public static int getEdad() { //si el metodo es estatico no puede retornarme valores de 
        return edad;                 //de variables no estaticas
    }
     
    
    */
  public String getNombre(){
  return name;
  }
  /* public void setNombre(String name){
      getset gsg = new getset(name, edad);
      
   
   }*///no es posible modificar desde otra clase una constante final
}
