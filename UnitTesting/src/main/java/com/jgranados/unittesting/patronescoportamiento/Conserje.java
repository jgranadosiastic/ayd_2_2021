package com.jgranados.unittesting.patronescoportamiento;

/**
 *
 * @author jose
 */
public class Conserje extends Empleado {

    public Conserje(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void trabajar() {
        tareaC1();
    }
    
    private void tareaC1() {
        System.out.println("tarea c 1");
    }

}
