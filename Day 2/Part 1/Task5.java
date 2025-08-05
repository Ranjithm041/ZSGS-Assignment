// 5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        
        System.out.println("The sum is : "+sumOfEvenNumbers(n)); // this method call return the sum of even numbersmbers
        
    }
    public static int sumOfEvenNumbers(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0) continue; // continue jump statement
            sum+=i;
        }
        return sum;
    }
}
