package com.jgranados.externo;

/**
 *
 * @author jose
 */
public class ServicioExterno {

    public DataCuentaExterna obtenerDatoCuentaExterna(int numeroCta) {
        switch (numeroCta) {
            case 1:
                return new DataCuentaExterna(1, "Cliente1", 500);
            case 2:
                return new DataCuentaExterna(2, "Cliente2", 5500);
            default:
                throw new AssertionError();
        }
        
    }
}
