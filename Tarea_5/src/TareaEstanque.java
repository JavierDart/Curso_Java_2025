import com.jdart.tarea5.modelos.Estanque;

import java.util.Scanner;

public class TareaEstanque {
    public static void main(String[] args) {

        Estanque tanque = new Estanque();
        tanque.setCapacidadMax(70.0); //Capacidad maxima del estanque

        //Preguntamos al usuario los litros actuales:
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la cantidad de litros actual del estanque: ");
        tanque.setCapacidadUsuario(s.nextDouble());

        //comprobamos y mostramos los mensajes segun la cantidad introducida:
        double max = tanque.getCapacidadMax();
        double us = tanque.getCapacidadUsuario();

        if(us > max){
            System.out.println("Error, la capacidad maxima del estanque es: "+max+" L. Introduce un valor menor o igual al máximo.");
        } else if (us == max) {
            System.out.println("Estanque lleno");
        } else if(us >= 60 && us <70){
            System.out.println("Estanque casi lleno");
        } else if (us >=40 && us<60) {
            System.out.println("Estanque  3/4");
        } else if (us >= 35 && us <40) {
            System.out.println("Medio Estanque");
        } else if (us >=20 && us < 35) {
            System.out.println("Suficiente");
        } else{
            System.out.println("Insuficiente");
        }
    }
}
