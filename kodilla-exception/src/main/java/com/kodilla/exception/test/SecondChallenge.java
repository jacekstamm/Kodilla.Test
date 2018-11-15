package com.kodilla.exception.test;

public class SecondChallenge {

    public String probablyIWillThrowException( double x, double y){
        try{
            if (x >= 2 || x < 1 || y == 1.5) {
                throw new Exception();
            }
        } catch (Exception ext) {
            System.out.println("System found ERROR! Check in one more time!\n" + "ERROR: " + ext);
        }
        return "Done!";
    }
}
