import java.util.Locale;
import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe el primer nombre");
        String nom1 = s.nextLine();
        System.out.println("Escribe el segundo nombre");
        String nom2 = s.nextLine();
        System.out.println("Escribe el tercer nombre");
        String nom3 = s.nextLine();

        //SEGUNDOS CARACTERES DE CADA NOMBRE
        char segCarac1 = Character.toUpperCase(nom1.charAt(1));
        char segCarac2 = Character.toUpperCase(nom2.charAt(1));
        char segCarac3 = Character.toUpperCase(nom3.charAt(1));

        //ULTIMOS DOS CARACTERES
        String ultimosDos1 = nom1.substring(nom1.length() - 2);
        String ultimosDos2 = nom2.substring(nom2.length() - 2);
        String ultimosDos3 = nom3.substring(nom3.length() - 2);

        //RESULTADOS
        String nuevo1 = segCarac1 + "." + ultimosDos1;
        String nuevo2 = segCarac2 + "." + ultimosDos2;
        String nuevo3 = segCarac3 + "." + ultimosDos3;

        System.out.println(nuevo1+"_"+nuevo2+"_"+nuevo3);
    }
}
