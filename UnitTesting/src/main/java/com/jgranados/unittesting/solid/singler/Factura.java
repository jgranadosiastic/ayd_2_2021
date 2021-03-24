package com.jgranados.unittesting.solid.singler;

/**
 *
 * @author jose
 */
public class Factura {

    private String cliente;
    private int zona;
    private double total;

    public Factura(String cliente, int zona, double total) {
        this.cliente = cliente;
        this.zona = zona;
        this.total = total;
    }

    public double getTotal() {
        return total;
    }
    /*
    

    public double calcularRecargo() {
        switch (this.zona) {
            case 1:
                return 10.50;
            case 2:
                return 15.00;
            default:
                return 20.00;
        }
    }
    
    public void enviarFactura() {
        System.out.println("Factura enviada");
    }*/
    
}
