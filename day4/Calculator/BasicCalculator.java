/*
 * 
 * Implement at least three basic arithmetic methods, such as:
‌
--->add(int a, int b)
--->subtract(int a, int b)
--->multiply(int a, int b)
--->divide(int a, int b)
 * 
 * 
 */

package com.day4.Calculator;


public class BasicCalculator {

    // return the sum of two numbers
    protected int add(int a, int b){
        return a+b;
    }

    // return subtrction of two numbers
    protected int subtract(int a, int b){
        return a-b;
    }

    // return the mutiplied values
    public int multiply(int a, int b){
        return a*b;
    }

    // return the division value
    public int divide(int a, int b){
        try{
        if(b!=0) return a/b;
        }catch(ArithmeticException e){
       System.out.println("Division zero is not allowed");
        }
        return -1;
    }
}
