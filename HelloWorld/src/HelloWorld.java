import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args){
        String saludo = "Hello World in Java";
        System.out.println(saludo);
        System.out.println("saludo.toUpperCase() = " + saludo.toUpperCase());

        int numero = 10;
        System.out.println("numero = " + numero);
        boolean valor = true;
        int num2;
        if (valor){
            System.out.println("valor = " + valor);
            num2 = 12;
            System.out.println("num2 = " + num2);
        }else{
            System.out.println("valor = " + valor);
            num2 = -1;
            System.out.println("num2 = " + num2);
        }

    }
}
