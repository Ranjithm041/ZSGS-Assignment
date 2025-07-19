import java.util.Scanner;
/*
3. Write a program to do the following patterns using while loop?
a) 1 b) w
1 w
2 3 w w
4 5 6 w w w
7 8 w w
9 w
*/ 

public class Task3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of rows : ");
        int num = sc.nextInt();
        System.out.println("If you want print the number enter Y/y else N/n : ");
        char flag=sc.next().charAt(0);
        boolean decision = flag=='Y' || flag=='y';
        printPattern(num,decision);
    }

    // this method will print either number or character based on flag
    static void printPattern(int val,boolean flag){
        int rows = val%2==0 ? val/2: (val/2)+1 ;
        char w='W';
        if(!flag){
            System.out.println("Enter the Character : ");
             w=sc.next().charAt(0);
        }
        int num=1;
        int i=1;
        while(i<=rows){
            int j=1;
            while(j<=i){
                 System.out.print(flag ? num++ +"   ": (char) w + " ");
                 j++;
            }
            System.out.println();
            i++;
        }
        i=rows; 
        int i_limit=(val%2==0) ?1:2;
        while(i>=i_limit){
            int j_limit= (val%2==0) ? i: i-1;
            int j=1;
            while(j<=j_limit){
                 System.out.print(flag? num++ +"   ": (char) w+ " ");
                 j++;
            }
             System.out.println();
             i--;
        }
    }
}
