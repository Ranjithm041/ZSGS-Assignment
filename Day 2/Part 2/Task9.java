
import java.util.Scanner;

/*
 * 
 * 9. Write an array which takes in roll no and marks in 3 subjects for 10 students.
 Format and Print the roll no, total marks and average for all students in a table form.
 * 
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students=10;
        int[] rollNumber = new int[students]; // here i declared the 1D array for students roll number
        float[][] marks  = new float[students][3]; // here i declared 2D array for each student 3 subject marks

        for(int i=0;i<students;i++){
            System.out.print("Enter the roll Number of a student "+(i+1)+" : ");
            rollNumber[i]=sc.nextInt(); // get roll number from the user
            for(int j=0;j<marks[0].length;j++){
                System.out.println("Enter the mark "+(j+1)+" : ");
                marks[i][j]=sc.nextFloat(); // get marks from the user
            }
        }

        printArray(rollNumber,marks);// this method call will print the array in the table format
    }
    
    public static void printArray(int[] rollNumber, float[][] marks){
        System.out.println(
            "______________________________________________________"+"\n"+
            "| Serial No. | Roll Number  |  Total Marks | Average |"+"\n"+
            "______________________________________________________"+"\n"
        );
        for(int i=0;i<rollNumber.length;i++){
            float totalMarks =0;
            float average = 0;
            for(int j=0;j<marks[0].length;j++){
                totalMarks+=marks[i][j];
            }
            average = totalMarks/marks[0].length;
            System.out.printf(
       "| %d          | %d          | %.2f       |  %.2f  |",(i+1),rollNumber[i],totalMarks,average
            );
            System.out.println("\n"+"______________________________________________________");
        }
    }
}
