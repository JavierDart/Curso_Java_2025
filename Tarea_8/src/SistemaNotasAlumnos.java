import java.util.ArrayList;
import java.util.Scanner;

public class SistemaNotasAlumnos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Integer countNotasMay5 = 0;
        Integer countNotasMen4 = 0;
        Integer countNotas1 = 0;

        ArrayList<Double> notasMas5 = new ArrayList<>();
        ArrayList<Double> notasMen4 = new ArrayList<>();
        ArrayList<Double> totalNotas = new ArrayList<>();

        for (int i=1; i<=4; i++){
            System.out.println("Introduce la nota final del alumno "+i);
            Double nota = s.nextDouble();
            totalNotas.add(nota);
            if(nota <1 || nota >7){
                System.err.println("La nota a de ser entre 1 y 7");
                return;
            }
            if(nota >5){
                ++countNotasMay5;
                notasMas5.add(nota);
            }else if (nota <4) {
                ++countNotasMen4;
                notasMen4.add(nota);
            } else if (nota == 1) {
                ++countNotas1;
            }

        }
        double suma = 0;
        //Promedio notas superiores a 5:
        if(countNotasMay5>0){
            for (double numero : notasMas5) {
                suma += numero;
            }
            Double promedio5 = suma/countNotasMay5;
            System.out.println("Hay "+countNotasMay5+" notas superiores a 5, y el promedio de estas es "+promedio5+".");
        } else if (countNotasMen4>0) {
            //Promedio notas inferiores a 4:
            suma = 0;
            for (double numero : notasMen4) {
                suma += numero;
            }
            Double promedio4 = suma/countNotasMen4;
            System.out.println("Hay "+countNotasMen4+" notas inferiores a 4, y el promedio de estas es "+promedio4+".");
        } else if (countNotas1>0) {
            //cantidad de notas 1:
            System.out.println("Hay "+countNotas1+" notas con valor 1");
        }

        //Promedio total:
        suma = 0;
        for (double numero : totalNotas) {
            suma += numero;
        }
        Double promedioTotal = suma/ totalNotas.size();
        System.out.println("El promedio de las "+totalNotas.size()+" notas es : "+promedioTotal+" .");
    }
}
