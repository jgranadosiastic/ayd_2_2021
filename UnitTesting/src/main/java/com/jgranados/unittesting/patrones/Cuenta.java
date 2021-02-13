package com.jgranados.unittesting.patrones;

import java.time.LocalDate;

/**
 *
 * @author jose
 */
public class Cuenta implements Builder<Cuenta>{
    private int numero;
    private LocalDate fechaCreacion;
    private String nombre;
    private double monto;
    private String tipo;
    
    private String dato1;
    private String dato2;
    private String dato3;
    
    public Cuenta() {
        
    }
    
    public Cuenta(String dat1, String ddato2) {
        
    }
    
    public Cuenta(int numero, LocalDate fechaCreacion, String nombre, double monto, String tipo) {
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.nombre = nombre;
        this.monto = monto;
        this.tipo = tipo;
    }

    public Cuenta(int numero, LocalDate fechaCreacion, String nombre, double monto, String tipo, String dato1, String dato2, String dato3) {
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.nombre = nombre;
        this.monto = monto;
        this.tipo = tipo;
        this.dato1 = dato1;
        this.dato2 = dato2;
        this.dato3 = dato3;
    }

    
    
    public Cuenta(int numero, double monto) {
        this.numero = numero;
        this.monto = monto;
    }

    
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public Cuenta withNumero(int numero) {
        this.numero = numero;
        return this;
    }
    
    public Cuenta withFechaCreacion(LocalDate fecha) {
        this.fechaCreacion = fecha;
        return this;
    }
    
    public Cuenta withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    
    public Cuenta withTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }
    
    public Cuenta withMonto(double monto) {
        this.monto = monto;
        return this;
    }
    
    @Override
    public Cuenta build() {
        Cuenta cuenta = new Cuenta();
        cuenta.setFechaCreacion(this.fechaCreacion);
        cuenta.setMonto(this.monto);
        cuenta.setNumero(this.numero);
        cuenta.setTipo(this.tipo);
        cuenta.setNombre(this.nombre);
        return cuenta;
    }
    
    
}
