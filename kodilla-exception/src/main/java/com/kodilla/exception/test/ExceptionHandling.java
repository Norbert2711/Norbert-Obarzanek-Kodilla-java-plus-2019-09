package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "RESULT: ";
        try {
            result = secondChallenge.probablyIWillThrowException(1.8, 1.5);

        } catch (Exception e) {
            System.out.println("We have problem! " + e);

        } finally {
            System.out.println(result);
        }
    }
}
