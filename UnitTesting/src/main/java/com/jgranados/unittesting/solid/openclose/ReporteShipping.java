package com.jgranados.unittesting.solid.openclose;

/**
 *
 * @author jose
 */
public class ReporteShipping extends ReporteOrdenOP {

    private String direccion;
    
    public ReporteShipping(String cliente, int total, String direccion) {
        super(cliente, total);
        this.direccion = direccion;
    }
    
    public void imprimirReporte() {
        System.out.println("Envío:");
        System.out.println("Cliente:" + getCliente());
        System.out.println("Direccion:" + getDireccion());
        System.out.println("mas info sobre el envio.");
    }

    public String getDireccion() {
        return direccion;
    }
    
}
