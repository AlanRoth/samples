/*
 * Copyright Payara Services Ltd
 */
package org.alan.roth.calculator.sample;

import java.math.BigDecimal;
import java.util.function.BiFunction;

/**
 *
 * @author asroth
 */
public class Calculator {
    
    public static final BigDecimal performCalculation(BigDecimal value1, BigDecimal value2, BiFunction<BigDecimal, BigDecimal, BigDecimal> function){
        return function.apply(value1, value2);
    }   
}
