import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.YEAR, 3698);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_YEAR,25);
        calendario.set(Calendar.HOUR_OF_DAY,21);
        calendario.set(Calendar.MINUTE,54);
        calendario.set(Calendar.SECOND,10);
        Date fecha = calendario.getTime();
        System.out.println("Fecha = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        String fechaConFormato = formato.format(fecha);
        System.out.println("Fecha con formato = " + fechaConFormato);

        Calendar caleAct = Calendar.getInstance();
        Date fecha2 = caleAct.getTime();

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
    }
}
