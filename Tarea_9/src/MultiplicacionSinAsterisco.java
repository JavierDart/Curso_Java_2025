import java.util.Scanner;

public class MultiplicacionSinAsterisco {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Pedir los dos números
        System.out.print("Introduce el primer número entero: ");
        int num1 = s.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int num2 = s.nextInt();

        // Determinar el signo del resultado
        boolean esNegativo = (num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0);

        // Usar valores absolutos para la multiplicación
        int a = Math.abs(num1);
        int b = Math.abs(num2);
        int resultado = 0;

        // Sumar 'a' b veces
        for (int i = 0; i < b; i++) {
            resultado += a;
        }

        // Aplicar el signo si es necesario
        if (esNegativo) {
            resultado = -resultado;
        }

        // Mostrar el resultado
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
