import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Ingrese una fecha en formato dd/mm/yyyy : ");
        try{
            Date fecha = formato.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("formato = " + formato.format(fecha));

            Date fecha2 =new Date();
            if(fecha.after(fecha2)){
                System.out.println("Fecha del usuario es despues que fecha2");
            }else if(fecha.before(fecha2)){
                System.out.println("La fecha del usuario es anterior a la fecha2");
            }
            else{
                System.out.println("Fecha del usuario es igual que fecha2");
            }

            if(fecha.compareTo(fecha2) >0){
                System.out.println("Fecha del ususrio es despues que fecha2");
            } else if (fecha.compareTo(fecha2) <0) {
                System.out.println("La fecha del usuario es anterior a la fecha2");
            }else{
                System.out.println("Fecha del usuario es igual que fecha2");
            }

        }catch (ParseException e){
            e.printStackTrace();
        }

    }
}
