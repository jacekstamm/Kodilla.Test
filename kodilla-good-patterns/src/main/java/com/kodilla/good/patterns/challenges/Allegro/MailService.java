package com.kodilla.good.patterns.challenges.Allegro;

public class MailService implements InformationService {

    @Override
    public void inform(User user, Item item) {
        System.out.println("Sending mail to " + user + " to inform that order " + item + " is accepted.");
    }
}
