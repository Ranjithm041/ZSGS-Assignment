// 7. Write a program to check if a number is a power of 2?

import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number : ");
        int val=sc.nextInt();

        boolean isPowerOfTwo =  powerOfTwo(val);
        System.out.println( isPowerOfTwo ? "Yes" : "No");
    }
    // here i check its power of two or not using recursion
    public static boolean powerOfTwo(int n){
        if(n==1) return true;
        if(n%2!=0)return false;
        return powerOfTwo(n/2);
    }
}
