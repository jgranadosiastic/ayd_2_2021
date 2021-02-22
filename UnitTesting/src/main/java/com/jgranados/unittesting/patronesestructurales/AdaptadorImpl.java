package com.jgranados.unittesting.patronesestructurales;

import com.jgranados.externo.DataCuentaExterna;
import com.jgranados.externo.ServicioExterno;

/**
 *
 * @author jose
 */
public class AdaptadorImpl implements Adaptador {

    private ServicioExterno servicioExterno = new ServicioExterno();
    
    @Override
    public Cliente adaptarACliente(int numeroCuenta) {
        DataCuentaExterna dataAAdaptar = servicioExterno.obtenerDatoCuentaExterna(numeroCuenta);
        Cliente adaptado = new Cliente(dataAAdaptar.getNombreCliente(), dataAAdaptar.getMonto());
        return adaptado;
    }

}
