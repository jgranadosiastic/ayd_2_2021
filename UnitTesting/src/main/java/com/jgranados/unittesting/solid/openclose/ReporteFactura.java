package com.jgranados.unittesting.solid.openclose;

/**
 *
 * @author jose
 */
public class ReporteFactura extends ReporteOrdenOP {

    public ReporteFactura(String cliente, int total) {
        super(cliente, total);
    }
    
    public void imprimirReporte() {
        System.out.println("Factura:");
        System.out.println("Cliente:" + getCliente());
        System.out.println("Total:" + getTotal());
    }

}
