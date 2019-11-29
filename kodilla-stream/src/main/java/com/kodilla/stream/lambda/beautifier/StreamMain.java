package com.kodilla.stream.lambda.beautifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Jestem","Programista",(a,b)-> a+ " "+b);
        poemBeautifier.beautify("Lambda", "Test",((a, b) ->"ABC " +a+ " "+b+" ABC"));
        poemBeautifier.beautify("Wielkie", "Litery", ((a, b) -> a.toUpperCase()+ " " +b.toUpperCase()));
        poemBeautifier.beautify("MalE", "LiTEry",(a, b) -> a.toLowerCase()+ " "+b.toLowerCase());
        poemBeautifier.beautify("duze litery, ", "MALE LITERY",(a, b) -> a.toUpperCase()+ " "+ b.toLowerCase());
    }



}
