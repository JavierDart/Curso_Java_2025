package com.jdart.tarea_21.modelos;

public class Empleado extends Persona {
    Double remuneracion;
    int empleadoId;
    int aumentarRemuneracion;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion,
                    Double remuneracion,int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.empleadoId = empleadoId;
        this.remuneracion = remuneracion;
    }


    public Double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion += remuneracion * porcentaje/100;
    }

    @Override
    public String toString() {
        return "EMPLEADO: Id:" + empleadoId + ", remuneración actual:" + remuneracion +"€\n "+super.toString();
    }
}
