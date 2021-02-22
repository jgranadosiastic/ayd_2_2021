/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.unittesting.patronescreacion;

/**
 *
 * @author jose
 */
public enum MessageType {
    TXT("1"),
    EMAIL("2"),
    VOICE("3"),
    LETTER("4");
    
    private String number;

    private MessageType(String number) {
        this.number = number;
    }
    
    public static MessageType fromTxt(String op) {
        if (op.equals("1")) {
            return TXT;
        }
        return EMAIL;
    }
}
