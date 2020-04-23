package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        System.out.println();
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is example text lambda ****");
        processor.execute(codeToExecute);
        processor.execute(() -> System.out.println("This is example text lambda - " +
                "przekazany wprost do argumentu metody execute"));

        System.out.println();
        System.out.println();

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println();
        System.out.println();

        System.out.println("Using Stream to generate even numbers from 1 to 20"); // z zadania o streamie modul 7.2
        NumbersGenerator.generateEven(20);

        System.out.println();
        System.out.println();

        People.getList().stream()                                // z zadania o stream w kolekjach 7.3.1
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);
        ;

        System.out.println();
        System.out.println();

        BookDirectory theBookDirectory = new BookDirectory();           //z zadania o stream 7.3.4
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);

        System.out.println();
        System.out.println();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        // System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println();
        System.out.println();

        BookDirectory theBookDirectoryy = new BookDirectory();          //z zadania o stream 7.3.6
        String theResultStringOfBooks = theBookDirectoryy.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);
    }
}
