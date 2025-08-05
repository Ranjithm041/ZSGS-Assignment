/*
 * 
 *
 *  3. Given a string s, reverse only all the vowels in the string and return it.
‌
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
‌
Example 1:
Input: s = "hello"
Output: "holle"
‌
Example 2:
Input: s = "leetcode"
Output: "leotcede"
‌
Constraints:
1 <= s.length <= 3 * 10^5
s consist of printable ASCII characters.
 * 
 * 
 * 
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String s = sc.nextLine(); // get input from user

        // this will print the exchanged string
        System.out.println("The exchanged string is : "+ exchangeString(s));
    }

    // this method will exchange the character based on the vowels
    public static String exchangeString(String s){
        char[] array = s.toCharArray();
        int left=0,right=s.length()-1;
        while(left<=right){
            if(isVowel(array[left])!=-1 && isVowel(array[right])!=-1){
                char temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }else if(isVowel(array[left])!=-1){
                right--;
            }else if(isVowel(array[right])!=-1){
                left++;
            }else{
                left++;
                right--;
            }
        }
        return new String(array);
    }
    
    private static int isVowel(char c){
        return "AEIOUaeiou".indexOf(c);
    }
}
