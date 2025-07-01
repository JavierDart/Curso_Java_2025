import java.util.Scanner;

public class NumeroMasAlto {
    public static void main(String[] args) {
        int[] arregloInt = new int[7];
        Scanner s = new Scanner(System.in);
        int i,max = 0;
        for (i=0; i< arregloInt.length; i++){
             max = arregloInt[0];
            do {//pides numero de nuevo
                System.out.println("Recuerda: ¡¡El numero debe de estar entre 11 y 99!!");
                System.out.println("Introduce un numero entero para la posicion "+i+" del arreglo:");
                arregloInt[i]=s.nextInt();
            }while(arregloInt[i]<11 || arregloInt[i]>99);

            //Numero mas alto:
            if (arregloInt[i]>max){
                max= arregloInt[i];
            }
        }
        System.out.println("El numero mas alto es: "+max);


    }
}
