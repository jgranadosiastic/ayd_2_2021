package com.jgranados.unittesting.patronescoportamiento;

/**
 *
 * @author jose
 */
public class Enfermera extends Empleado {

    public Enfermera(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void trabajar() {
        tareaEnfermera1();
        tareaEnfermera2();
        tareaEnfermera3();
        tareaEnfermera4();
    }

    private void tareaEnfermera1() {
        System.out.println("tarea e 1");
    }

    private void tareaEnfermera2() {
        System.out.println("tarea e 2");
    }

    private void tareaEnfermera3() {
        System.out.println("tarea e 3");
    }

    private void tareaEnfermera4() {
        System.out.println("tarea e 4");
    }

}
