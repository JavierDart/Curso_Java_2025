import com.jdart.tarea_21.modelos.Cliente;
import com.jdart.tarea_21.modelos.Empleado;
import com.jdart.tarea_21.modelos.Gerente;
import com.jdart.tarea_21.modelos.Persona;

public class Companyia {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(45500.0, 1, 1500.0, "156489A", "Paco",
                "Fiestas", "Inventada 123");
        gerente.aumentarRemuneracion(25);
        gerente.setPresupuesto(80500.25);
        System.out.println(gerente);
    }
}
