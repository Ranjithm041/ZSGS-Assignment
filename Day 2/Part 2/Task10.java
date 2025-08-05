/*
 * 
 * 10. Write a menu driven program to do following operation on two dimensional array A of size m x n. 
You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x m

 * 
 * 
 */
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int m = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n]; // here i declared m X n matrix
        int choice =0;

        do{
           System.out.println("\n===== Matrix Operations Menu =====");
            System.out.println("1. Input elements into matrix");
            System.out.println("2. Display matrix");
            System.out.println("3. Sum of all elements");
            System.out.println("4. Row-wise sum");
            System.out.println("5. Column-wise sum");
            System.out.println("6. Transpose of matrix");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            // execute corresponding method based on the choice
            switch(choice){
                case 1:{
                    inputMatrix(matrix,sc);
                    break;
                }
                case 2:{
                    displayMatrix(matrix);
                    break;
                }
                case 3:{
                    sumOfElements(matrix);
                    break;
                }
                case 4:{
                    rowWiseSum(matrix);
                    break;
                }
                case 5:{
                    columnWiseSum(matrix);
                    break;
                }
                case 6:{
                    transposeMatrix(matrix);
                    break;
                }
                case 0:{
                    System.out.println("Exiting.....");
                    break;
                }
                default:
                    System.out.println("Invalid choice! ");
            }
        }while(choice != 0);

    }

    // this method will get input from the user
    private static void inputMatrix(int[][] matrix, Scanner sc) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.printf("Enter the matrix[%d][%d] element : ",i,j);
                matrix[i][j]=sc.nextInt();
            }
        }
    }

    // this method will print the matrix
    private static void displayMatrix(int[][] matrix) {
        System.out.println("Matrix : ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    // this method will calculates and print columnwise sum
    private static void columnWiseSum(int[][] matrix) {
        
        for(int i=0;i<matrix[0].length;i++){
            int sum =0;
            for(int j=0;j<matrix.length;j++){
                sum+=matrix[j][i];
            }
            System.out.println("The sum of column "+i+" is : "+ sum);
        }
    }

    // this method will print the transpose matrix without affecting the original array
    private static void transposeMatrix(int[][] matrix) {
        System.out.println("Matrix : ");
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[j][i]+"\t");
            }
            System.out.println();
        }
    }

    // this method will calculates the row wise sum of matrix
    private static void rowWiseSum(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            int sum =0;
            for(int j=0;j<matrix[0].length;j++){
                sum+=matrix[i][j];
            }
            System.out.println("The sum of row "+i+" is : "+ sum);
        }
    }

    // this method will print the sum of all elements 
    private static void sumOfElements(int[][] matrix) {
        int sum=0;
        for(int[] array : matrix){
            for(int n : array){
                sum+=n;
            }
        }
        System.out.println("The sum of all Elements : "+sum);
    }
    
}
