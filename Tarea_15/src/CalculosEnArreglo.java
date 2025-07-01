import java.util.ArrayList;
import java.util.Scanner;

public class CalculosEnArreglo {
    public static void main(String[] args) {
        int[] arreglo = new int[7];
        Scanner s = new Scanner(System.in);
        int contPos = 0,contNeg=0,contCero = 0;
        int sumaPos = 0,sumaNeg = 0, sumaCeros =0;
        int i;
        for (i=0; i<arreglo.length; i++){
            System.out.println("Introduce valor para la posicion "+i+" del arreglo:");
            arreglo[i]=s.nextInt();
            if(arreglo[i] > 0){
                sumaPos += arreglo[i];
               contPos++;
            } else if (arreglo[i]==0) {
                contCero++;
            }else{
                sumaNeg += arreglo[i];
                contNeg++;
            }
        }
        if (contPos>0){
            //Promedio positivo:
            System.out.println("La media de numeros positivos da como resultado: "+sumaPos/contPos);
        }else{
            System.out.println("No hay numeros positivos");
        }
        if(contNeg>0){
            //Promedio Negativo:
            System.out.println("La media de numeros negativos da como resultado: "+sumaNeg/contNeg);
        }else {
            System.out.println("No hay numeros negativos");
        }
        if(contCero>0){
            //Cantidad de Zeros:
            System.out.println("La cantidad de 0 es: "+contCero);
        }else {
            System.out.println("No hay ceros.");
        }

    }
}
