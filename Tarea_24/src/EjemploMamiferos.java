import com.jdart.zoologico.modelos.abstractos.Canino;
import com.jdart.zoologico.modelos.abstractos.Felino;
import com.jdart.zoologico.modelos.abstractos.Mamifero;
import com.jdart.zoologico.modelos.concretos.*;

public class EjemploMamiferos {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[6];

        Mamifero leon = new Leon("Savana", 1.2, 2.5, 82.5, "Leonidus",
                5.5, 250, 190, 120.1);
        Mamifero tigre = new Tigre("Selva",158.2,3.5,350.1,"Tigrus",
                4.3,260,"felino");
        Mamifero lobo = new Lobo("Bosque", 0.95, 2.5, 70.6,
                "LobusMaximus", "Gris", 5.2);
        Mamifero perro = new Perro("casa", .25, 0.25,
                2.2, "bichi", "gris", .35);
        Mamifero tigreBengala = new Tigre("Bengala", 7.9, 7.2, 350.0,
                "Bengalus", 3.2,350,"Bengala");
        Mamifero guepardo = new Guepardo("savana", 130.0, 94.2, 94.0, "Gepardus",
                7.2,375);

        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = lobo;
        mamiferos[3] = perro;
        mamiferos[4] = tigreBengala;
        mamiferos[5] = guepardo;

        for (Mamifero animal : mamiferos) {

            System.out.println(" =============== " + animal.getClass().getSimpleName() + " =============== ");
            System.out.println("Habitat:" + animal.getHabitat());
            System.out.println("Altura:" + animal.getAltura());
            System.out.println("Largo:" + animal.getLargo());
            System.out.println("Peso:" + animal.getPeso());

            if (animal instanceof Canino) {
                System.out.println("Clomillos:" + ((Canino) animal).getTamanyoColmillos());
                System.out.println("Color:" + ((Canino) animal).getColor());

                if (animal instanceof Lobo) {
                    System.out.println("Especie Lobo:" + ((Lobo) animal).getEspecieLobo());
                    System.out.println("Número Integrantes:" + ((Lobo) animal).getNumCamada());
                }
                if (animal instanceof Perro) {
                    System.out.println("Fuerza mordida kg:" + ((Perro) animal).getFuerzaMordida());
                }
            }

            if (animal instanceof Felino) {
                System.out.println("Tamaño Garras:" + ((Felino) animal).getTamanyoGarras());
                System.out.println("Velocidad:" + ((Felino) animal).getVelocidad());

                if (animal instanceof Leon) {
                    System.out.println("Potencia Rugido:" + ((Leon) animal).getPotenciaRugido());
                    System.out.println("Número Integrantes:" + ((Leon) animal).getNumManada());
                }
                if (animal instanceof Tigre) {
                    System.out.println("especie Tigre:" + ((Tigre) animal).getEspecie());
                }
            }

            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
        }
    }
}
