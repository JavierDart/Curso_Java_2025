import java.util.Scanner;
import java.util.function.Function;

public class LambdaEjemplo {
    public static void main(String[] args) {
        Function<String, String> limpiarYMayusculas = frase ->
                frase.replaceAll("[\\s,\\.]", "").toUpperCase();
        Scanner s = new Scanner(System.in);

        System.out.println("INTRODUCE UNA FRASE: ");
        String fraseOriginal = s.nextLine();
        String resultado = limpiarYMayusculas.apply(fraseOriginal);

        System.out.println("Resultado: " + resultado);
    }
}
