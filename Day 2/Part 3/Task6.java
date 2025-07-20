/*
 * 
 * 6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
‌
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). 
You must also not convert the inputs to integers directly.
‌
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
‌
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
‌
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
‌
Constraints:
1 <= num1.length, num2.length <= 10^4
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself.
‌
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number 1 : ");
        String num1 = sc.nextLine(); // get input from the user

        System.out.print("Enter the number 2 : ");
        String num2 = sc.nextLine(); // get input from user

        // here the method call return the sum of the two sumbers in string format
        System.out.println(sumOfTwoNumbers(num1,num2));
    }

    // this method will calculates the sum and store into the StringBuilder
    public static String sumOfTwoNumbers(String s, String t){
        StringBuilder res = new StringBuilder();
        int i=s.length()-1;
        int j=t.length()-1;
        int carry=0;
        while(i>=0 || j>=0){
            int num1 = i>=0 ? s.charAt(i--)-'0' : 0;
            int num2 = j>=0 ? t.charAt(j--)-'0' : 0;
            int sum = num1 + num2 + carry;
            res.append(sum%10);        
            carry = sum/10;
        }
        return res.reverse().toString();
    }
}
