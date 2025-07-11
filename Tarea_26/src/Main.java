import com.jdart.Tarea_26.modelos.*;

public class Main {
    public static void main(String[] args) {
        // Bolsa de Frutas
        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        bolsaFrutas.addProducto(new Fruta("Manzana", 0.5, "Roja", true));
        bolsaFrutas.addProducto(new Fruta("Banana", 0.3, "Amarilla", false));
        bolsaFrutas.addProducto(new Fruta("Naranja", 0.4, "Cítrica", true));
        bolsaFrutas.addProducto(new Fruta("Pera", 0.6, "Verde", false));
        bolsaFrutas.addProducto(new Fruta("Kiwi", 0.8, "Exótica", true));

        System.out.println("=== Bolsa de Frutas ===");
        for (Fruta fruta : bolsaFrutas.getProductos()) {
            System.out.println("Nombre: " + fruta.getNombre() +
                    ", Precio: " + fruta.getPrecio() +
                    ", Tipo: " + fruta.getTipo() +
                    ", Orgánica: " + fruta.isEsOrganica());
        }

        // Bolsa de Productos de Limpieza
        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        bolsaLimpieza.addProducto(new Limpieza("Detergente", 2.5, "Ropa", false));
        bolsaLimpieza.addProducto(new Limpieza("Lejía", 1.2, "Baño", true));
        bolsaLimpieza.addProducto(new Limpieza("Limpiacristales", 1.8, "Vidrios", false));
        bolsaLimpieza.addProducto(new Limpieza("Desinfectante", 3.0, "Superficies", true));
        bolsaLimpieza.addProducto(new Limpieza("Jabón", 1.0, "Manos", false));

        System.out.println("\n=== Bolsa de Limpieza ===");
        for (Limpieza producto : bolsaLimpieza.getProductos()) {
            System.out.println("Nombre: " + producto.getNombre() +
                    ", Precio: " + producto.getPrecio() +
                    ", Uso: " + producto.getUso() +
                    ", Tóxico: " + producto.isEsToxico());
        }

        // Bolsa de Lácteos
        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        bolsaLacteos.addProducto(new Lacteo("Leche", 1.1, 7, true));
        bolsaLacteos.addProducto(new Lacteo("Yogur", 0.9, 10, true));
        bolsaLacteos.addProducto(new Lacteo("Queso", 2.5, 30, true));
        bolsaLacteos.addProducto(new Lacteo("Mantequilla", 1.8, 20, true));
        bolsaLacteos.addProducto(new Lacteo("Crema", 1.6, 15, true));

        System.out.println("\n=== Bolsa de Lácteos ===");
        for (Lacteo lacteo : bolsaLacteos.getProductos()) {
            System.out.println("Nombre: " + lacteo.getNombre() +
                    ", Precio: " + lacteo.getPrecio() +
                    ", Días de caducidad: " + lacteo.getDiasCaducidad() +
                    ", Refrigerado: " + lacteo.isRefrigerado());
        }

        // Bolsa de No Perecibles
        BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<>();
        bolsaNoPerecibles.addProducto(new NoPerecible("Arroz", 1.0, 12, "Bolsa"));
        bolsaNoPerecibles.addProducto(new NoPerecible("Lentejas", 1.2, 10, "Caja"));
        bolsaNoPerecibles.addProducto(new NoPerecible("Conserva de atún", 2.0, 24, "Lata"));
        bolsaNoPerecibles.addProducto(new NoPerecible("Pasta", 1.1, 18, "Paquete"));
        bolsaNoPerecibles.addProducto(new NoPerecible("Harina", 0.9, 8, "Saco"));

        System.out.println("\n=== Bolsa de No Perecibles ===");
        for (NoPerecible producto : bolsaNoPerecibles.getProductos()) {
            System.out.println("Nombre: " + producto.getNombre() +
                    ", Precio: " + producto.getPrecio() +
                    ", Duración (meses): " + producto.getDuracionMeses() +
                    ", Tipo de envase: " + producto.getTipoEnvase());
        }
    }
}
