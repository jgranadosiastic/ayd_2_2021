package com.jgranados.unittesting.solid.singler;

/**
 *
 * @author jose
 */
public class CalculadorRecargos {
    private int zona;

    public CalculadorRecargos(int zona) {
        this.zona = zona;
    }
    
    public double calcularRecargo() {
        switch (this.zona) {
            case 1:
                return 10.50;
            case 2:
                return 15.00;
            default:
                return 20.00;
        }
    }
}
