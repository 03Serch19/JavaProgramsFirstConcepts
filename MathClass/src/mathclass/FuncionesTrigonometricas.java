package mathclass;

public class FuncionesTrigonometricas {

    public static void main(String[] args) {
        double AnguloEnGrados = 45;
        double resultado = 0;

        double AnguloEnRadianes = Math.toRadians(AnguloEnGrados);
        //coseno
        resultado = Math.cos(AnguloEnRadianes);
        System.out.println("Coseno de " + AnguloEnGrados + "º es " + resultado);
        //seno
        resultado = Math.sin(AnguloEnRadianes);
        System.out.println("Seno de " + AnguloEnGrados + "º es " + resultado);
        //tangente
        resultado = Math.tan(AnguloEnRadianes);
        System.out.println("Tangente de " + AnguloEnGrados + "º es " + resultado);

        double valoringresado = 0.707;

        //arco coseno
        AnguloEnRadianes = Math.acos(valoringresado);
        AnguloEnGrados = Math.toDegrees(AnguloEnRadianes);
        System.out.println("Arcocoseno de " + valoringresado + " es " + AnguloEnGrados);
        //arco seno
       AnguloEnRadianes  = Math.asin(valoringresado);
        AnguloEnGrados = Math.toDegrees(AnguloEnRadianes);
        System.out.println("Arcoseno de " + valoringresado + " es " + AnguloEnGrados);
        //arco tangente
       AnguloEnRadianes = Math.atan(valoringresado);
        AnguloEnGrados = Math.toDegrees(AnguloEnRadianes);
        System.out.println("Arcotangente de " + valoringresado + " es " + AnguloEnGrados);

    }
}
