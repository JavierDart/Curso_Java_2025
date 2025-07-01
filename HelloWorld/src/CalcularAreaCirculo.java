import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo :");
        int radio =  s.nextInt();
        s.close();
        var pi = Math.PI;
        var area = pi * (radio * radio);
        System.out.println("El area del circulo es : "+area);
    }
}
