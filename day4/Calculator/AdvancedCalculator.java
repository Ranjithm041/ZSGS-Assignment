/*
 * 
 * --->AdvancedCalculator (Inherits from BasicCalculator):
Add 3 to 4 advanced mathematical operations, such as:
‌
--->power(int base, int exponent)
--->modulus(int a, int b)
--->squareRoot(double number)
 * 
 * 
 * 
 */


package com.day4.Calculator;


public class AdvancedCalculator extends BasicCalculator{

    // it will return the power of the base value
    public int power(int base, int exponent){
        int sum=1;
        for(int i=0;i<exponent;i++){
            sum=sum*base;
        }
        return sum;
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
    

    // it just a helper method for squareroot method
    private int getPerfectSquare(double number){
        for(int i=1;i<=number;i++){
           if(i*i==number) return i;
           else if(i*i>number) return i-1;
        }
        return 0;
    }

    // it will return the square root value
    public double squareRoot(double number){
        int perfectsquare=getPerfectSquare(number);
        double approximate=perfectsquare+((number-(perfectsquare*perfectsquare))/(2*perfectsquare));
        double squareRoot=approximate+(number-(approximate*approximate))/((2*approximate));
        return squareRoot;
    }
}
