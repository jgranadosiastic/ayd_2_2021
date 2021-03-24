/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.unittesting.solid.singler;

/**
 *
 * @author jose
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factura factura = new Factura("Cliente 1", 2, 100);
        MensajeroCorreos mensajero = new MensajeroCorreos();
        CalculadorRecargos calculadorRecargos = new CalculadorRecargos(2);
        System.out.println("Recargo:" + calculadorRecargos.calcularRecargo());
        mensajero.enviarFactura("Enviando factura", factura);
    }
    
}
