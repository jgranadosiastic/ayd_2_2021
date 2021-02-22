package com.jgranados.unittesting.patronescreacion;

/**
 *
 * @author jose
 */
public class TextMessage extends Message implements Messenger {
   
    public TextMessage(String message) {
        super(message);
    }
    
    @Override
    public void showMessage() {
        System.out.println("este es un text message: " + message);
    }
}
