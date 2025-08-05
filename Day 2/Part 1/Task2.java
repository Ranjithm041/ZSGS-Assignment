/*  2. Write a program to do the following patterns using for loop?

 1          1     
    1    1       
      1
    1    1        
 1          1   

R R R R R 
R       R 
R R R R R 
R     R   
R       R 

 */
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println(
                    "Enter 1 for print X pattern \nEnter 2 for print R pattern \nEnter 0 for exit."
            );
            System.out.print("Enter the choice : ");
            choice = sc.nextInt(); // get choice from user

            switch (choice) { // executes based on the user choice
                case 1: {
                    System.out.print("Enter the number of rows : ");
                    int rows = sc.nextInt();
                    System.out.print("Enter the number for print pattern : ");
                    int number = sc.nextInt();
                    xPattern(rows, number); // this method call will print the X pattern
                    break;
                }
                case 2: {
                    System.out.print("Enter the number of rows : ");
                    int rows = sc.nextInt();
                    sc.nextLine();
                    charPattern(rows); // this method call will print the R pattern
                    break;
                }
                case 0: {
                    System.out.println("Exiting.....");
                    System.exit(0); // exit if user choice is 0
                }
                default: {
                    System.out.println("Invalid Choice ! ");
                }
            }
        } while (choice != 0);
    }

    // this method will print the X pattern
    public static void xPattern(int rows, int number) {
        boolean flag = true;
        if (rows % 2 == 0) {
            System.out.println("The entered rows are not valid for this pattern ! \n enter only odd number rows !");
            flag = !flag;
        }
        if (flag) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows; j++) {
                    if (i == j || j == rows - i - 1) {
                        System.out.print(number + "  ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }

            // int i=0;
            // do{
            //     int j=0;
            //     do{
            //         if(i==j || j==rows-i-1){
            //             System.out.print(number+"  ");
            //         }else{
            //             System.out.print("   ");
            //         }
            //     }while(j++<rows);
            //     System.out.println();
            // }while(i++<rows-1);
        }
    }

    // this method will print the R pattern
    public static void charPattern(int rows) {
        boolean flag = true;
        if (rows % 2 == 0) {
            System.out.println("The entered rows are not valid for this pattern ! \n enter only odd number rows !");
            flag = !flag;
        }
        if (flag) {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= rows; j++) {
                    if (i == 1 || i == (rows / 2) + 1 || j == 1 || (j == rows && i < (rows / 2) + 1) || (i > (rows / 2) + 1 && i == j)) {
                        System.out.print("R ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            // int i=1;
            // do{
            //     int j=1;
            //     do{
            //        if(i==1 || i==(rows/2)+1 || j==1 || (j==rows && i<(rows/2)+1) || (i>(rows/2)+1 && i==j)){
            //            System.out.print(" R ");
            //        }else{
            //            System.out.print("  ");
            //        }
            //     }while(j++<rows);
            //     System.out.println();
            // }while(i++<rows);
        }
    }
}
