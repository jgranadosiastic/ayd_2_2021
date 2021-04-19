package com.jgranados.unittesting.solid.interfacesegregation;

/**
 *
 * @author jose
 */
public class CuidadorCuerdoOso implements BañadorOso, AlimentarOso {

    @Override
    public void bañarOso() {
        System.out.println("bañar");
    }

    @Override
    public void alimentarOso() {
        System.out.println("alimentar");
    }
    
}
