package com.jgranados.unittesting.solid.singler;

/**
 *
 * @author jose
 */
public class MensajeroCorreos {

    public void enviarFactura(String mensaje, Factura factura) {
        System.out.println(mensaje);
        System.out.println("Promocion....");
        System.out.println("Total: " + factura.getTotal());
    }
}
