/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.unittesting.solid.liskov;

/**
 *
 * @author jose
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura rectangulo = new Cuadrado(2);
        
        
        
        System.out.println("Area de figura es: " + rectangulo.calcularArea());
    }
    
}
