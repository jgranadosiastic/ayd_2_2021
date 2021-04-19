package com.jgranados.unittesting.solid.liskov;

/**
 *
 * @author jose
 */
public class Rectangulo extends Figura {
    private int alto;
    private int ancho;

    public Rectangulo(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    
    
    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public int calcularArea() {
        return alto * ancho;
    }
}
