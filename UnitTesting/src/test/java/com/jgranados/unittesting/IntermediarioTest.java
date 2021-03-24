package com.jgranados.unittesting;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

/**
 *
 * @author jose
 */
public class IntermediarioTest {
/*
    @Test
    public void testLogica1WhenConditionTrue() {
        // arreange
        int dato1 = 5;
        Intermediario test = new Intermediario(dato1, "");
        Elemento elemento = new Elemento();
        elemento.setDato2("xx");
        test.setElemento(elemento);
        // arreange de data relacionada a e2

        // act
        int result = test.logica1(dato1);
        String testDato2 = test.getDato2();

        // assert
        assertEquals("mensaje cuando truena", "texto1", testDato2);
        assertEquals("mensaje cuando truena", 10, result);
    }*/

    @Test
    public void testLogica1WhenConditionTrueMockito() throws Exception {
        // arreange
        int dato1 = 5;
        Intermediario test = new Intermediario(dato1, "");
        Elemento elemento = Mockito.mock(Elemento.class);
        Mockito.when(elemento.getDato1()).thenReturn(dato1);
        test.setElemento(elemento);
        
        // act
        int result = test.logica1(dato1);
        String testDato2 = test.getDato2();

        // assert
        assertEquals("mensaje cuando truena", "texto1", testDato2);
        assertEquals("mensaje cuando truena", 10, result);
    }
    
    @Test
    public void testLogica1WhenConditionTrueAndExceptionMockito() throws Exception {
        // arreange
        int dato1 = 5;
        Intermediario test = new Intermediario(dato1, "");
        Elemento elemento = Mockito.mock(Elemento.class);
        Mockito.when(elemento.getDato1()).thenReturn(dato1);
        Mockito.doThrow(new Exception()).when(elemento).procedimiento(5);
        //Mockito.when(elemento.procedimiento(Matchers.anyInt())).thenThrow(new Exception());
        test.setElemento(elemento);
        
        // act
        int result = test.logica1(dato1);
        String testDato2 = test.getDato2();

        // assert
        assertEquals("mensaje cuando truena", "texto1", testDato2);
        assertEquals("mensaje cuando truena", 11, result);
    }
    
    @Test
    public void testLogica1WhenConditionTrueAndExceptionMockito2() throws Exception {
        // arreange
        Elemento2 el2 = new Elemento2();
        int dato1 = 5;
        Intermediario test = new Intermediario(dato1, "");
        Elemento elemento = Mockito.mock(Elemento.class);
        Mockito.when(elemento.getDato1()).thenReturn(dato1);
        Mockito.doThrow(new Exception()).when(elemento).procedimiento(Matchers.eq(5), Matchers.any());
        //Mockito.when(elemento.procedimiento(Matchers.anyInt())).thenThrow(new Exception());
        test.setElemento(elemento);
        
        // act
        int result = test.logica2(dato1, new Elemento2());
        String testDato2 = test.getDato2();

        // assert
        assertEquals("mensaje cuando truena", "texto1", testDato2);
        assertEquals("mensaje cuando truena", 11, result);
    }

}
