package com.jgranados.externo;

/**
 *
 * @author jose
 */
public class DataCuentaExterna {

    private int cuenta;
    private String nombreCliente;
    private double monto;

    public DataCuentaExterna(int cuenta, String nombre, double monto) {
        this.cuenta = cuenta;
        this.nombreCliente = nombre;
        this.monto = monto;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombre) {
        this.nombreCliente = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}
