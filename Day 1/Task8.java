// 8. Write a program to find the first set bit of a number?

import java.util.Scanner;
public class Task8 {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int val = sc.nextInt();
        
        System.out.println(setBit(val));  

        System.out.println(recursion(val));
    }
    // here i used recursion to find setbit position
    static int recursion(int n){
        if(n<1) return 0;
        count++;
        if((n & 1)==1) return count;
        return recursion(n>>=1);
    }

    // here i used while loop to find setbit position
    static int setBit(int n){
        if(n<1) return 0;
        int count=0;
        int bit=1;
        while(true){
            count++;
            if((n & bit) ==1) return count;
            n>>=1;
        }
    }
}
