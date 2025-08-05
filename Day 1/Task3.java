// 3. Write a program to find the maximum of two numbers using ternary operator.

public class Task3 {
    public static void main(String[] args) {
        int person1_age=23;
        int person2_age=22;

        int max_age= person1_age>person2_age ? person1_age : person2_age; //ternary operator
        
        System.out.println(max_age); // print the max age
    }
}
