/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.unittesting.patronesestructurales;

/**
 *
 * @author jose
 */
public class SistemaInterno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Adaptador adaptador = new AdaptadorImpl();
        Cliente unCliente = adaptador.adaptarACliente(1);
        
        System.out.println(unCliente.toString());
    }
    
}
