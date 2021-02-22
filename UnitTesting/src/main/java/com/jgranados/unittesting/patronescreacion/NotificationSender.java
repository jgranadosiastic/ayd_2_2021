package com.jgranados.unittesting.patronescreacion;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class NotificationSender {

    public static void main(String[] args) {
        Factory factory = new MessengerFactoryImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tipo mensaje: 1 o 2");
        String op = scanner.nextLine();
        
        Messenger msg = factory.build(MessageType.fromTxt(op), "mensaje1", 5);
        msg.showMessage();
    }
}
