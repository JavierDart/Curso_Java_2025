import java.text.SimpleDateFormat;
import java.util.*;

public class GestionVuelos {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        List<Vuelo> vuelos = new ArrayList<>();

        // Agregar vuelos (ejemplo con algunos datos del Excel)
        vuelos.add(new Vuelo("AAL 933", "New York", "Santiago", sdf.parse("2021-08-29 05:39"), 62));
        vuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago", sdf.parse("2021-08-29 07:45"), 61));
        vuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago", sdf.parse("2021-08-31 15:15"), 29));
        vuelos.add(new Vuelo("AVA 241", "Bogota", "Santiago", sdf.parse("2021-08-31 14:05"), 25));
        // ... puedes agregar el resto de los vuelos aquí

        // Ordenar por fecha de llegada ascendente
        vuelos.sort(Comparator.comparing(Vuelo::getFechaLlegada));

        System.out.println("Vuelos ordenados por llegada:");
        vuelos.forEach(System.out::println);

        // Último vuelo en llegar
        Vuelo ultimo = Collections.max(vuelos, Comparator.comparing(Vuelo::getFechaLlegada));
        System.out.println("\nÚltimo vuelo en llegar:");
        System.out.println(ultimo);

        // Vuelo con menor número de pasajeros
        Vuelo menosPasajeros = Collections.min(vuelos, Comparator.comparingInt(Vuelo::getPasajeros));
        System.out.println("\nVuelo con menor número de pasajeros:");
        System.out.println(menosPasajeros);
    }
}
