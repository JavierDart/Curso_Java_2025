import java.util.Scanner;

public class ProgramaOrdenarNumeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = s.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = s.nextInt();
        // Usando operador ternario para decidir el orden
        String resultado = (num1 > num2) ? num1 + " - " + num2 : num2 + " - " + num1;
        System.out.println("Números ordenados de mayor a menor: " + resultado);
        s.close();

    }
}
