/*

1. Write a program that creates an integer array of 10 elements, accepts values of arrays and 
Find the sum of all odd numbers.

*/ 
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10]; // here i created array with size of 10
        for(int i=0;i<array.length;i++){
            System.out.println("Enter the element : "+(i+1));
            array[i]=sc.nextInt();   // get input from user
        }
        int oddSum=0;
        for(int n:array) {
            if(n%2!=0) oddSum+=n; // sum the odd numbers
        }
        System.out.println("The odd sum is  : "+ oddSum);
    }
}
