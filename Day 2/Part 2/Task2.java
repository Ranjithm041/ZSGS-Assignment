// 2. Write a program to take in 10 values and print only those numbers which are prime.

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10]; // here i created array with size of 10

        for(int i=0;i<array.length;i++){
            System.out.println("Enter the element : "+(i+1));
            array[i]=sc.nextInt();   // get input from user
        }
        
        System.out.print("The below prime elements are :  ");
        for(int i=0;i<array.length;i++){
            if(isPrime(array[i])){
                System.out.print(array[i] + " "); // this will print the prime number
            }
        }
    }
    public static boolean isPrime(int n){
        if(n==2) return true;
        if(n<=1 || n%2==0) return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}
