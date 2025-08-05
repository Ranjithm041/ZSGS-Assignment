package com.day4;
import com.day4.mystring.*;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String input1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String input2 = sc.nextLine();

        MyString str1 = new MyString(input1);
        MyString str2 = new MyString(input2);

        // 1. length()
        System.out.println("Length of str1: " + str1.length());

        // 2. charAt()
        System.out.println("Character at index 2 of str1: " + str1.charAt(2));

        // 3. equals()
        System.out.println("str1 equals str2? " + str1.equals(str2));

        // 4. toUpperCase()
        System.out.println("str1 toUpperCase: " + str1.toUpperCase());

        // 5. toLowerCase()
        System.out.println("str1 toLowerCase: " + str1.toLowerCase());

        // 6. substring(start, end)
        System.out.println("Substring of str1 (1 to 4): " + str1.substring(1, 4));

        // 7. substring(start)
        System.out.println("Substring of str1 from index 3: " + str1.substring(3));

        // 8. concat()
        System.out.println("Concatenation of str1 and str2: " + str1.concat(str2));

        // 9. contains()
        MyString sub = new MyString("lo"); 
        System.out.println("str1 contains 'lo'? " + str1.contains(sub));

        // 10. indexOf()
        System.out.println("Index of 'l' in str1: " + str1.indexOf('l'));

        // 11. replace()
        System.out.println("str1 after replacing 'l' with 'x': " + str1.replace('l', 'x'));

        sc.close();
    }
}
