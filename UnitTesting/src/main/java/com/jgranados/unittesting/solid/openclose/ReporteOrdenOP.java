package com.jgranados.unittesting.solid.openclose;

/**
 *
 * @author jose
 */
public class ReporteOrdenOP {
    private String cliente;
    private int total;

    public ReporteOrdenOP(String cliente, int total) {
        this.cliente = cliente;
        this.total = total;
    }

    public String getCliente() {
        return cliente;
    }

    public int getTotal() {
        return total;
    }
    
    
}
