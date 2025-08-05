/*
 *
 *  4. Design a function void print( ) with a single dimensional array x[ ] and
    n (as size of the array) as function arguments. The function calculates 
    sum of only single digit and sum of only double digit elements from the array.
    Design a main() function to input size of the array ‘len' and 
    single dimensional array of size 'len', and print the required result by invoking the function print( ).
 * 
 * 
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the size of the array : ");
       int len = sc.nextInt(); // get size of the array
       int[] array =  new int[len];

       for(int i=0;i<array.length;i++){
            System.out.println("Enter the element : "+(i+1));
            array[i]=sc.nextInt();   // get input from user
       }
        
       print(array,len); // i just invoke the print() function
    }
    static void print(int[] x , int n){
        int singleDigitSum =0;
        int doubleDigitSum =0;

        //this loop will calculates the single digit sum and double digit sum
        for(int i=0;i<n;i++){
            if(x[i]<10) singleDigitSum+=x[i];
            if(x[i]>=10 && x[i]<=99) doubleDigitSum+=x[i];
        }
        System.out.println("Single Digit Sum = "+ singleDigitSum);
        System.out.println("Double Digit Sum = "+ doubleDigitSum);
    }
}
