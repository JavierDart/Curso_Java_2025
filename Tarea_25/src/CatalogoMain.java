import com.jdart.tarea25.interfaces.IProducto;
import com.jdart.tarea25.modelos.*;
import com.jdart.tarea25.modelos.abstractos.*;
import com.jdart.tarea25.interfaces.*;

public class CatalogoMain {
    public static void main(String[] args) {
        IProducto[] productos = new Producto[6];

        productos[0] = new Iphone(1400, "Apple", "14", "Rojo");
        productos[1] = new Iphone(1600, "Apple", "15", "Oro");
        productos[2] = new TvLcd(1200, "LG", 65);
        productos[3] = new Libro(15, "A. Maiden", "The trooper", "Metal...");
        productos[4] = new Libro(35, "S. Mouth", "All Star", "Meme...");
        productos[5] = new Comics(25, "Jimi Hendrix", "All along the watchtower", "Mitic...", "Hendrix");

        for (IProducto producto : productos) {

            System.out.print("Tipo de producto: " + producto);
            System.out.print(" - ");
            System.out.print("Precio: " + producto.getPrecio());
            System.out.print(" - ");
            System.out.print("Precio final: " + producto.getPrecioVenta());

            // Para los Electronicos  ============
            if (producto instanceof IElectronico) {
                System.out.print(" - ");
                System.out.print("Fabricante: " + ((IElectronico) producto).getFabricante());

                // Para los IPhone ============
                if (producto instanceof Iphone) {
                    System.out.print(" - ");
                    System.out.print("Modelo: " + ((Iphone) producto).getModelo());
                    System.out.print(" - ");
                    System.out.print("Color: " + ((Iphone) producto).getColor());
                }

                // Para los LCD  ============
                if (producto instanceof TvLcd) {
                    System.out.print(" - ");
                    System.out.print("Pulgadas: " + ((TvLcd) producto).getPulgada());
                }
            }

            // Para los Libros  ============
            if (producto instanceof ILibro) {
                System.out.print(" - ");
                System.out.print("Titulo: " + ((ILibro) producto).getTitulo());
                System.out.print(" - ");
                System.out.print("Autor: " + ((ILibro) producto).getAutor());

                // Para los Comics  ============
                if (producto instanceof Comics) {
                    System.out.print(" - ");
                    System.out.print("Personaje: " + ((Comics) producto).getPersonaje());
                }

            }

            System.out.println();
        }
    }
}
