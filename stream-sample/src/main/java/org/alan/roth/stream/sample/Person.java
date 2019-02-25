/*
 * Copyright Payara Services Ltd
 */
package org.alan.roth.stream.sample;

import java.util.stream.Stream;

/**
 *
 * @author asroth
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    
    public Person(String firstName, String lastName, int age){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    @Override
    public String toString(){
        return "Name: " + getFirstName() + " " + getLastName() + " age: " + getAge();
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    Stream<Object> getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 }
