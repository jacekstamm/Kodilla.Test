package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;

public class StreamMain {

    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("Ble ble..."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Zadanie 7.1");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Giełda Słów", text -> "ABC " + text + " ABC");
        poemBeautifier.beautify("Litwo Ojczyzno Moja! ", text -> text + text.toUpperCase());
        poemBeautifier.beautify("Zasady wywierania wpływu na ludzi", text -> text.toLowerCase());
        poemBeautifier.beautify("Przeszkoda czy wyzwanie?", text -> "Tytuł: " + text + " Rok wydania: 2016");
        poemBeautifier.beautify("Jazda! ", text -> text + text + text + text.toUpperCase());

        System.out.println("Using Stream to generate even nubers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
