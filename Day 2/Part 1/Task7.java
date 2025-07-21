/*
 * 
 * 7. Use both if and switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail”
 * 
 */
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a percentage : ");
        int percent = sc.nextInt();

        System.out.println("Using if-else : ");
        ifStatement(percent);

        System.out.println("Using switch case : ");
        switchStatement(percent);
    }

    // using if statement
    public static void ifStatement(int percent){
        // here i used if else condition statement
        if(percent>=85 && percent<=100) System.out.println("Grade A");
        else if(percent>=70)  System.out.println("Grade B");
        else if(percent>=50)  System.out.println("Grade C");
        else  System.out.println("Fail");
    }

    // using swtch statement
    public static void switchStatement(int percent){
        int val = percent/10;
        int rem = percent%10;
        val = (val==8 && rem<5 )? 7 : val;
        switch(val){
            case 10:
            case  9:
            case  8:{
                System.out.println("Grade A");
                break;
            }
            case 7:{
                System.out.println("Grade B");
                break;
            }
            case 6:
            case 5:{
                System.out.println("Grade C");
                break;
            }
            default :{
                System.out.println("Fail");
                break;
            }
        }
    }
}
