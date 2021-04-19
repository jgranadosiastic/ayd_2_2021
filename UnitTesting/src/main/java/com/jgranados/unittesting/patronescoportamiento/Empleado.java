package com.jgranados.unittesting.patronescoportamiento;

/**
 *
 * @author jose
 */
public abstract class Empleado {
    private String nombre;
    private int edad;
    private String cui;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public abstract void trabajar();

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    
}
