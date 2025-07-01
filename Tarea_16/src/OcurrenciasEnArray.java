import java.util.Arrays;

public class OcurrenciasEnArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};

        Arrays.sort(numeros); // Ordenamos el array

        int numeroMasRepetido = numeros[0];
        int maxRepeticiones = 1;

        int contador = 1;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == numeros[i - 1]) {
                contador++;
            } else {
                if (contador > maxRepeticiones) {
                    maxRepeticiones = contador;
                    numeroMasRepetido = numeros[i - 1];
                }
                contador = 1;
            }
        }

        // Verificar al final del array
        if (contador > maxRepeticiones) {
            maxRepeticiones = contador;
            numeroMasRepetido = numeros[numeros.length - 1];
        }

        System.out.println("La mayor ocurrencias es: " + maxRepeticiones);
        System.out.println("El elemento que mas se repite es: " +  numeroMasRepetido);
    }
}
