/*
 * Copyright Payara Services Ltd
 */
package org.alan.roth.jsf.sample;

import java.math.BigDecimal;
import javax.el.LambdaExpression;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author asroth
 */
@ManagedBean(name="cal")
@SessionScoped
public class Calculator {
    
    private BigDecimal lastValue;
    
    public BigDecimal performCalculation(BigDecimal value1, BigDecimal value2, LambdaExpression function){
        lastValue = (BigDecimal) function.invoke(value1, value2);
        return lastValue;
    }   

    public void setLastValue(BigDecimal newValue){
        lastValue = newValue;
    }
    
    public BigDecimal getLastValue(){
        return lastValue;
    }
    
}
