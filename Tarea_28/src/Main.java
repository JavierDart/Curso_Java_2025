public class Main {
    public static void main(String[] args) {
        Thread hiloNumeros = new Thread(new AlfanumericoTarea(Tipo.NUMERO));
        Thread hiloLetras = new Thread(new AlfanumericoTarea(Tipo.LETRA));

        hiloNumeros.start();
        hiloLetras.start();
    }
}
