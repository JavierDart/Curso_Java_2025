import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PalabraMasRepetida {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = s.nextLine();

        // Expresión lambda que devuelve un Map con la palabra más repetida
        Function<String, Map<String, Integer>> palabraMasRepetida = texto -> {
            // Contar ocurrencias de cada palabra
            Map<String, Long> conteo = Arrays.stream(texto.split("\\s+"))
                    .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

            // Encontrar la palabra con mayor frecuencia
            Map.Entry<String, Long> maxEntry = conteo.entrySet().stream()
                    .max(Map.Entry.comparingByValue())
                    .orElse(null);

            if (maxEntry != null) {
                return Collections.singletonMap(maxEntry.getKey(), maxEntry.getValue().intValue());
            } else {
                return Collections.emptyMap();
            }
        };

        // Aplicar la lambda
        Map<String, Integer> resultado = palabraMasRepetida.apply(frase);

        // Mostrar resultado
        resultado.forEach((palabra, cantidad) ->
                System.out.println("Palabra más repetida: \"" + palabra + "\" con " + cantidad + " repeticiones.")
        );
    }
}
