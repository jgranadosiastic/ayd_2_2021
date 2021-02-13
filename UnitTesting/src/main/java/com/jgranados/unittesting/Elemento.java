package com.jgranados.unittesting;

/**
 *
 * @author jose
 */
public class Elemento {

    private int dato1;
    private String dato2;
    private Elemento2 e2;
    
    public int getDato1() {
        
        if (dato2.equalsIgnoreCase("valor") && e2.logicaSumar(5, 3) == 5) {
            dato1 = 1;
        } else {
            dato1 = 5;
        }
        return dato1;
    }

    public void setDato1(int dato1) {
        this.dato1 = dato1;
    }

    public String getDato2() {
        return dato2;
    }

    public void setDato2(String dato2) {
        this.dato2 = dato2;
    }
    
    public int logica1(int opcion) {
        if (opcion == dato1) {
            dato2 = "texto1";
        }
        dato2 = "texto2";
        return dato1 + opcion;
    }
    
    public void procedimiento(int x) throws Exception {
        /// muchas cosas
        // depende de e2
        e2.logicaSumar(5, 3);
        throw new Exception();
    }
}
