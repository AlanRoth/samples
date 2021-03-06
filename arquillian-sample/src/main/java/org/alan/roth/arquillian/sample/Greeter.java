/*
 * Copyright Payara Services Ltd
 */
package org.alan.roth.arquillian.sample;

import java.io.PrintStream;
import javax.inject.Inject;

/**
 *
 * @author asroth
 */
public class Greeter {
    
    private PhraseBuilder phraseBuilder;
    
    @Inject
    public Greeter(PhraseBuilder phraseBuilder){
        this.phraseBuilder = phraseBuilder;
    }
    
    public void greet(PrintStream to, String name) {
        to.println(createGreeting(name));
    }

    public String createGreeting(String name) {
        return phraseBuilder.buildPhrase("hello", name);
    }
    
}
