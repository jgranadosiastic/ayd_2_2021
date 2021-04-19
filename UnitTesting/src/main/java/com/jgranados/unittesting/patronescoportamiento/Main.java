package com.jgranados.unittesting.patronescoportamiento;

/**
 *
 * @author jose
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado d = new Doctor("d1", 32);
        Administrador admin = new Administrador();
        admin.ejecutarTarea(d);
    }
    
}
