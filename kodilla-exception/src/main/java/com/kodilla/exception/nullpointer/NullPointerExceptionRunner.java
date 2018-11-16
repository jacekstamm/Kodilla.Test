package com.kodilla.exception.nullpointer;

import javax.jws.soap.SOAPBinding;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        User user = null;
        MessageSender messageSender = new MessageSender();

        try {
            messageSender.sendMesssageTo(user, "Hello!");
        } catch (MessageNotSentException e) {
            System.out.println("Message is not send, but my program still running very well!");
        }

        System.out.println("Processing other logic!");
    }
}
