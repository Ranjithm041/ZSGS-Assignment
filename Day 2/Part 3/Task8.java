/*
 * 
 * 
 * 
8. We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "USA"
Output: true
‌
Example 2:
Input: word = "FlaG"
Output: false
‌
Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters.
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word : ");
        String word = sc.nextLine(); // get the input from user

        // it will print , if the word is valid true or false
        System.out.println(isValid(word));
    }

    // this method will check whether the string is valid or not 
    public static boolean isValid(String word){
        if(word.equals(word.toUpperCase())) return true;
        if(Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())) return true;        
        return false;
    }
}
