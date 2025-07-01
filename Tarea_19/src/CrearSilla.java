import java.util.Scanner;

public class CrearSilla {
    public static void main(String[] args) {
        String valor = "1";
        String espacio = "0";
        int n;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Introduce el tamaño de la silla o h: ");
            n = s.nextInt();
        }while(n<=3);

        String[][] matrizS = new String[n][n];
        //Asiento: tamaño de la silla / 2, redondeado hacia arriba:
        int asiento = (int) Math.ceil(n/2);
        //Creamos la matriz Silla
        for (int i = 0; i < matrizS.length; i++) {
            for (int j = 0; j < matrizS[i].length; j++) {
                if(j==0){
                    matrizS[i][j] = valor;
                }else if(i==asiento){
                    matrizS[i][j] = valor;
                } else if (j==n-1 && i>asiento) {
                    matrizS[i][j] = valor;
                } else{
                    matrizS[i][j] = espacio;
                }
            }
        }
        // Mostrar la matriz
        System.out.println("Contenido de la matriz:");
        for (int i = 0; i < matrizS.length; i++) {
            for (int j = 0; j < matrizS[i].length; j++) {
                System.out.print(matrizS[i][j] + "");
            }
            System.out.println();
        }
    }
}
