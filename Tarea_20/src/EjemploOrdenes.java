import com.jdart.proyectoordencompra.modelos.Cliente;
import com.jdart.proyectoordencompra.modelos.OrdenCompra;
import com.jdart.proyectoordencompra.modelos.Producto;

import java.sql.SQLOutput;

public class EjemploOrdenes {
    public static void main(String[] args) {

        //Orden 1:
        Cliente cliente1 = new Cliente("Javier","Dart");
        Producto[] productos1 = new Producto[4];
        productos1[0] = new Producto("LG","TV",250);
        productos1[1] = new Producto("Lenovo","Portatil",450);
        productos1[2] = new Producto("Nox","Torre",2500);
        productos1[3] = new Producto("Hisense","TV",150);
        //Orden 2:
        Cliente cliente2 = new Cliente("Marcos","Martinez");
        Producto[] productos2 = new Producto[4];
        productos2[0]= new Producto("LG","Aire acondicionado",2150);
        productos2[1] = new Producto("LG","Pantalla",230);
        productos2[2] = new Producto("Xiaomi","Note 10",210);
        productos2[3] = new Producto("Xiaomi","Band 5",35);
        //Orden 3:
        Cliente cliente3 = new Cliente("Laura","Lopez");
        Producto[] productos3 = new Producto[4];
        productos3[0] = new Producto("Xiaomi","Aire acondicionado",1150);
        productos3[1] = new Producto("Xiaomi","Watch Active",45);
        productos3[2] = new Producto("Xiaomi","Note 12 pro",350);
        productos3[3] = new Producto("Xiaomi","Band 8",69);

        //Resultado:
        System.out.println("##################### CLIENTE 1 ####################");
        System.out.println("Nombre completo: "+ cliente1.getNombre()+ " "+cliente1.getApellido());
        System.out.println("---------------- Productos ----------------------------");
        for(Producto prod : productos1){
            System.out.println("Fabricante: "+prod.getFabricante());
            System.out.println("Nombre: "+prod.getNombre());
            System.out.println("Precio: "+prod.getPrecio() +"€");
            System.out.println("*******************************************");
        }
        System.out.println("/////////////////////// PRECIO TOTAL CLIENTE 1 /////////////////////////");
        System.out.println(OrdenCompra.granTotal(productos1) +"€");
        System.out.println("");

        System.out.println("##################### CLIENTE 2 ####################");
        System.out.println("Nombre completo: "+ cliente2.getNombre()+ " "+cliente2.getApellido());
        System.out.println("---------------- Productos ----------------------------");
        for(Producto prod : productos2){
            System.out.println("Fabricante: "+prod.getFabricante());
            System.out.println("Nombre: "+prod.getNombre());
            System.out.println("Precio: "+prod.getPrecio() +"€");
            System.out.println("*******************************************");
        }
        System.out.println("/////////////////////// PRECIO TOTAL CLIENTE 2 /////////////////////////");
        System.out.println(OrdenCompra.granTotal(productos2) +"€");
        System.out.println("");

        System.out.println("##################### CLIENTE 3 ####################");
        System.out.println("Nombre completo: "+ cliente3.getNombre()+ " "+cliente3.getApellido());
        System.out.println("---------------- Productos ----------------------------");
        for(Producto prod : productos3){
            System.out.println("Fabricante: "+prod.getFabricante());
            System.out.println("Nombre: "+prod.getNombre());
            System.out.println("Precio: "+prod.getPrecio() +"€");
            System.out.println("*******************************************");
        }
        System.out.println("/////////////////////// PRECIO TOTAL CLIENTE 3 /////////////////////////");
        System.out.println(OrdenCompra.granTotal(productos3) +"€");



    }
}
