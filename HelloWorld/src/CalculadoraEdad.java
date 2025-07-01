import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CalculadoraEdad {
    public static void main(String[] args) {
        Calendar fechAct = Calendar.getInstance();
        Date fechaA = fechAct.getTime();
        //System.out.println("fechaAct = " + fechAct);

        Scanner s = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Ingresa tu fecha de nacimiento con formato dd/mm/aaaa: ");


        try {
            Date fechaUsuario = formato.parse(s.next());
            //System.out.println("fechaUsuario = " + fechaUsuario);

            var dif = fechaA.getTime() - fechaUsuario.getTime();

            // Constantes
            long MILISEGUNDOS_POR_DIA = 24 * 60 * 60 * 1000;
            long MILISEGUNDOS_POR_ANO = 365 * MILISEGUNDOS_POR_DIA;

            // Cálculo
            long anos = dif / MILISEGUNDOS_POR_ANO;

            long diasMeses = (dif % MILISEGUNDOS_POR_ANO) / MILISEGUNDOS_POR_DIA;
            long meses = diasMeses/30;
            long diasRest = (diasMeses % 30);


            // Resultado
            if(anos >0){
                System.out.println(anos + " años y " + meses + " meses y "+ diasRest + " dias.");
            }else {
                System.out.println(meses + " meses y " + diasRest + " días.");
            }



        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
