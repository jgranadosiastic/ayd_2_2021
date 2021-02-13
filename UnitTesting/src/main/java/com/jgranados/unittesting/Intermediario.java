package com.jgranados.unittesting;

/**
 *
 * @author jose
 */
public class Intermediario {

    private int dato1;
    private String dato2;
    
    private Elemento elemento;

    public Intermediario(int dato1, String dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
        
    }

    
    public int getDato1() {
        return dato1;
    }

    public void setDato1(int dato1) {
        this.dato1 = dato1;
    }
    
    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public String getDato2() {
        return dato2;
    }

    public void setDato2(String dato2) {
        this.dato2 = dato2;
    }
    
    public int logica1(int opcion) {
        if (elemento.getDato1() == opcion) {
            dato2 = "texto1";
        }
        try {
            elemento.procedimiento(5);
        } catch (Exception e) {
            dato1++;
        }
        
        return dato1 + opcion;
    }
    
    
}
