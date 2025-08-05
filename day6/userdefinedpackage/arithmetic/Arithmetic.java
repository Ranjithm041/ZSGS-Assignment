/*
 * 
--- arithmetic: This package should include a class that defines methods to perform the following operations on two numbers:
a. Addition
b. Subtraction
c. Multiplication
d. Division
e. Modulo
 * 
 * 
 */

package com.day6.userdefinedpackage.arithmetic;

public class Arithmetic {

    // return the sum of two numbers
	public int add(int a, int b){
        return a+b;
    }

    // return subtrction of two numbers
	public int subtract(int a, int b){
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
    
    // it will return the modulus value
    public int modulus(int a, int b){
        try{
        if(b!=0) return a%b;
        }catch(ArithmeticException e){
        System.out.println("zero is not allowed");
        }
        return -1;
    }
    
}
