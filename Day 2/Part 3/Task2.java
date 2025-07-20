/*
 * 
 * 2. Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
‌
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
‌
Example 1:
Input: columnNumber = 1
Output: "A"
‌
Example 2:
Input: columnNumber = 28
Output: "AB"
‌
Example 3:
Input: columnNumber = 701
Output: "ZY"
‌
Constraints:
1 <= columnNumber <= 2^31 - 1
 * 
 * 
 */
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the column Number : ");
        int columnNumber = sc.nextInt(); // get the column Number from the user

        // this will print the particular column Title based on the user input
        System.out.println("The column Title is : "+getColumnTitle(columnNumber)); 
    }

    // This method will covert the column Number to column Title
    public static String getColumnTitle(int columnNumber){
        StringBuilder sb = new StringBuilder();
        while(columnNumber !=0){
            columnNumber--;
            char ch =(char) (columnNumber%26 +65);
            columnNumber/=26;
            sb.append(ch);
        }
        return sb.reverse().toString();
    }
}
