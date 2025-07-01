public class Histograma {
    public static void main(String[] args) {
        int[] datos = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};
        int[] frecuencias = new int[6]; // Índices 0 a 5 representan los números 1 a 6

        // Contar frecuencias
        for (int numero : datos) {
            if (numero >= 1 && numero <= 6) {
                frecuencias[numero - 1]++;
            }
        }

        // Imprimir histograma
        for (int i = 0; i < frecuencias.length; i++) {
            System.out.print((i + 1) + ": ");
            for (int j = 0; j < frecuencias[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
