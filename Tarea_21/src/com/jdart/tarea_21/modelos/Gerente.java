package com.jdart.tarea_21.modelos;

public class Gerente extends Empleado {
    Double presupuesto;

    public Gerente(double presupuesto, int empleadoId, double remuneracion, String numeroFiscal,
                   String nombre, String apellido, String direccion) {
        super(nombre,apellido,numeroFiscal,direccion,remuneracion,empleadoId);
        this.presupuesto=presupuesto;
    }


    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "Presupuesto total: " + presupuesto +"€\n "+super.toString();
    }
}
