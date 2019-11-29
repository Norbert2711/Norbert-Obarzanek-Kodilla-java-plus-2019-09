package com.kodilla.stream.lambda.beautifier;

public class PoemBeautifier {

    public void beautify(String a, String b, PoemDecorator poemDecorator) {

        String tekst = poemDecorator.beautify(a, b);
        System.out.println("tekst: " +tekst);

    }
}
