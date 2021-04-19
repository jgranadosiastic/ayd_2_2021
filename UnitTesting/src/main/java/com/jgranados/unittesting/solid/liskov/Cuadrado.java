package com.jgranados.unittesting.solid.liskov;

/**
 *
 * @author jose
 */
public class Cuadrado extends Figura {

    /* con esto violamos el princiopio de liskov substitution. 
    public void setAlto(int alto) {
        super.setAlto(alto);
        super.setAncho(alto);
    }
    
    public void setAncho(int ancho) {
        super.setAlto(ancho);
        super.setAncho(ancho);
    }*/
    
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }
    
    

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public int calcularArea() {
        return lado * lado;
    }
    
    
}
