import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[100];
//        for (int i =0; i< arr.length; i++){
//            arr[i] = i+1;
//        }

        int[] arr = IntStream.rangeClosed(1,100).toArray(); //creamos arreglo
        //processamos arreglo:
        double suma = IntStream.of(arr)
                .filter(n -> n%10 !=0) //eliminamos divisibles por 10
                .mapToDouble(n -> n/ 2.0) //convertimos a double y dividimos entre 2
                .reduce(0.0, Double::sum); //Sumamos todos los elementos

        System.out.println("Resultado: "+suma);


    }
}
