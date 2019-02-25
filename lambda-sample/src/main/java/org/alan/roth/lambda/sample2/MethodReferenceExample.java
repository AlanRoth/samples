/*
 * Copyright Payara Services Ltd
 */
package org.alan.roth.lambda.sample2;

/**
 *
 * @author asroth
 */
public class MethodReferenceExample {
    public static void main(String[] args) {
        //MethodReferenceExample::printMessage is the same as doing () -> printMessage()
        Thread t = new Thread(MethodReferenceExample::printMessage);
        t.start();
    }
    
    public static void printMessage(){
        System.out.println("Hello");
    }
    
}
