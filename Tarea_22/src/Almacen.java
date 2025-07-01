import com.jdart.tarea22.modelos.*;

public class Almacen {
    public static void main(String[] args) {
        Lacteo lacteos = new Lacteo("Leche",0.75,1,150);
        Lacteo lacteos2 = new Lacteo("Yogurt",0.25,1,110);
        Fruta fruta1 = new Fruta("Pera",1.1,0.25,"verde");
        Fruta fruta2 = new Fruta("Manzana",1.5,0.55,"Roja");
        Limpieza limp1 = new Limpieza("Legia",3.25,"bla, bla",1.5);
        Limpieza limp2 = new Limpieza("Quita olores",2.25,"bla, bla",0.5);
        NoPerecible np1 = new NoPerecible("Lentejas",1.36,142,500);
        NoPerecible np2 = new NoPerecible("Garbanzos",2.10,148,550);

        Producto[] productos = new Producto[8];
        productos[0] = fruta1;
        productos[1] = fruta2;
        productos[2] = lacteos;
        productos[3] = lacteos2;
        productos[4] = limp1;
        productos[5] = limp2;
        productos[6] = np1;
        productos[7] = np2;

        for(int i=0; i< productos.length; i++){
            System.out.println(productos[i].toString());
            System.out.println("##########################################");
        }

    }
}
