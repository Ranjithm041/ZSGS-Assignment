import java.util.Scanner;
/*
3. Write a program to do the following patterns using while loop?
a) 
        1
       2  3
      4  5  6
       7  8
        9
w 
w w
w w w 
w w
w
*/ 

public class Task3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int choice = 0; 

        do{
            System.out.println(
                "Enter 1 for print Number pattern \nEnter 2 for print character pattern \nEnter 0 for exit."
            );
            System.out.print("Enter the choice : ");
            choice = sc.nextInt(); // get choice from user

            switch(choice){ // executes based on the user choice
                case 1 :{
                    System.out.print("Enter the number of rows : ");
                    int rows = sc.nextInt();
                    numberPattern(rows); // this method call will print the X pattern
                    break;
                }
                case 2 :{
                    System.out.print("Enter the number of rows : ");
                    int rows = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the character : ");
                    char alphabet = sc.next().charAt(0);
                    charPattern(rows,alphabet); // this method call will print the R pattern
                    break;
                }
                case 0 :{
                    System.out.println("Exiting.....");
                    System.exit(0); // exit if user choice is 0
                }
                default :{
                    System.out.println("Invalid Choice ! ");
                }
            }
        }while(choice!=0);
    }

    // this method will print the the number pattern 
   public static void numberPattern(int rows) {
    int mid = rows / 2;
    int num = 1;

    // Upper half including middle
    int i = 0;
    while (i <= mid) {
        int k = rows - i;
        while (k > 0) {
            System.out.print(" ");
            k--;
        }

        int j = 0;
        while (j <= i) {
            System.out.printf("%3d",num++);
            j++;
        }
        System.out.println();
        i++;
    }

    // Lower half
    i = mid + 1;
    while (i > 0) {
        int k = 0;
        while (k < rows - i + 2) {
            System.out.print(" ");
            k++;
        }

        int j = 0;
        while (j < i - 1) {
            System.out.printf("%3d",num++);
            j++;
        }
        System.out.println();
        i--;
    }
}

    // this method will print either number or character based on flag
    public static void charPattern(int rows,char alphabet){
         rows = rows%2==0 ? rows/2: (rows/2)+1 ;
        int num=1;
        int i=1;
        while(i<=rows){
            int j=1;
            while(j<=i){
                 System.out.print(alphabet+" ");
                 j++;
            }
            System.out.println();
            i++;
        }
        i=rows; 
        int i_limit=(rows%2==0) ?1:2;
        while(i>=i_limit){
            int j_limit= (rows%2==0) ? i: i-1;
            int j=1;
            while(j<=j_limit){
                 System.out.print(alphabet+" ");
                 j++;
            }
             System.out.println();
             i--;
        }
    }
}
