import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[][] lenguajes = {
                {"java", "groovy"},
                {"php"},
                {"c#", "python", "groovy"},
                {"java", "javascript", "kotlin"},
                {"javascript"},
                {}
        };

        // Aplanar y eliminar duplicados
        List<String> resultado = Arrays.stream(lenguajes) // Stream<String[]>
                .flatMap(Arrays::stream)                     // Stream<String>
                .distinct()                                  // Eliminar duplicados
                .collect(Collectors.toList());               // Convertir a lista
        // Mostrar el resultado
        System.out.println(resultado);
    }
}
