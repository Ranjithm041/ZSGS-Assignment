// 6. Define a method to convert the decimal number to a binary number?

import java.util.Scanner;

public class Task6 {
    static StringBuilder binary=new StringBuilder();
    public static void main(String[] args) {
        Scannr sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int decimal = sc.nextInt(); // get input from the user

        decimalToBinary(decimal); // this method call converted the decimal to binary
        System.out.println(binary.reverse()); // print the binary value
    }

    // here the method will convert decimal to binary recursively 
    public static void decimalToBinary(int n){
        if(n==0) return;
        int bit=1;
        binary.append(n & bit);
        decimalToBinary(n >> 1);
    }
}
