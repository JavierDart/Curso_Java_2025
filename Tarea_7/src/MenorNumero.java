import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("¿Cuántos números deseas comparar? (mínimo 10): ");
        int cantidad = s.nextInt();

        if (cantidad < 10) {
            System.out.println("Debes ingresar al menos 10 números.");
            return;
        }

        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int numero = s.nextInt();

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("El número menor es: " + menor);

        if (menor < 10) {
            System.out.println("¡El número menor es menor que 10!");
        } else {
            System.out.println("El número menor es igual o mayor que 10.");
        }

        s.close();
    }
}
