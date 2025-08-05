
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

        
        int min=findMin(num1,num2,num3);

        System.out.println("The minimum number : "+min);
    }    
    public static int findMin(int num1, int num2, int num3){
        int min=num1;
        if(min>num2) min=num2; // here find minimum using if condition // here find minimum using if condition
        if(min>num3) min=num3;
        return min;
    }
}
