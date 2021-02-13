package com.jgranados.unittesting.patrones;

/**
 *
 * @author jose
 */
public class EmailMessage extends Message implements Messenger {
    
    public EmailMessage(String message) {
        super(message);
    }
    
    @Override
    public void showMessage() {
        System.out.println("este es un email message: " + message);
    }
}
