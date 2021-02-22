package com.jgranados.unittesting.patronescreacion;

import java.time.LocalDate;

/**
 *
 * @author jose
 */
public class BuilderCuenta {
    
    private int numero;
    private LocalDate fechaCreacion;
    private String nombre;
    private double monto;
    private String tipo;
    
    private String dato1;
    private String dato2;
    private String dato3;
    
    public BuilderCuenta(int numero) {
        this.numero = numero;
    }
    
    public BuilderCuenta withNumero(int numero) {
        this.numero = numero;
        return this;
    }
    
    public BuilderCuenta withFechaCreacion(LocalDate fecha) {
        this.fechaCreacion = fecha;
        return this;
    }
    
    public BuilderCuenta withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    
    public BuilderCuenta withTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }
    
    public BuilderCuenta withMonto(double monto) {
        this.monto = monto;
        return this;
    }
    
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
