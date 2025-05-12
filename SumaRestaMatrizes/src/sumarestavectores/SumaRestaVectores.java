package sumarestavectores;

public class SumaRestaVectores {

    public static void main(String[] args) {
        int matrizUno[][] = new int[3][3];
        int matrizDos[][] = new int[3][3];
        int matrizResultado[][] = new int[3][3];
        
    //llenado matriz uno
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno.length; j++) {
                matrizUno[i][j] = (int) (Math.random() * 6);
            }
        }
          //llenado matriz uno
        for (int i = 0; i < matrizDos.length; i++) { // se puede poner cualquier matriz dado que los espacios son los mismos
            for (int j = 0; j < matrizDos.length; j++) {
                matrizDos[i][j] = (int) (Math.random() * 6);
            }
        }
        //suma o resta de matrizes
        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado.length; j++) {
                matrizResultado[i][j] = matrizUno[i][j] + matrizDos[i][j];
                // matrizResultado[i][j] = matrizUno[i][j] - matrizDos[i][j];
                // matrizResultado[i][j] = matrizUno[i][j] * matrizDos[i][j];
            }
        }
          //imprimiendo matrizes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < matrizUno.length; j++) {
                System.out.print("[" + matrizUno[i][j] + "]");
            }

            if (i == 1) {
                System.out.print("   +  ");  
            } else {
                System.out.print("      ");
            }

            for (int j = 0; j < matrizDos.length; j++) {
                System.out.print("[" + matrizDos[i][j] + "]");
            }
            if (i == 1) {
                System.out.print("   =  ");
            } else {
                System.out.print("      ");
            }
            for (int j = 0; j < matrizResultado.length; j++) {
                System.out.print("[" + matrizResultado[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
