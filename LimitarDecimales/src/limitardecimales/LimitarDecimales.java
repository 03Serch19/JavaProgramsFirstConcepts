package limitardecimales;

import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class LimitarDecimales {

    public static void main(String[] args) {
        double numero = 2;
        double raiz = Math.sqrt(numero);
        System.out.println("La raiz cuadrada de " + numero + " es: " + raiz);
        //utilizando la clase DecimalFormat
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("La raiz cuadrada de " + numero + " es: " + df.format(raiz));
        //utilizando String format
        System.out.println("La raiz cuadrada de " + numero + " es: " + String.format("%.5f", raiz));
        //utilizando la clase Math.round
        System.out.println("La raiz cuadrada de " + numero + " es: " + (double) Math.round(raiz * 1000d) / 1000);
        //Utilizando la calse BigDecimal
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println("La raiz cuadrada de " + numero + " es: " + bd.doubleValue());
    }

}
