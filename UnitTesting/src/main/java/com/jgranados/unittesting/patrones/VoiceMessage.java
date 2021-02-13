package com.jgranados.unittesting.patrones;

/**
 *
 * @author jose
 */
public class VoiceMessage extends Message implements Messenger {
    protected int lengthMsg;

    public VoiceMessage(String message) {
        super(message);
    }

    public void setLengthMsg(int lengthMsg) {
        this.lengthMsg = lengthMsg;
    }

    
    @Override
    public void showMessage() {
        System.out.println("otra logica para voice: " + message);
    }

}
