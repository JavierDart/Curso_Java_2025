import java.util.Scanner;

public class CrearX {
    public static void main(String[] args) {
        String valor = "X";
        String espacio = "_";
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la X: ");
        int n = s.nextInt();
        String[][] matrizX = new String[n][n];
        //Creamos la matriz x
        for (int i = 0; i < matrizX.length; i++) {
            for (int j = 0; j < matrizX[i].length; j++) {
                if(i==j){
                    matrizX[i][j] = valor;
                }else if(j==((n-1)-i)){
                    matrizX[i][j] = valor;
                }
                else{
                    matrizX[i][j] = espacio;
                }
            }
        }
        // Mostrar la matriz
        System.out.println("Contenido de la matriz:");
        for (int i = 0; i < matrizX.length; i++) {
                for (int j = 0; j < matrizX[i].length; j++) {
                    System.out.print(matrizX[i][j] + "");
                }
            System.out.println();
        }
    }
}
