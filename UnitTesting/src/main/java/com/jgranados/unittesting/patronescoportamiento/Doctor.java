package com.jgranados.unittesting.patronescoportamiento;

/**
 *
 * @author jose
 */
public class Doctor extends Empleado {

    public Doctor(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void trabajar() {
        tareaDoctor1();
        tareaDoctor2();
    }

    private void tareaDoctor1() {
        System.out.println("tarea d 1");
    }

    private void tareaDoctor2() {
        System.out.println("tarea d 2");
    }

}
