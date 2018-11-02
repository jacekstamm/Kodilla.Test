package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String text, PoemDecorator poemDecorator) {
        String resultPoem = poemDecorator.decorate(text);
        System.out.println(resultPoem);
        return resultPoem;
    }
}
