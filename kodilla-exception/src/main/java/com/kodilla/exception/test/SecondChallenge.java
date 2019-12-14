package com.kodilla.exception.test;

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) throws Exception {
        try {
            if (x >= 2 || x < 1 || y == 1.5) {
            }
            return "Done!";

        } catch (Exception e) {
            throw new Exception();
        } finally {
            System.out.println("Still working! ");
        }
    }
}