/*
 * 
 * 7. Given a string s, return the number of segments in the string.
‌
A segment is defined to be a contiguous sequence of non-space characters.
‌
Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
‌
Example 2:
Input: s = "Hello"
Output: 1
‌
Constraints:
0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:"
The only space character in s is ' '.
 * 
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Sentence : ");
        String sentence = sc.nextLine(); // get input from user

        // this method call will print the number of segment counts
        System.out.println(getNumberOfSegments(sentence));
    }

    // this method will calculates the space count
    public static int getNumberOfSegments(String s) {
    int count = 0;
    boolean inSegment = false;

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != ' ') {
            if (!inSegment) {
                count++;
                inSegment = true;
            }
        } else {
            inSegment = false;
        }
    }

    return count;
}
}
