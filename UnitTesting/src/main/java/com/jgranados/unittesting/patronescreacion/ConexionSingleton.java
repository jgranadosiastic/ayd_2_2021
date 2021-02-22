package com.jgranados.unittesting.patronescreacion;

/**
 *
 * @author jose
 */
public class ConexionSingleton {
    
    private static ConexionSingleton instancia ;
    private String conexionValue = "unico";
    
    
    static {
        // logica compleja
        //conexionValue = "algo";
    }
    
    private ConexionSingleton(String val) {
        conexionValue = val;
    }
    
    public static ConexionSingleton getInstance(String value) {
        if (instancia == null) {
            instancia = new ConexionSingleton(value);
        }
        return instancia;
    }
    
    public String getConexionValue() {
        return instancia.conexionValue;
    }
    
    public void setConexionValue(String val) {
        this.conexionValue = val;
    }
    
}
