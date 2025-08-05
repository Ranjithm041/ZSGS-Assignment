/*
 * --->ScientificCalculator (Inherits from AdvancedCalculator):
Add scientific functions, such as:
‌
--->sin(double angle)
--->cos(double angle)
--->log(double value)
--->exp(double value)
 * 
 * 
 * 
 */


package com.day4.Calculator;

public class ScientificCalculator extends AdvancedCalculator{

    // return the sin value
    public double sin(double angle){
        return Math.sin(angle);
    }

    //return the cos value
    public double cos(double angle){
        return Math.cos(angle);
    }

    //return the log value
    public double log(double value){
        return Math.log(value);
    }

    //return the exp value
    public double exp(double value){
        return Math.exp(value);
    }
}
