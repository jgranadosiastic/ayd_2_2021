/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.unittesting.patrones;

/**
 *
 * @author jose
 */
public interface Factory {
    
    Messenger build(MessageType type, String message);
    
    Messenger build(MessageType type, String message, int length);
}
