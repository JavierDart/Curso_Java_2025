import com.jdart.tarea23.modelos.Vendedor;

public class Tienda {
    public static void main(String[] args) {
        Vendedor[] vendedores = new Vendedor[2];
        vendedores[0]= new Vendedor("Dart","Javi",1,"Perecederos");
        vendedores[1] = new Vendedor("Belenguer", "Luis",2,"No perecederos");

        System.out.println("###################### VENDEDORES: ##########################");
        for(int i=0; i<vendedores.length; i++){
            System.out.println("Vendedor "+ (i+1) +": "+vendedores[i].toString()+"");
        }
        System.out.println();
    }
}
