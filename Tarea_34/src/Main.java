import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Producto(10.5, 2),
                new Producto(5.0, 5),
                new Producto(20.0, 1),
                new Producto(7.25, 3)
        );

        double total = productos.stream()
                .mapToDouble(p -> p.getPrecio() * p.getCantidad()) // Calcular importe por producto
                .sum(); // Sumar todos los importes

        System.out.println("El importe total es: " + total);
    }
}
