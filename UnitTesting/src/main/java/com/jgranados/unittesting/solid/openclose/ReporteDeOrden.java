package com.jgranados.unittesting.solid.openclose;

/**
 *
 * @author jose
 */
public class ReporteDeOrden {
    
    private String cliente;
    private int total;
    
    private String direccion;

    public ReporteDeOrden(String cliente, int total, String direccion) {
        this.cliente = cliente;
        this.total = total;
    }
    
    public void imprimirReporteFactura() {
        System.out.println("Factura:");
        System.out.println("Cliente:" + cliente);
        System.out.println("Total:" + total);
    }
    
    public void imprimirReporteShipping() {
        System.out.println("Envío:");
        System.out.println("Cliente:" + cliente);
        System.out.println("Direccion:" + direccion);
        System.out.println("mas info sobre el envio.");
    }

}
