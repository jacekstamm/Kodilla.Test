package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0) {
            try{

            } catch (ArithmeticException x) {
                System.out.print("Something went WRONG! Error: " + x);
            } finally {
                System.out.println("Nie dziel przez 0! Zmień b!");
            }
        }
        return a / b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);
    }
}
