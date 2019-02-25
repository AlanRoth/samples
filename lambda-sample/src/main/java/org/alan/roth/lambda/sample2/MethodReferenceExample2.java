/*
 * Copyright Payara Services Ltd
 */
package org.alan.roth.lambda.sample2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.alan.roth.lambda.sample1.Person;

/**
 *
 * @author asroth
 */
public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Caroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );
        
        //Method that prints all elements in the list
        System.out.println("Printing all people");
        //Same as p -> System.out.println(p) or p -> method(p)
        performWithCondition(people, p -> true, System.out::println);  
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

