public class AlfanumericoTarea implements Runnable {
    private Tipo tipo;

    public AlfanumericoTarea(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        switch (tipo) {
            case NUMERO:
                for (int i = 1; i < 10; i++) {
                    System.out.println("Número: " + i);
                }
                break;
            case LETRA:
                for (char c = 'A'; c <= 'Z'; c++) {
                    System.out.println("Letra: " + c);
                }
                break;
        }
    }
}
