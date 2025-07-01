import com.jdart.tarea2.modelos.*;

import java.util.Locale;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        //Objetos:
        Factura factura = new Factura();
        Productos producto1 = new Productos();
        Productos producto2 = new Productos();

        //Reciba el nombre de la factura y descripción
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.US);
        System.out.println("Introduce nombre de Factura: ");
        factura.setNombre(s.nextLine());
        System.out.println("Introduce descripcion de la factura  "+factura.getNombre()+": ");
        factura.setDescripcion(s.nextLine());

        //Reciba 2 precios de productos de tipo double
        System.out.println("Introduce el nombre del producto 1: ");
        producto1.setNombre(s.nextLine());
        System.out.println("Introduce precio del producto "+producto1.getNombre()+": ");
        String input1 = s.nextLine().replace(",", ".");
        try{
            double precio1 = Double.parseDouble(input1);
            producto1.setPrecio(precio1);
        }catch (NumberFormatException e){
            System.err.println("Error: el valor introducido no es un número válido.");
        }


        s.nextLine(); // Limpiar el buffer

        System.out.println("Introduce el nombre del producto 2: ");
        producto2.setNombre(s.nextLine());
        System.out.println("Introduce precio del producto "+producto2.getNombre()+": ");
        String input2 = s.nextLine().replace(",", ".");
        try{
            double precio2 = Double.parseDouble(input1);
            producto2.setPrecio(precio2);
        }catch (NumberFormatException e){
            System.err.println("Error: el valor introducido no es un número válido.");
        }

        //Calcule el total:
        System.out.println(factura.calculaTotal(producto1.getPrecio(),producto2.getPrecio()));

    }

}
