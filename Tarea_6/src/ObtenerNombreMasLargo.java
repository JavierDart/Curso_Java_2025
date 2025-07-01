import javax.swing.*;

public class ObtenerNombreMasLargo {
    public static void main(String[] args) {

        String persona1 = JOptionPane.showInputDialog("Introduce el nombre completo de la primera persona:");
        String persona2 = JOptionPane.showInputDialog("Introduce el nombre completo de la segunda persona:");
        String persona3 = JOptionPane.showInputDialog("Introduce el nombre completo de la tercera persona:");
        String nombre1 = persona1.split(" ")[0];
        String nombre2 = persona2.split(" ")[0];
        String nombre3 = persona3.split(" ")[0];

        String resultado = (nombre1.length() >= nombre2.length() && nombre1.length() >= nombre3.length()) ? persona1
         : (nombre2.length() >= nombre3.length()) ? persona2: persona3;
        JOptionPane.showMessageDialog(null, resultado + " tiene el nombre más largo.");

    }
}
