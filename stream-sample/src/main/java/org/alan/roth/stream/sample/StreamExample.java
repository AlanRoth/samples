/*
 * Copyright Payara Services Ltd
 */
package org.alan.roth.stream.sample;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author asroth
 */
public class StreamExample {
    public static void main(String[] args) {        
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Caroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );
        
        System.out.println("\nPrinting with a for loop");
        for(int i = 0; i < people.size(); i++){
            System.out.println(people.get(i));
        }
        
        System.out.println("\nPrinting with a for in loop");
        for(Person p : people){
            System.out.println(p);
        }
        
        System.out.println("\nPrinting with a stream and lambda");
        people.stream().forEach(System.out::println);
        
        System.out.println("\nPrintign with stream and filter");
        people.stream().filter(p -> p.getLastName().startsWith("C")).forEach(System.out::println);
    }
}
