/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opera4;

/**
 *
 * @author MINEDUCYT
 */
public class PYA {
  private float l1, l2;    

    public PYA(float l1, float l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public PYA(float l1) {
        this.l1 = this.l2= l1;
       
    }
  public float getPerimetro(){
      float perimetro = 2 *(l1+l2);
       return perimetro;
  }
    public float getArea(){
      float area = l1*l2;
       return area;
  }
  
}
