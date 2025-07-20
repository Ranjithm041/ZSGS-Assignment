/*
 * 
 * 1. Given two binary strings a and b, return their sum as a binary string.
Input: a = "11", b = "1"
Output: "100"
‌
Input: a = "1010", b = "1011"
Output: "10101"
‌
Constraints:
1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number 1 : ");
        String a = sc.nextLine(); // get input from the user

        System.out.print("Enter a binary number 2 : ");
        String b = sc.nextLine(); // get input from the user

        System.out.println("The binary sum is : "+binarySum(a, b)); // result

    }

    // this method will calculates the binary sum
    public static String binarySum(String a, String b){
        StringBuilder res = new StringBuilder();
        int carry =0;
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0 || j>=0 || carry==1){
            int bitA = i>=0 ? a.charAt(i--) - '0' : 0;
            int bitB = j>=0 ? b.charAt(j--) - '0' : 0;

            int sum = bitA ^ bitB ^ carry;
            carry = (bitA & bitB) | (bitA & carry) | (bitB & carry);

            res.append(sum);
        }
        return res.reverse().toString();
    }
}
