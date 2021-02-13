package com.jgranados.unittesting;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author jose
 */
public class ElementoTest  {
    
    @Test
    public void testGetDato1() throws Exception {
        // arreange
        int dato1 = 5;
        Elemento test = new Elemento();
        test.setDato1(dato1);
        
        // act
        int result = test.getDato1();
        
        
        // assert
        assertEquals("", dato1, result);
    }
    
    
}
