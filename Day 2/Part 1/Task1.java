
import java.util.Scanner;

// 1. Write a program that uses if statement to find the minimum of three numbers.

public class Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number 1 : ");
        int num1= sc.nextInt();

        System.out.println("Enter the number 2 : ");
        int num2= sc.nextInt();

        System.out.println("Enter the number 3 : ");
        int num3= sc.nextInt();

        // here find minimum using if condition
        int min=num1;
        if(min>num2) min=num2;
        if(min>num3) min=num3;

        System.out.println("The minimum number : "+min);
    }    
}
