package mathclass;

//import java.util.Scanner;

public class GradosToRadianes {

    public static void main(String[] args) {
      //  Scanner in = new Scanner(System.in);
      //  System.out.println("Ingrese el angulo en grados a convertir");
        double AnguloEnGrados = 45;//in.nextDouble();
        double AnguloEnRadianes = Math.toRadians(AnguloEnGrados);
        System.out.println("Deg a Rad ");
        System.out.println(+AnguloEnGrados + "º = " + AnguloEnRadianes + " Rad");
        
        //AnguloEnGrados = Math.toDegrees(AnguloEnRadianes); funciona aun sin esto
        System.out.println("Rad a Deg ");
        System.out.println(+AnguloEnRadianes + " Rad = " + AnguloEnGrados + "º");
    }
}
