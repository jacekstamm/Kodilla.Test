package com.kodilla.good.patterns.challenges.Allegro;

public interface InformationService {

    default void inform(User user) {
        System.out.println("Sending message to: " + user);
    }
}
