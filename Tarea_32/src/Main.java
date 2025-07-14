import java.util.function.Function;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] arr = IntStream.rangeClosed(1,10).toArray();

        Function<int[], Integer> obtenerMax = n ->
                IntStream.of(n)
                        .boxed()
                        .reduce(Integer::max)
                        .orElseThrow(()-> new RuntimeException("Arreglo vacio"));
        int maximo = obtenerMax.apply(arr);
        System.out.println("El numero maximo es: "+maximo);
    }

}
