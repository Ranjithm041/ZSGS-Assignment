/*
 * 
 * 8. Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.
 * 
 */
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] peoplesAges  =  new int[10]; //declared the weights size of 10

        for(int i=0;i<peoplesAges.length;i++){
            System.out.print("Enter the person "+(i+1)+" age : ");
            peoplesAges[i]=sc.nextInt(); // get input from the user
        }

        categoriesAges(peoplesAges); // this method call will categories ages 

    }
    // this method will print the categories of peoples ages
    public static void categoriesAges(int[] peoplesAges){
        int belowEightTeen = 0;
        int EightTeenToSixty = 0;
        int aboveSixty = 0;

        for(int n : peoplesAges){
            if(n<18) belowEightTeen++;
            else if(n>=18 && n<=60) EightTeenToSixty++;
            else aboveSixty++;
        }

        System.out.println(
            "below 18 ages counts are : "+belowEightTeen+"\n"+
            "18 to 60 ages counts are : "+EightTeenToSixty+"\n"+
            "above 60 ages counts are : "+aboveSixty++
        );
    }
}
