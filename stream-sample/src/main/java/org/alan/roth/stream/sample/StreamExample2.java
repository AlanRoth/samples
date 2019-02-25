/*
 * Copyright Payara Services Ltd
 */
package org.alan.roth.stream.sample;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author asroth
 */
public class StreamExample2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Caroll", 45),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39),
                new Person("Billy", "Smith", 17),
                new Person("Frank", "Davids", 18),
                new Person("Alan", "Roth", 18)
        );
        
        System.out.println("Using streams to format strings");
        people.stream()
                .collect(Collectors.groupingBy(p -> p.getAge()))
                .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));
        
        System.out.println("\nAverage age of the list");
        System.out.println(people.stream().collect(Collectors.averagingInt(P -> P.getAge())));
        
        System.out.println("\nFormatting with streams with a custom collector");        
        Collector<Person, StringJoiner, String> personCollector = 
                Collector.of(
                () -> new StringJoiner(" | "),
                        (j, p) -> j.add(p.getFirstName().toUpperCase()),
                        (j1, j2) -> j1.merge(j2),
                        StringJoiner::toString);
        
        System.out.println(people.stream().collect(personCollector));        
    }  
}
