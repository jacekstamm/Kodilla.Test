package com.kodilla.exception.nullpointer;

import javax.jws.soap.SOAPBinding;

public class MessageSender {

    public void sendMesssageTo(User user, String message) throws MessageNotSentException {
        if (user != null) {
            System.out.println("Sending message: " + message + " to: " + user.getName());
        } else {
            throw new MessageNotSentException();
        }
    }
}
