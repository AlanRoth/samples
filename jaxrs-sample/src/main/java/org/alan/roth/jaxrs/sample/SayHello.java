/*
 * Copyright Payara Services Ltd
 */
package org.alan.roth.jaxrs.sample;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author asroth
 */
@RequestScoped
@Path("/hello")
public class SayHello {
    
    @GET
    public String sayHello(){
        return "Hello There";
    }
}
