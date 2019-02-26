/*
 * Copyright Payara Services Ltd
 */
package org.alan.roth.jsp.sample;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 *
 * @author asroth
 */
public class Calculator {
    
    public static final BigDecimal add(BigDecimal value1, BigDecimal value2){
        return value1.add(value2);
    }
    
    public static final BigDecimal divide(BigDecimal value1, BigDecimal value2){
        if(value2.equals(BigDecimal.ZERO)){
            return BigDecimal.ZERO;
        }
            return value1.divide(value2, new MathContext(6));
    }
    
    public static final BigDecimal multiply(BigDecimal value1, BigDecimal value2){
        return value1.multiply(value2);
    }
    
}
