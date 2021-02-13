package com.jgranados.unittesting.patrones;

/**
 *
 * @author jose
 */
public class MessengerFactoryImpl implements Factory {

    @Override
    public Messenger build(MessageType type, String message) {
        switch (type) {
            case TXT:
                return new TextMessage(message);
            case EMAIL:
                return new EmailMessage(message);
            case VOICE:
                return new VoiceMessage(message);
            default:
                throw new AssertionError();
        }
    }

    @Override
    public Messenger build(MessageType type, String message, int length) {
        VoiceMessage msg = (VoiceMessage) build(type, message);
        msg.setLengthMsg(length);
        
        return msg;
    }

    
}
