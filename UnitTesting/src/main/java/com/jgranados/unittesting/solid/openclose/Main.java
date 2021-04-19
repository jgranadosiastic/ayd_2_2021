package com.jgranados.unittesting.solid.openclose;

/**
 *
 * @author jose
 */
public class Main {

    public static void main(String[] args) {
        ReporteDeOrden reporteDeOrden = new ReporteDeOrden("cliente 1", 100, "la direccion");
        reporteDeOrden.imprimirReporteFactura();
        reporteDeOrden.imprimirReporteShipping();
        
        ReporteFactura reporteFactura = new ReporteFactura("cliente2", 200);
        reporteFactura.imprimirReporte();
        ReporteShipping reporteShipping = new ReporteShipping("cliente2", 200, "una direccion");
        reporteShipping.imprimirReporte();
    }
}
