/*
 * Copyright Payara Services Ltd
 */
package org.alan.roth.lambda.sample1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author asroth
 */
public class LambdaExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Caroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );
        
        //Sort list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //Method that prints all elements in the list
        System.out.println("Printing all people");
        performWithCondition(people, p -> true, p -> System.out.println(p));
        //Method that prints all people that have last name beginning with C
        
        System.out.println("Printing people with last name beginning with C");
        performWithCondition(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
        System.out.println("Printing people with first name beginning with C");
        performWithCondition(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p.getFirstName()));
    }
    
    //Predicate and Consumer are functional interfaces from the java Function library.
    private static void performWithCondition(List<Person> people, Predicate<Person> condition, Consumer<Person> behaviour) {
        for (Person p : people) {
            if (condition.test(p)) {
                behaviour.accept(p);
            }
        }
    }
}
