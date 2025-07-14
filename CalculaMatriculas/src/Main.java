public class Main {
    public static void main(String[] args) {
        int contadorSeries=0;
        int numeracion = 0;



        for (char i = 'A'; i <= 'Z'; i++) {
            for(char j = 'A'; j <= 'Z'; j++ ){
                for(char y = 'A'; y <= 'Z'; y++ ){
                    System.out.println(i+""+j+""+y);
                    contadorSeries++;
                }
            }
        }
        System.out.println("Series de letras:"+contadorSeries);
        System.out.println("Matriculas totales:"+contadorSeries*10000);


    }
}
