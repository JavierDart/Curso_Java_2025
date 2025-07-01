import java.util.List;
import java.util.Scanner;

public class OrdenarArreglo {
    public static void main(String[] args) {

        int[] arrayEnteros = new int[10];//cambiar a 10 al finalizar
        Scanner s = new Scanner(System.in);
        //System.out.println("Introduce 10 enteros:");
        for (int i = 0; i<arrayEnteros.length; i++){
            System.out.println("Introduce el entero "+i +":");
            arrayEnteros[i] = s.nextInt();
        }
        System.out.println("############### RESULTADO: ################");

        int max = arrayEnteros.length-1;
        for (int i=0; i<=4; i++){
            System.out.println(arrayEnteros[max-i]); //ultimo,penultimo,antepenultimo...
            System.out.println(arrayEnteros[i]);//primero,segundo,tercero..
        }

    }
}
