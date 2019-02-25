/*
 * Copyright Payara Services Ltd
 */
package org.alan.roth.arquillian.sample;

import java.text.MessageFormat;
import java.util.HashMap;
import javax.annotation.PostConstruct;

/**
 *
 * @author asroth
 */
public class PhraseBuilder {
    private HashMap<String, String> templates;
    
    public String buildPhrase(String id, Object... args){
        return MessageFormat.format(templates.get(id), args);
    }
    
    @PostConstruct
    public void initialize(){
        templates = new HashMap<String, String>();
        templates.put("hello", "Hello {0}!");
    }
    
}

